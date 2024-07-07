package kr.co.kosta.ui;

import kr.co.kosta.Store.Category;
import kr.co.kosta.Store.Customer;
import kr.co.kosta.Store.PurchaseAmount;
import kr.co.kosta.Store.Store;
import kr.co.kosta.Store.view.CustomerManagingDisplay;
import kr.co.kosta.utils.Constant;

public class UiMain {
	Store zStore = Store.getInstance();
	Category clothes;
	Category furniture;
	Category stuff;
	
	CustomerManagingDisplay managingDisplay = new CustomerManagingDisplay();
	
	public static void main(String[] args) {
		UiMain uiMain = new UiMain();
		
		uiMain.createCategory();
		
		uiMain.createCustomer();
			
		String display = uiMain.managingDisplay.getDisplay();
		System.out.println(display);
	}
	
	public void createCustomer() {
		Customer customer1 = new Customer("이순신", 20240701, clothes);
		Customer customer2 = new Customer("신사임당", 20240702, furniture);
		Customer customer3 = new Customer("이성계", 20240703, stuff);
		Customer customer4 = new Customer("아이유", 20240704, clothes);
		Customer customer5 = new Customer("유연석", 20240705, furniture);
		
		zStore.addCustomer(customer1);
		zStore.addCustomer(customer2);
		zStore.addCustomer(customer3);
		zStore.addCustomer(customer4);
		zStore.addCustomer(customer5);
		
		clothes.register(customer1);
		clothes.register(customer2);
		clothes.register(customer3);
		clothes.register(customer4);
		clothes.register(customer5);
		
		furniture.register(customer1);
		furniture.register(customer2);
		furniture.register(customer5);
		
		stuff.register(customer3);
		
		
		addAmountForCustomer(customer1, clothes, 40);
		addAmountForCustomer(customer1, furniture, 10);
		
		addAmountForCustomer(customer2, clothes, 55);
		addAmountForCustomer(customer2, furniture, 55);
		
		addAmountForCustomer(customer3, clothes, 5);
		addAmountForCustomer(customer3, stuff, 33);
		
		addAmountForCustomer(customer4, clothes, 120);
		
		addAmountForCustomer(customer5, clothes, 20);
		addAmountForCustomer(customer5, furniture, 100);
	}
	
	private void addAmountForCustomer(Customer customer, Category category, int amount) {
		PurchaseAmount amount1 = new PurchaseAmount(customer.getCustomerId(), category, amount);
		customer.addPurchaseAmount(amount1);
	}
	
	public void createCategory() {
		clothes = new Category(Constant.CLOTHES, "옷");
		furniture = new Category(Constant.FURNITURE, "가구");
		stuff = new Category(Constant.STUFF, "물건");
		
		zStore.addCategory(clothes);
		zStore.addCategory(furniture);
		zStore.addCategory(stuff);
	}
}
