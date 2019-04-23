<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Goal</title>
</head>
<body>

<form:form modelAttribute="goal">

	<table>
		<tr>
			<td>Enter Minutes:</td>
			<td><form:input path="minutes"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Enter Goal Minutes"/>
			</td>
		</tr>
	</table>
</form:form>

</body>
</html>