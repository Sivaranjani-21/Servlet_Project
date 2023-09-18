package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet1 extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		k = k*k;
		
		//COOKIES
		Cookie cookie = new Cookie("k", k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq1");
		
		PrintWriter out = res.getWriter();
		out.println("Add Result : "+k);
	}
}
