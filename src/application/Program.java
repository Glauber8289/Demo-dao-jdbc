package application;

import ModelDao.DaoFactory;
import ModelDao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
 
	}

}
