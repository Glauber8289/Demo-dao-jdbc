package application;

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
			
			System.out.println("\n=== Test 3 : seller findbyAll ====");
			 list = sellerDao.findAll();
			for(Seller obj : list) {
				System.out.println(obj);
		}
 
	}

}
