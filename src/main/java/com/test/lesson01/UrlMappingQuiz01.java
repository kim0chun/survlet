package com.test.lesson01;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response ) throws IOException {
		//한글 깨짐 방지
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		//날짜
		Date date = new Date();
		
		// 2024-02-29 오후 19:24:30
		// Formatter 출력
		SimpleDateFormat sdf = new SimpleDateFormat
				("오늘 날짜는 yyyy년 MM월 dd일 ");
		out.println(sdf.format(now));
	}
}
