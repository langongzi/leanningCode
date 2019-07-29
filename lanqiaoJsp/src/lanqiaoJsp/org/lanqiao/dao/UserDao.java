package lanqiaoJsp.org.lanqiao.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lanqiaoJsp.org.lanqiao.model.User;
import lanqiaoJsp.org.lanqiao.util.IdUtil;
import lanqiaoJsp.org.lanqiao.util.SqlUtil;
import lanqiaoJsp.org.lanqiao.util.StringTo;


public class UserDao {
	public User queryLogin(String uname,String upass) {
		String sql = "select * from user where USER_USER_NAME=? and USER_PASSWORD=? and USER_STATUS=1";
		ArrayList<Map<String, Object>> list = SqlUtil.executeQuery(sql,uname,upass);
		User user = null;
		if(list.size()>0) {
			user = new User();
			user.setUserId(StringTo.value(list.get(0).get("USER_ID")));
			user.setUserUserName(StringTo.value(list.get(0).get("USER_USER_NAME")));
			user.setUserShopName(StringTo.value(list.get(0).get("USER_SHOP_NAME")));
			user.setUserStatus(Integer.valueOf(StringTo.value(list.get(0).get("USER_STATUS"))));
		}
		return user;
	}
	public User queryById(String id) {
		String sql = "select * from user where USER_ID=?";
		ArrayList<Map<String, Object>> list = SqlUtil.executeQuery(sql,id);
		User user = null;
		if(list.size()>0) {
			user = new User();
			user.setUserId(StringTo.value(list.get(0).get("USER_ID")));
			user.setUserUserName(StringTo.value(list.get(0).get("USER_USER_NAME")));
			user.setUserAddress(StringTo.value(list.get(0).get("USER_ADDRESS")));
			user.setUserTelphone(StringTo.value(list.get(0).get("USER_TELPHONE")));
			user.setUserShopName(StringTo.value(list.get(0).get("USER_SHOP_NAME")));
			user.setUserComment(StringTo.value(list.get(0).get("USER_COMMENT")));
			user.setUserPassword(StringTo.value(list.get(0).get("USER_PASSWORD")));
			user.setUserStatus(Integer.valueOf(StringTo.value(list.get(0).get("USER_STATUS"))));
		}
		return user;
	}
	public List<User> userAll() {
		String sql = "select * from user where USER_STATUS=1 limit 0,30";
		List<Map<String, Object>> list = null;
		try {
			list = SqlUtil.executeQuery(sql);
		}catch (Exception e) {
			e.printStackTrace();
		}
		List<User> list1 = new ArrayList<User>();
		if(list.size()>0) {
			for(int i=0;i<list.size();i++) {
				User user = new User();
				user.setUserId(StringTo.value(list.get(i).get("USER_ID")));
				user.setUserUserName(StringTo.value(list.get(i).get("USER_USER_NAME")));
				user.setUserShopName(StringTo.value(list.get(i).get("USER_SHOP_NAME")));
				user.setUserTelphone(StringTo.value(list.get(i).get("USER_TELPHONE")));
				user.setUserStatus(Integer.valueOf(StringTo.value(list.get(i).get("USER_STATUS"))));
				user.setUserAddress(StringTo.value(list.get(i).get("USER_ADDRESS")));
				user.setUserComment(StringTo.value(list.get(i).get("USER_COMMENT")));
				user.setUserPassword(StringTo.value(list.get(i).get("USER_PASSWORD")));
				list1.add(user);
			}
		}
		return list1;
	}
	public int userAdd(String userName,String password,String telphone,
			String address,String shopName,String status,String commit) {
		String userId=IdUtil.getUuid();
		String sql = "insert into user(USER_ID,USER_USER_NAME,USER_PASSWORD,"
		+ "USER_TELPHONE,USER_ADDRESS,USER_SHOP_NAME,USER_COMMENT,USER_STATUS) values(?,?,?,?,?,?,?,?)";
		int row = 0;
		try {
			row = SqlUtil.executeUpdate(sql,userId,userName,password,telphone,address,shopName,commit,"1");
		}catch (Exception e) {
		
		}
		System.out.println(userName);
		System.out.println(row);
		return row;
	}
	public int userDele(String uid) {
		String sql = "update user set USER_STATUS=0 where USER_ID=?";
		int row = 0;
		try {
			row = SqlUtil.executeUpdate(sql,uid);
		}catch (Exception e) {
			
		}
		return row;
	}
	public int userUpdate(User user) {
		String sql = "update user set USER_USER_NAME=?,"
				+ "USER_PASSWORD=?,USER_TELPHONE=?,USER_ADDRESS=?,"
				+ "USER_SHOP_NAME=?,USER_COMMENT=? where USER_ID=?";
		int row = 0;
		try {
			System.out.println(user.toString());
			row = SqlUtil.executeUpdate(sql,user.getUserUserName(),user.getUserPassword(),user.getUserTelphone(),
					user.getUserAddress(),user.getUserShopName(),user.getUserComment(),user.getUserId());
		}catch (Exception e) {
			
		}
		return row;
	}
}
