<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Grocery Store Main page and Login</title>
</head>
<body>
<h1>Welcome to Grocery Warehouse!</h1>
<h2>A one-stop shop for all your grocery needs</h2>
<div> 
<p>Login:</p>
<form name=loginform action="login" method=post>
<label>Username: </label>
<input type=text  name=username  value="Username"/>
<br/>
<label>Password: </label>
<input type=text  name=password  value="********"/>
<br/>
<input type=submit  name=login  value="Login"/>
<p>Login or <a href="/registration.jsp">Register here</a></p>
</form>
</div>
</body>
</html>
