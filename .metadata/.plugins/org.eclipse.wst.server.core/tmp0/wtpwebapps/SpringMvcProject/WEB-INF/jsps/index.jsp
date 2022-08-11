<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Spring!!!!! finally......</h1>
<p>Welcome <%=request.getAttribute("username") %></p>
<a href="<%=request.getContextPath() %>/products"> Products </a><br />
<a href="<%=request.getContextPath() %>/vendors"> Vendors </a><br />
<a href="<%=request.getContextPath() %>/add-customer"> Add Customer </a><br />
<a href="<%=request.getContextPath() %>/view-customers">View Customers</a>

</body>
</html>