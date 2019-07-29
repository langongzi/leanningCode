package lanqiaoJsp.org.lanqiao.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lanqiaoJsp.org.lanqiao.service.UserService;

@WebServlet("/admin/del")
public class userDele extends HttpServlet{

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uid = req.getParameter("uid");
		UserService userService = new UserService();
		int row = 0;
		try {
			row = userService.userDele(uid);
			req.getRequestDispatcher("/user/query").forward(req, res);
			if(row>0) {
			}
		}catch (Exception e) {
		}
	}
}
