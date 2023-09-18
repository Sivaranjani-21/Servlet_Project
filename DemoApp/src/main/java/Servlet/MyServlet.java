package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out = res.getWriter();
		out.println("Hi<br> ");
		
		//SERVLET CONTEXT - can be used for all Servlets (common)
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.println("This is Genneral : "+str+"<br>");
		
		//SERVLET CONFIG - used differently for diff servlet
		ServletConfig cg = getServletConfig();
		String str1 = cg.getInitParameter("name");
		out.println("This is for particular servlet : "+str1);
		
		
	}

}
