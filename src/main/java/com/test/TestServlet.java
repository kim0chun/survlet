package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;         // Ctrl + Shift + "o"
import javax.servlet.http.HttpServletRequest;  // Ctrl + Shift + "o"
import javax.servlet.http.HttpServletResponse; // Ctrl + Shift + "o"

public class TestServlet extends HttpServlet {

	@Override  // 반드시 무조건 둘 것
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello world!");  
	}
}


 