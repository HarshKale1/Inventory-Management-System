<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>
<body>
<h2>Add Product</h2>
<div class="msg">${msg}</div><br>
<form action="addprod" method="post">
Product Name :<input type="text" name="name"><br>
Quantity :<input type="number" name="qty"><br>
<input type="submit" value="Add Product">
</form>
</body>
</html>