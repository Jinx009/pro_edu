package database.basicFunctions.dao.active;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import database.common.BaseDaoImpl;
import database.models.active.AdminUser;

@Repository("adminUserDao")
public class AdminUserDaoImpl extends BaseDaoImpl<AdminUser> implements AdminUserDao{

	@SuppressWarnings("unchecked")
	public AdminUser login(String userName, String pwd) {
		String hql = " FROM AdminUser WHERE userName = '"+userName+"' AND pwd = '"+pwd+"' ";
		Query query = em.createQuery(hql);
		List<AdminUser> list = query.getResultList();
		if(list!=null&&!list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	public void updateAdminUser(AdminUser adminUser) {
		update(adminUser);
	}

}
