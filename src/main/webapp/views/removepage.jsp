<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Remove Product</title>
</head>
<body>
<h2>Remove Product</h2>
<div class="msg">${msg}</div><br>
<form action="removeP" method="post">
Product Name :<input type="text" name="name">
<input type="submit" value="Remove">
</form>
</body>
</html>