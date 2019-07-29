package lanqiaoJsp.org.lanqiao.service;

import java.util.List;

import lanqiaoJsp.org.lanqiao.dao.UserDao;
import lanqiaoJsp.org.lanqiao.model.User;

public class UserService {
	public User queryLogin(String uname,String upass) {
		UserDao userDao = new UserDao();
		User user = userDao.queryLogin(uname,upass);
		return user;
	}
	public List<User> userAll() {
		UserDao userDao = new UserDao();
		return userDao.userAll();
	}
	public User queryUserById(String id) {
		UserDao userDao = new UserDao();
		User user = userDao.queryById(id);
		return user;
	}
	public int userAdd(String userName,String password,String telphone,
			String address,String shopName,String status,String commit) {
		UserDao userDao = new UserDao();
		int row = userDao.userAdd(userName, password, telphone, address, shopName, status, commit);
		return row;
	}
	public int userDele(String uid) {
		UserDao userDao = new UserDao();
		return userDao.userDele(uid);
	}
	public int userUpdate(String uid,String uname,String password,String tel,String address,String shopName,String comment) {
		UserDao userDao = new UserDao();
		User user = new User();
		user.setUserId(uid);
		user.setUserUserName(uname);
		user.setUserPassword(password);
		user.setUserAddress(address);
		user.setUserTelphone(tel);
		user.setUserShopName(shopName);
		user.setUserComment(comment);
		userDao.userUpdate(user);
		int row = userDao.userUpdate(user);
		return row;
	}
}
