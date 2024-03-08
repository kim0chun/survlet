<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz01.jsp 연습문제</title>
</head>
<body>
	<%!
		// 1. 합계
		public int getSum(int n) {  // 입력 값은 n
			int sum = 0;
			for (int i=1 ; i<=n ; i++) {
				sum += i;
			}
			return sum;
		}
	%>

	<%
		// 2.점수평균
		int[] scores = {81, 90, 100, 95, 80};
		int sum2 = 0 ;
		for ( int i = 0 ; i < scores.length ; i++) {
			sum2 += scores[i];
		}
		 double average  =  sum2 / (double) scores.length;  
		 
   		//3. 채점
		List<String> scoreList 
		  = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		int score =0;
		for (int i= 0 ; i <scoreList.size() ; i++){
			if (scoreList.get(i).equals("O")){
				score += 100 / scoreList.size();
			}
		}

		// 4. 나이
		String birthDay = "20010820";
		String year = birthDay.substring(0, 4);
		int age = 2024 - Integer.parseInt(year) + 1;
	%>
	<h1>1부터 50까지의 합은 <%=getSum(50)%>입니다.</h1>
	<h1>평균 점수는 <%=average%>입니다.</h1>
	<h1>채점 결과는 <%=score%>점 입니다.</h1>
	<h1><%=birthDay%>의 나이는 <%=age%>세 입니다.</h1>
</body>
</html>