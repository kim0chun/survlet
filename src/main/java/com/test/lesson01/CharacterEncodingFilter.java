package com.test.lesson01;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/*")
public class CharacterEncodingFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request,
			ServletResponse response, FilterChain chain) throws IOException , ServletException{
		
		// 필터통과시 인코딩 설정
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		chain.doFilter(request, response);
		
	}

}
