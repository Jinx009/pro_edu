package database.basicFunctions.dao.active;

import database.common.BaseDao;
import database.models.active.AdminUser;

public interface AdminUserDao extends BaseDao<AdminUser>{

	public AdminUser login(String userName,String pwd);
	
	public void updateAdminUser(AdminUser adminUser);
	
}
