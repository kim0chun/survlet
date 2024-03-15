package com.test.lesson04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.MysqlService;



@WebServlet("/lesson04/ex01")
public class Lesson04Ex01 extends HttpServlet {

	@Override
    public void doGet(HttpServletRequest request, 
    		HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");

        MysqlService mysqlService = MysqlService.getInstance(); // DB 연결을 위한 객체 생성(싱글턴이라 한개만 생성됨)
        mysqlService.connect();  //실질적인 DB 연결 (꼭 넣기)
        
        // DB 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect(); // 실질적인 DB 연결 (꼭 넣어야 함)
		
		// DB insert 한 행
		String insertQuery = "insert into `used_goods`"
				+ "(`sellerId`, `title`, `description`, `price`)"
				+ "values"
				+ "(1, '고양이 간식 팝니다.', '저희 고양이가 입맛이 까다로워서 잘 안먹어요ㅠ', 2000)";
		
		try {
			ms.update(insertQuery);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
        //-- DB select 쿼리  수행 & 결과 출력
 
        String selectQuery = "select * from `used_goods`";

        PrintWriter out = response.getWriter();
        ResultSet resultSet;
        try {
            resultSet = mysqlService.select(selectQuery);
            while (resultSet.next()) {  // 결과 행이 있는 동안 수행
                out.println(resultSet.getInt("id"));
                out.println(resultSet.getString("title"));
                out.println(resultSet.getInt("price"));
                out.println(resultSet.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //-- 쿼리 끝

        mysqlService.disconnect(); // DB 연결 해제
    }
}