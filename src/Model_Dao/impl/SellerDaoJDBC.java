package Model_Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import ModelDao.SellerDao;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao{

	private Connection conn;
	
	public SellerDaoJDBC(Connection conn) {
		this.conn=conn;
	}
	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement st= null;
		ResultSet rs = null;
		
		try {
			st=conn.prepareStatement("Select seller.*,department.Name as DepName "
					+"FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id"
					+"WHERE seller.Id=?");
			st.setInt(1, id);
			rs = st.executeQuery();
		}
				
		
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}




	

}
