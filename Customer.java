package model;

public class Customer {

	private String fName;
	private String lName;
	private int phoneNum;
	private String emailAddress;
	private String username;
	private String password;
	
	public Customer(String fName, String lName, int phoneNum, String emailAddress, String username, String password) {
		this.fName = fName;
		this.lName = lName;
		this.phoneNum = phoneNum;
		this.emailAddress = emailAddress;
		this.username = username;
		this.password = password;
	}
	
	public Customer() {
		this.fName = "No fName";
		this.lName = "No lName";
		this.phoneNum = 0;
		this.emailAddress = "No email";
		this.username = "No username";
		this.password = "No password";
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the phoneNum
	 */
	public int getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", lName=" + lName + ", phoneNum=" + phoneNum + ", emailAddress="
				+ emailAddress + ", username=" + username + ", password=" + password + "]";
	}
}
