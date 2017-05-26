package service.basicFunctions.active;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import database.basicFunctions.dao.active.AdminUserDao;
import database.models.active.AdminUser;

@Service("adminUserService")
public class AdminUserServiceImpl implements AdminUserService{
	
	@Autowired
	private AdminUserDao adminUserDao;

	public AdminUser login(String userName, String pwd) {
		return adminUserDao.login(userName, pwd);
	}

	public void updateAdminUser(AdminUser adminUser) {
		adminUserDao.update(adminUser);
	}

	
	
}
