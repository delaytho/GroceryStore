package model;

public class Product {
	
	private String sku;
	private String name;
	private int quantity;
	private double price;
	
	public Product(String sku, String name, int quantity, double price) {
		this.sku = sku;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public Product() {
		this.sku = "No Sku";
		this.name = "No Name";
		this.quantity = 0;
		this.price = 0;
	}

	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [sku=" + sku + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
}
