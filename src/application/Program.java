package application;

import ModelDao.DaoFactory;
import ModelDao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		
<<<<<<< HEAD
=======
		Seller seller = new Seller(21, "bob", "bob@gmail", new Date(), 3000.00, obj);
		
>>>>>>> 24ec37d103fae216e689136718141c0e6370ec99
		System.out.println(seller);
		
 
	}

}
