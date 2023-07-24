package application;

import java.util.Date;
import java.util.List;

import ModelDao.DaoFactory;
import ModelDao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

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
			
			System.out.println("\n=== Test 3 : seller findbyAllL ====");
			 list = sellerDao.findAll();
			for(Seller obj : list) {
				System.out.println(obj);
				
			System.out.println("\n=== Test 4 : seller Insert ====");
			
			Seller newseller = new Seller(null,"Jose dos santos", "jose@hotmail.com", new Date(), 4000.0, department);
			sellerDao.insert(newseller);
			System.out.println("Dados inseridos! Novo Id = " + newseller.getId());
		}
 
	}

}
