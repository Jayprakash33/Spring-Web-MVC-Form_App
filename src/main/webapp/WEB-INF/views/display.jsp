<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> Student Record</h2>
	

	<table border="1">
	<thead>
		<tr>
		<th>S.No</th>
		<th>name</th>
		<th>gender</th>
		<th>email</th>
		<th>course</th>
		<th>timings</th>
		</tr>
	</thead>
	<tbody>
	
	<c:forEach items="${msg}" var="student" varStatus="index">
	
	<tr>
	<td>${index.count}</td>
	<td>${student.name}</td>
	<td>${student.gender}</td>
	<td>${student.email}</td>
	<td>${student.course}</td>
	<td>${student.timings}</td>
	</tr>
	
	
	</c:forEach>
	
	</tbody>
	
	</table>
		<a href="/"> Add New Student</a>
</body>
</html>