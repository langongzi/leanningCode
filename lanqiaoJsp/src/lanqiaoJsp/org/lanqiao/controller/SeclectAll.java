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

@WebServlet("/user/query")
public class SeclectAll extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			UserService userService = new UserService();
			List<User> list = userService.userAll();
			req.setAttribute("users",list);
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
