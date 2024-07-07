package kr.co.kosta.grade;

/*      고객 등급제도
*  		V		G		S		B		N
*  		--------------------------------------
*  		100		99~50	49~30	29~10	9~0
*/

public class MileageAccumulate implements Mileage {
	
	@Override
	public int getMilege(String rating) {
		int mileage;
		
		if("V".equals(rating))
			mileage = 5;
		else if("G".equals(rating))
			mileage = 4;
		else if("S".equals(rating))
			mileage = 3;
		else if("B".equals(rating))
			mileage = 2;
		else 
			mileage = 1;
		
		return mileage;
	}

}
