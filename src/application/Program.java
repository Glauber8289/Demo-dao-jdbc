package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import ModelDao.DaoFactory;
import ModelDao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(" === Test 1 : seller findbyId ====");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== Test 2 : seller findbyDepartment ====");
		Department department = new Department(2,null);
		List <Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
			
			System.out.println("\n=== Test 3 : Seller findbyAllL ====");
			 list = sellerDao.findAll();
			for(Seller obj : list) {
				System.out.println(obj);
			}
			System.out.println("\n=== Test 4 : seller Insertt ====");
			
			Seller newseller = new Seller(null,"Jose dos santos", "jose@hotmail.com", new Date(), 4000.0, department);
			sellerDao.insert(newseller);
			System.out.println("Dados inseridos! Novo Id = " + newseller.getId());
			
			System.out.println("\n=== Test 5 : Seller Update ====");
			seller = sellerDao.findById(1);
			seller.setName("Marta Juliana");
			sellerDao.update(seller);
			System.out.println("Atualização completa");
			
			System.out.println("\n=== Test 6 : seller delete ====");
			System.out.println("Digite um id para realizarmos a exclusão ");
			int id = sc.nextInt();
			sellerDao.deleteById(id);
			System.out.println("Exclusão completa");
			sc.close();
			
			
	
	}

}
