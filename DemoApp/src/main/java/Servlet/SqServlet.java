package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		//REQUEST DISPATCHER 
		//int k = (int) req.getAttribute("k");
		
		
		// REDIRECT
		//int k = Integer.parseInt(req.getParameter("k"));
		
		//SESSION MANAGEMENT
		HttpSession session = req.getSession();
		int  k = (int) session.getAttribute("k");
		int  i = (int) session.getAttribute("i");
		int  j = (int) session.getAttribute("j");
		
		
		PrintWriter out = res.getWriter();
		out.println("Square Result in Session Management : "+k);
		out.println("Value of i : "+i);
		out.println("Value of j : "+j);
		
	}

}
