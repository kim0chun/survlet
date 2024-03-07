package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex03")
public class GetMethodEx03 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response ) throws IOException {
		//한글 깨짐 방지
		response.setContentType("text/json");  // 그냥 글자 		// Requst Parameter
		int number = Integer.parseInt(request.getParameter("number"));
		response.setCharacterEncoding("utf-8");
		
		// Request Parameter
		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
				
		PrintWriter out = response.getWriter();
		/*
		out.println("유저 아이디: " + userId);
		out.println("유저 네임: " + name);
		out.println("유저 나이: " + age);
		*/
		//JSON (Javascript Object Notation)으로 response 구성
		// {\"user_id":"maroiana", "name":"신보람", "age":30}
		out.print("{ \"user_id\": \"+ user_id + \", \"name\":
				+ name + \", \"age\":+ 30 + "}"");
	}
}
