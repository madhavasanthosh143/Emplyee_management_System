<%@page import="com.nit.model.Employee"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="addEmployee">Add Employee</a>
	<table border="1" width="100%">
	<tr>
		<th>Id</th>
	<th>Name</th>
	<th>Address</th>
	<th>Salary</th>
	</tr>
		<%
		List<Employee> emps = (List<Employee>) request.getAttribute("emps");
		if (emps.isEmpty()) {
		%>
		
		<tr><td colspan="4">No Employees found!!</td></tr>
		
		
<%
				}
				for (Employee emp : emps) {
				%>
	<tr>
		<td><%=emp.getId()%></td>
		<td><%=emp.getName()%></td>
		<td><%=emp.getAddress()%></td>
		<td><%=emp.getSalary()%></td>
	</tr>
<%
}
%>
</table>
</body>
</html>