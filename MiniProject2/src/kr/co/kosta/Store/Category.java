package kr.co.kosta.Store;

import java.util.ArrayList;

public class Category {
	private int categoryId;
	private String categoryName;
	private int rateType;
	
	private ArrayList<Customer> customers = new ArrayList<>();

	public Category(int categoryId, String categoryName) {
		//super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public int getRateType() {
		return rateType;
	}

	public void setRateType(int rateType) {
		this.rateType = rateType;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	
	public void register(Customer customer) {
		customers.add(customer);
	}
	
	
}
