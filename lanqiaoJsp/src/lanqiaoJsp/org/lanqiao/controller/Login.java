package lanqiaoJsp.org.lanqiao.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lanqiaoJsp.org.lanqiao.model.User;
import lanqiaoJsp.org.lanqiao.service.UserService;

@WebServlet("/admin/login")
public class Login extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String uname = req.getParameter("username");
		String upass = req.getParameter("password");
		UserService userService = new UserService();
		try {
			User user = userService.queryLogin(uname, upass);
			if(user!=null) {
				List<User> list = userService.userAll();
//				resp.sendRedirect("/lanqiaoJsp/user/query");
				req.setAttribute("users",list);
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
			}else {
				req.setAttribute("loginErr","用户名或密码错误");
				req.getRequestDispatcher("/login.jsp").forward(req, resp);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
