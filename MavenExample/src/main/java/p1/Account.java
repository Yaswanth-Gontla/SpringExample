package p1;

import java.util.ArrayList;

public class Account {

	private int accontNumber;
	private String accountName;
	private int balance;
	private String branchName;
	private String state;
	private String country;
	private ArrayList<Stock> stock = new ArrayList<Stock>(); 
	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Account(int accontNumber, String accountName, int balance, String branchName, String state, String country,
			ArrayList<Stock> stock) {
		super();
		this.accontNumber = accontNumber;
		this.accountName = accountName;
		this.balance = balance;
		this.branchName = branchName;
		this.state = state;
		this.country = country;
		this.stock = stock;
	}



	public ArrayList<Stock> getStock() {
		return stock;
	}
	public void setStock(ArrayList<Stock> stock) {
		this.stock = stock;
	}
	public int getAccontNumber() {
		return accontNumber;
	}
	public void setAccontNumber(int accontNumber) {
		this.accontNumber = accontNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accontNumber;
		result = prime * result + ((accountName == null) ? 0 : accountName.hashCode());
		result = prime * result + balance;
		result = prime * result + ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accontNumber != other.accontNumber)
			return false;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		if (balance != other.balance)
			return false;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Account [accontNumber=" + accontNumber + ", accountName=" + accountName + ", balance=" + balance
				+ ", branchName=" + branchName + ", state=" + state + ", country=" + country + ", stock=" + stock + "]";
	}



	public void doInitCode() {
		System.out.println("init");
	}
	public void doWindupCode() {
		System.out.println("destroy method");
	}
	
}