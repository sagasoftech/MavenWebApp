package com.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumbers extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int result = num1 + num2;
		
		PrintWriter out = res.getWriter(); 
		out.println("Result: "+ result);
	}

}
