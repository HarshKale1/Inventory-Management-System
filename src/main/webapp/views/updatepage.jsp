<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
</head>
<body>
<h2>Update Product</h2>
<div class="msg">${msg}</div><br>
<form action="updateq" method="post">
Product Name :<input type="text" name="name"><br>
Quantity :<input type="number" name="qty"><br>
<input type="submit" value="Update">
</form>
</body>
</html>