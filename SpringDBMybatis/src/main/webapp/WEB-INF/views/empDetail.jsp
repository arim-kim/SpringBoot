<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.mycom.mybatis.dto.*"%>

<%
	EmpDto empDto = (EmpDto) request.getAttribute("empDto");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp detail</title>
</head>
<body>
	<h1>emp detail</h1>
	<p>
		emp id :
		<%=empDto.getEmployeeId()%></p>
	<p>
		emp first_name :
		<%=empDto.getFirstName()%></p>
	<p>
		emp last_name :
		<%=empDto.getLastName()%></p>
	<p>
		emp email :
		<%=empDto.getEmail()%></p>

</body>
</html>