package application;

import java.util.List;

import ModelDao.DaoFactory;
import ModelDao.DepartmentDao;
import ModelDao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
   DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println(" === Test 1 : department findbyId ====");
		
		Department department = departmentDao.findById(5);
		
		System.out.println(department);
		
		

	//	iniciado //System.out.println("\n=== TEST 2: department findAll =====");
		//List<Department> list = departmentDao.findAll();
		//for (department d : list) {
		//	System.out.println(d);
	// a terminar	//}

	//	System.out.println("\n=== TEST 4: seller insert =====");
		//	Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		//	sellerDao.insert(newSeller);
		//	System.out.println("Inserted! New id = " + newSeller.getId());

		//	System.out.println("\n=== TEST 5: seller update =====");
		//	seller = sellerDao.findById(1);
		//	seller.setName("Martha Waine");
		//	sellerDao.update(seller);
		//	System.out.println("Update completed");

		//	System.out.println("\n=== TEST 6: seller delete =====");
		//System.out.println("Enter id for delete test: ");
		//int id = sc.nextInt();
		//sellerDao.deleteById(id);
		//System.out.println("Delete completed");
		
		//sc.close();

	}

}
