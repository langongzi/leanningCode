package lanqiaoJsp.org.lanqiao.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lanqiaoJsp.org.lanqiao.service.UserService;

@WebServlet("/admin/update")
public class userUpdate extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("userId");
		String uname = req.getParameter("userUserName");
		String upass = req.getParameter("userPassword");
		String utel = req.getParameter("userTelphone");
		String address = req.getParameter("userAddress");
		String shopName = req.getParameter("userShopName");
		String comment = req.getParameter("userComment");
		System.out.println(uid+" "+uname);
		UserService userService = new UserService();
		int row = 0;
		try {
			row = userService.userUpdate(uid, uname, upass, utel, address, shopName, comment);
//			if(row>0) {
//				row = userService.userDele(uid);
				req.getRequestDispatcher("/user/query").forward(req, resp);
//			}
		}catch (Exception e) {
			
		}
	}
}
