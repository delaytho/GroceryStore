package model;

public class Cart {

	private int numProducts;

	public Cart(int numProducts) {
		this.numProducts = numProducts;
	}
	
	public Cart() {
		this.numProducts = 0;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cart [numProducts=" + numProducts + "]";
	}
}
