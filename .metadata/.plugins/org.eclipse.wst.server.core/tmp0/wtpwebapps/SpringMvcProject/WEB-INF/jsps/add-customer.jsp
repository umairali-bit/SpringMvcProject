<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add Customer</h1>
<form method="get" action="<%=request.getContextPath()%>/process-add-customer">
<label>Enter Name: </label>
<input type="text" name="cname"> <br /><br />
<label>Enter City: </label>
<input type="text" name="ccity"> <br /><br />
<label>Enter Age: </label>
<input type="text" name="cage"> <br /><br />
<input type="submit" name="Add Customer"> <br /><br />
</form>
</body>
</html>