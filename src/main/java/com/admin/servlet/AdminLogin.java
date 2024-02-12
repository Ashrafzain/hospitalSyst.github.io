package com.admin.servlet;

import java.io.IOException;

import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {
private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		HttpSession session = req.getSession();
		if ("admin@gmail.com".equals(email) && "Asin0786".equals(password)) {
			session.setAttribute("adminObj", new User());
            resp.sendRedirect("admin/index.jsp");
	} 
		
		else {
			session.setAttribute("errorMsg", "invalid email & password");
            resp.sendRedirect("admin_login.jsp");
		}

	}

}
