package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getMethodQuiz05 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response ) throws IOException {
		//응답 타입/인코딩
		//한글 깨짐 방지
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		// Requst Parameter
		int number = Integer.valueOf(request.getParameter("number"));
		
		//구구단 출력
		PrintWriter out = response.getWriter();
		out.print("<html><head> <title>구구단 </title> </head> <body> <ul> ");
		// 5 x 1 = 5
		for ( int = i ; i <=9 ; i++) {
			out.print("<li>"+ number + "X" + i + " = " + (number * i) +"</li>")
		}
		out.print("</ul> </body> </html>");
	}	
}
