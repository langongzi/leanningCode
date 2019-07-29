package lanqiaoJsp.org.lanqiao.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lanqiaoJsp.org.lanqiao.model.User;
import lanqiaoJsp.org.lanqiao.service.UserService;

@WebServlet("/admin/queryById")
public class UsersFindServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		UserService userService = new UserService();
		try {
			User user = userService.queryUserById(userId);
			req.setAttribute("user",user);
			req.getRequestDispatcher("/update.jsp").forward(req, resp);
		}catch (Exception e) {
			
		}
	}
}
