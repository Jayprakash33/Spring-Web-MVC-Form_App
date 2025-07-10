<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>

	<h1>Student Registration Form</h1>
	
	<font color="green">${msg}</font>
	
	<form:form action="save" modelAttribute="student" method="post">
		<table>
		<tr>
		<td>Name: </td>
		<td><form:input path="name"/></td>
		</tr>
		<tr>
		<td>Gender: </td>
		<td><form:radiobutton path="gender" value="male"/>Male
		<form:radiobutton path="gender" value="female"/>Female
		<form:radiobutton path="gender" value="others"/>Others
		</td>
		</tr>
		<tr>
		<td>Email: </td>
		<td><form:input path="email"/></td>
		</tr>
		<tr>
		<td>Courses: </td>
		<td><form:select path="course">
		<form:option value="">-select-</form:option>
		<form:options items="${courses}"/>
		</form:select>
		</td>
		</tr>
		<tr>
		<td>Timings: </td>
		<td>
		<form:checkboxes items="${timings}" path="timings"/>
		</td>
		</tr>
		
		<tr>
		<td></td>
		<td><input type="submit" value="save"></td>
		</tr>
		
		
		</table>

	</form:form>
	
	<a href="display">View Students</a>
</body>
</html>