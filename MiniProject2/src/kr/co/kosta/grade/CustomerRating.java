package kr.co.kosta.grade;

/*      고객 등급제도
*  		V		G		S		B		N
*  		--------------------------------------
*  		100		99~50	49~30	29~10	9~0
*/

public class CustomerRating implements Rating {
	
	@Override
	public String getRate(int amount) {
		String rate = null;
		
		if(amount >= 100)
			rate = "V";
		else if(amount <= 99 && amount >= 50)
			rate = "G";
		else if(amount <= 49 && amount >= 30)
			rate = "S";
		else if(amount <= 29 && amount >= 10)
			rate = "B";
		else 
			rate = "N";
	
		return rate;
	}
}
