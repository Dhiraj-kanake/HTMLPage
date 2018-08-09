package com.jda;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserServlet extends GenericServlet{
public void service(ServletRequest req,ServletResponse res) 
{
	System.out.println(req.getParameter("name"));
	System.out.println(req.getParameter("Email"));
	System.out.println(req.getParameter("number"));
	System.out.println(req.getParameter("password"));
}
}
