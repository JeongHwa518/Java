package kr.co.kosta.Store;

public class PurchaseAmount {
	private int customerId;
	private Category category;
	private int amount;
	private String rate;
	public PurchaseAmount(int customerId, Category category, int amount) {
		//super();
		this.customerId = customerId;
		this.category = category;
		this.amount = amount;
	}
	public int getCustomerId() {
		return customerId;
	}
	public Category getCategory() {
		return category;
	}
	public int getAmount() {
		return amount;
	}
	public String getRate() {
		return rate;
	}
		
}
