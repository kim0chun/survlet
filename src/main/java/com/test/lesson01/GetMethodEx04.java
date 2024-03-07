package com.test.lesson01;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex04")
public class GetMethodEx04 extends HttpServlet  {
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) {
		
		//한글 깨짐 방지
		response.setContentType("text/json");  // 그냥 글자 		// Requst Parameter
		int number = Integer.parseInt(request.getParameter("number"));
		response.setCharacterEncoding("utf-8");
		
		//
		/*
		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		out.print("userId:" +userId + "<br>");	
		*/
		// 테이블로ㅡ출력
		out.print("<html><head<title> 회원정보 </title></head><body>"); 
		out.print("<table broder=1>");
		out.print("<tr>   </tr>");
		out.print("</table></body></html>");
	}
}
