package model;

import java.text.NumberFormat;

public class Cart {

	private int numProducts;
	//private String currentName;
	private int currentQuantity;
	private double currentPrice;
	
	Product product;
	
	public Cart(){
		product = null;
	}
	
	public Cart(Product product){
		this.product = product;
		//numProducts = 0;
	}

	//Product
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	/**
	 * @return the numProducts
	 */
	public int getNumProducts() {
		return numProducts;
	}

	/**
	 * @param numProducts the numProducts to set
	 */
	public void setNumProducts(int numProducts) {
		this.numProducts = numProducts;
	}
	
//	//Name
//	public void setProductName(String currentName) {
//		this.currentName = product.getName();
//	}
//
//	public String getProductName(String currentName)
//	{
//		currentName = product.getName();
//		return currentName;
//	}
//	
	//Quantity
		public void setCurrentQuantity(int currentQuantity) {
			this.currentQuantity = product.getQuantity();
		}

		public int getCurrentQuantity(int currentQuantity)
		{
			currentQuantity = product.getQuantity();
			return currentQuantity;
		}
		
		//Price
		public void setCurrentPrice(double currentPrice) {
			this.currentPrice = product.getPrice();
		}

		public double getCurrentPrice(double currentPrice)
		{
			currentPrice = product.getPrice();
			return currentPrice;
		}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cart [numProducts=" + numProducts + "]";
	}
	
	public String doCart()
	{
		String table = "<table border=1>";
		
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(2);
		
		//  top header row
	    table += "<tr><td>Cart Items</td>\n" + 
	    		"		<td>Quantity</td>\n" + 
	    		"		<td>Total</td>\n" + 
	    		"		<td>Options</td>";

	    // add rows
	    for (int row = 1; row <= numProducts; row++) {
	    	
	    //	String currentName = this.getProductName(currentName);
	    	//  int currentQuantity = this.getCurrentQuantity(currentQuantity);
	    //	double currentPrice = this.getCurrentPrice(currentPrice);
	    	
	    	table += "<tr>";
	    	//numProducts
		    table += "<td>" + row + "</td>";
		    
		    //Cart Items
		    table += "<td> " + product.getName() + "</td>";
		    
		    //Quantity
		    table += "<td> " + product.getQuantity() + "</td>";
		    
		    //Total
		    table += "<td> $" + nf.format(product.calcTotal(currentPrice, currentQuantity)) + "</td>";
		    
		    //Options
		    table += "<td><a href='updateProductForm'</a></td>";
		    table += "<td><a href='deleteProductForm'</a></td>";
		    table += "</tr>";
	    }
	    
		table += "</table>";
		return table;
	}
}
