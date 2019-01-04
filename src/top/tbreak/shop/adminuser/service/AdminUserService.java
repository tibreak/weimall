package top.tbreak.shop.adminuser.service;

import org.springframework.transaction.annotation.Transactional;

import top.tbreak.shop.adminuser.dao.AdminUserDao;
import top.tbreak.shop.adminuser.vo.AdminUser;
@Transactional
public class AdminUserService {
	// 注入Dao
	private AdminUserDao adminUserDao;

	public void setAdminUserDao(AdminUserDao adminUserDao) {
		this.adminUserDao = adminUserDao;
	}

	
	public AdminUser login(AdminUser adminUser) {
		return adminUserDao.login(adminUser);
	}
	
}
