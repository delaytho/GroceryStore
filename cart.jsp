<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="model.Cart"%>
<%@ page import="model.Product"%>

<%
	//input
	int sku = Integer.parseInt(request.getParameter("sku"));
	String name = request.getParameter("name");
	int quantity = Integer.parseInt(request.getParameter("quantity"));
	double price = Double.parseDouble(request.getParameter("price"));
	
	
	Product product = new Product(sku, name, quantity, price);
	Cart cart = new Cart(product);
	
	String cartTable = cart.doCart();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Grocery Store - Shopping Cart</title>
</head>
<body>

<h1>Shopping Cart</h1>

	<p>
	<%= cartTable %>
	</p>

	<a href='browsing.jsp'>Keep Shopping</a>

</body>
</html>
