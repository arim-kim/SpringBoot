<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.mycom.mybatis.dto.*, java.util.*"%>

<%
	List<EmpDto> empDto = (List<EmpDto>) request.getAttribute("empList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp detail</title>
</head>
<body>
	<h1>emp List</h1>

	<%
		for (EmpDto emp : empDto) {
	%>
	<p>
		emp id :
		<%=emp.getEmployeeId()%></p>
	<p>
		emp first_name :
		<%=emp.getFirstName()%></p>
	<p>
		emp last_name :
		<%=emp.getLastName()%></p>
	<p>
		emp email :
		<%=emp.getEmail()%></p>

	<%
		}
	%>
</body>
</html>