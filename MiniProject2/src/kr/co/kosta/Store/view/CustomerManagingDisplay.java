package kr.co.kosta.Store.view;

import java.util.ArrayList;

import kr.co.kosta.Store.Category;
import kr.co.kosta.Store.Customer;
import kr.co.kosta.Store.PurchaseAmount;
import kr.co.kosta.Store.Store;
import kr.co.kosta.grade.CustomerRating;
import kr.co.kosta.grade.Mileage;
import kr.co.kosta.grade.MileageAccumulate;
import kr.co.kosta.grade.Rating;
import kr.co.kosta.utils.Constant;

public class CustomerManagingDisplay {
	
	Store store = Store.getInstance();
	
	public static final String TITLE = "고객 관리 시스템 >>> \n";
	public static final String LINE = "-------------------------------------------------------------------------------\n";
	public static final String HEADER = "이름	 \t 고객번호 \t\t카테고리\t\t구매금액 \t등급 \n		";
	public static final String LINE2 = "============================================================================\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getDisplay() {
		ArrayList<Category> categories = store.getCategories();
		
		for(Category category : categories) {
			makeHeader(category);
			makeBody(category);
			makeFooter(category);
		}
		return buffer.toString();
	}
	
	private void makeFooter(Category category) {
		buffer.append("\n");
	}
	
	private void makeBody(Category category) {
		ArrayList<Customer> customers = category.getCustomers();
		for(int i=0; i < customers.size(); i++) {
			Customer customer = customers.get(i);
			buffer.append(customer.getCustomerName());
			if(customer.getCustomerName().length() >= 10) {
				buffer.append("\t");
			} else {
				buffer.append("\t\t");
			}
			
			buffer.append(customer.getCustomerId());
			buffer.append("\t");
			buffer.append(customer.getCategoryName().getCategoryName());
			buffer.append("\t\t");
			getAmountRating(customer, category);
			buffer.append("\n");
			
		}
		
		buffer.append(CustomerManagingDisplay.LINE2);
	}
	
	private void getAmountRating(Customer customer, Category category) {
		ArrayList<PurchaseAmount> amountList = customer.getAmounts();
		int categoryId = customer.getCategoryName().getCategoryId();
		
		Rating[] ratings = { new CustomerRating() };
		Mileage[] mileages = { new MileageAccumulate() }; 
		
		for(int i=0; i < amountList.size(); i++) {
			PurchaseAmount amount = amountList.get(i);
			
			if(amount.getCategory().getCategoryId() == category.getCategoryId()) {
				String rate;
				int mileage;
				
//				if(amount.getCategory().getRateType() == Constant) {
					rate = ratings[Constant.RATING].getRate(amount.getAmount());
//					mileage = mileages[Constant.MILEAGE].getMilege(amount.getRate());
				 
				
				buffer.append(amount.getAmount());
				buffer.append("\t");
				buffer.append(rate);
//				buffer.append("\t");
//				buffer.append(mileage);
//				buffer.append("\t");
			}
		}
	}
	
	private void makeHeader(Category category) {
		buffer.append(category.getCategoryName());
		buffer.append(CustomerManagingDisplay.TITLE);
		buffer.append(CustomerManagingDisplay.LINE);
		buffer.append(CustomerManagingDisplay.HEADER);
		buffer.append(CustomerManagingDisplay.LINE);
	}
}
