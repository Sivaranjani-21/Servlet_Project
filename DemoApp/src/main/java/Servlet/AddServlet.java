package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet
{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		k = k*k;
		
		/*REQUEST DISPATCHER
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		req.setAttribute("k", k);*/
		
		//REDIRECTING
		//res.sendRedirect("sq?k="+k);
		
		//SESSION MANAGEMENT
		HttpSession session = req.getSession();
		res.sendRedirect("sq");
		session.setAttribute("k", k);
		session.setAttribute("i", i);
		session.setAttribute("j", j);
		
		//PrintWriter out = res.getWriter();
		//out.println("Add Result : "+k);
	}
}
