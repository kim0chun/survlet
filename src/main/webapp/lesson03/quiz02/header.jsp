<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<header class="d-flex align-items-center bg-">
	<%-- 로고 영역 --%>
	<div class="col-2">
		<h3><a href="list_template.jsp" class="text-success">Melong</a></h3>
	</div>
	
	<%-- 검색 영역 --%>
	<div class="col-10">
		<form method="get" action="info_template.jsp">
			<div class="input-group">
				<input type="text" class="form-control col-6" name="search">
				<div class="input-group-append">
					<input type="submit" class="btn btn-info" value="검색">
				</div>
			</div>
		</form>
	</div>
</header>

