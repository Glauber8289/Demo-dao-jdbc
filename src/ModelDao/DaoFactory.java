package ModelDao;

import Model_Dao.impl.DepartmentDaoJDBC;
import Model_Dao.impl.SellerDaoJDBC;
import db.DB;


public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
