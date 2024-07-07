package kr.co.kosta.Store;

import java.util.ArrayList;

public class Store {
	private static Store instance = new Store();
	private Store() {}
	
	public static Store getInstance() {
		if(instance == null)
			instance = new Store();
		return instance;
	}
	
	private ArrayList<Customer> customers = new ArrayList<>();
	private ArrayList<Category> categories = new ArrayList<>();
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public ArrayList<Category> getCategories() {
		return categories;
	}

	public void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void addCategory(Category category) {
		categories.add(category);
	}
}
