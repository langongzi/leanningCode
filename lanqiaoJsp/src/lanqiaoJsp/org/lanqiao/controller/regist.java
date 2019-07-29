package lanqiaoJsp.org.lanqiao.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lanqiaoJsp.org.lanqiao.service.UserService;

@WebServlet("/admin/regist")
public class regist extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String userName = req.getParameter("username");
		String userPassword = req.getParameter("password");
		String userTelphone = req.getParameter("tel");
		String userAddress = req.getParameter("address");
		String userShopName = req.getParameter("shopname");
		String userComment = req.getParameter("comment");
		UserService userService = new UserService();
		try {
			int row = userService.userAdd(userName, userPassword, userTelphone, userAddress, userShopName, userShopName, userComment);
			System.out.println("注册");
			if(row>0) {
				resp.sendRedirect(req.getContextPath()+"/admin/login");
			}else {
				req.setAttribute("registErr","注册失败");
				req.getRequestDispatcher("/regist.jsp").forward(req, resp);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
