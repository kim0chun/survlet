package com.test.lesson01;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Webservlet("/lesson01/quiz06")
public class GetMethodQuiz06 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response ) throws IOException {
		//응답 타입/인코딩
		//한글 깨짐 방지
		response.setContentType("text/json");
		response.setCharacterEncoding("utf-8");
		
		// Request Parameter 	
		String number1 = Intege.valueOf(request.GetParameter("number1");
		String number2 = Intege.valueOf(request.GetParameter("number2");	
		
		//Json출력
		// {"addtion":1570, "subtraction":1430, "multiplication":105000, "division":21}		
		out.print("{\"addtion\":" + (number1 + number2) );
		out.print(", \"subtraction\":" + (number1 - number2) );
		out.print( ", \"multiplication\":" + (number1 * number2)  );
		out.print(", \"division\":" + (number1 / number2) );
		out.print( + "}");
	}
}
