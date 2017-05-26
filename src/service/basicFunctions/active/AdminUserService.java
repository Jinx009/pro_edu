package service.basicFunctions.active;

import database.models.active.AdminUser;

public interface AdminUserService {

	public AdminUser login(String userName,String pwd);
	
	public void updateAdminUser(AdminUser adminUser);
	
}
