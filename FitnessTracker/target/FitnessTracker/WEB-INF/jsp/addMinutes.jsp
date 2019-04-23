<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add minutes page</title>
</head>
<body>
<h1>Add Minutes Page</h1>

Language: <a href=?Language=en>English</a> | <a href=?Language=fr>French</a>

<form:form modelAttribute="exercise">
	<table>
		<tr>
			<td><spring:message code="goal.text"/></td>
			<td><form:input path="minutes"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Enter Exercise"/>
			</td>
		</tr>
	</table>
</form:form>

<h1>Our goal for the day is: ${goal.minutes}</h1>
</body>
</html>