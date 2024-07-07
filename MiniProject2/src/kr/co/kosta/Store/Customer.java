package kr.co.kosta.Store;

import java.util.ArrayList;

public class Customer {
	private String customerName;
	private int customerId;
	private Category categoryName;
	private ArrayList<PurchaseAmount> amounts = new ArrayList<>();
	
	public Customer(String customerName, int customerId, Category categoryName) {
		//super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.categoryName = categoryName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public ArrayList<PurchaseAmount> getAmounts() {
		return amounts;
	}

	public void setAmounts(ArrayList<PurchaseAmount> amounts) {
		this.amounts = amounts;
	}
	
	public Category getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(Category categoryName) {
		this.categoryName = categoryName;
	}

	public void addPurchaseAmount(PurchaseAmount amount) {
		amounts.add(amount);
	}
	
}
