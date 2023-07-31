package application;

import java.util.List;
import java.util.Scanner;

import ModelDao.DaoFactory;
import ModelDao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println(" === Test 1 : department findbyId ====");
		
		Department department = departmentDao.findById(5);
		
		System.out.println(department);
		
		

	     System.out.println("\n=== TEST 2: department findAll =====");
          List<Department> list = departmentDao.findAll(); 
          for (Department d : list) {
			System.out.println(d);
	       }

		System.out.println("\n=== TEST 4: department insert =====");
			Department newDepartment = new Department(5, "Streaming");
			departmentDao.insert(newDepartment);
			System.out.println("Inserted! New id = " + newDepartment.getId());

				System.out.println("\n=== TEST 5: department update =====");
				Department dep2 = departmentDao.findById(1);
				dep2.setName("Computers");
				departmentDao.update(dep2);
			System.out.println("Update completed");

			System.out.println("\n=== TEST 6: department delete =====");
		    System.out.println("Enter id for delete test: ");
		    int id = sc.nextInt();
		    departmentDao.deleteById(id);
		    System.out.println("Delete completed");
		
		sc.close();

	}

}
