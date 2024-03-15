package com.test.lesson04.Quiz02;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.lesson04.MysqlService;

@WebServlet("/lesson04/quiz02_delete")
public class DeleteQuiz02 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		MysqlService mysqlService = MysqlService.getInstance(); 
		mysqlService.connect(); // DB 연결

		// -- 쿼리 수행
		String deleteQuery = "delete from `bookmark` where id=" + id;
		try {
			mysqlService.update(deleteQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		mysqlService.disconnect(); // DB 해제

		// 목록 화면 이동
		response.sendRedirect("/lesson04/quiz02/bookmarkList.jsp");
	}
}
