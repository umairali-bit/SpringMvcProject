<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Products</h1>
<%
String[] str = (String[])request.getAttribute("namesArr");
for (String s: str) {
	out.println(s);
}
	%> 


</body>
</html>