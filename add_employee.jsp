<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="saveEmployee" method="POST" modelAttribute="emp">
	<table>
		<tr>
			<td>Name</td>
			<td><form:input path="name" /> </td>
		</tr>
		<tr>
			<td>Address</td>
			<td><form:input path="address" /> </td>
		</tr>
		<tr>
			<td>Salary</td>
			<td><form:input path="salary" /> </td>
		</tr>
		<tr>
			<td colspan="2" align="center"><form:button type="submit" value="Add Employee"/></td>
		</tr>
	</table>
</form:form>
</body>
</html>