<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Grocery Store - Registration</title>
</head>
<body>

<h1>Registration</h1>

<form name=registration action=login method=post>

	<label>
		First Name:
	</label>
	<input type=text name=fName value="" />
	<br />
	
	<label>
		Last Name:
	</label>
	<input type=text name=lName value="" />
	<br />
	
	<label>
		Phone Number:
	</label>
	<input type=text name=phoneNum value="" />
	<br />
	
	<label>
		Email Address:
	</label>
	<input type=text name=emailAddress value="" />
	<br />
	
	<label>
		Username:
	</label>
	<input type=text name=username value="" />
	<br />
	
	<label>
		Password:
	</label>
	<input type=text name=password value="" />
	<br />

	<p>
	<input type=submit name=submit value="Register" />
	</p>
	
</form>
</body>
</html>
