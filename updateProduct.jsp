<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Product" %>

<%
Product product = (Product) request.getAttribute("product");
%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Update Product</title>
</head>
<body>
<h1>Update <%= product.getName() %></h1>
<form name=updateProduct action="updateProductServlet" method=post>
<input type=hidden name=sku value="<%= product.getSku()%>"/>
<label>
Product Name
</label>
<br>
<input type="text" name=name value="<%=product.getName()%>"/>
<br>
<label>Product Quantity: </label>
<input type="text" name=quantity value="<%=product.getQuantity()%>"/>
<br/>
<label>
Product Price
</label>
<br>
<input type="text" name=name value="<%=product.getPrice()%>"/>
<br>
<input type=submit name=submit value="Update <%=product.getQuantity()%>"/>
</form>
</body>
</html>
