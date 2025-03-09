package Week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int version = 10;
		int num = -5;
		
		if(version>0) {
			System.out.println(version + " is a positive number");
		}
		else if(version<0) {
			System.out.println(version + " is a negative number");
		}
		else {
			System.out.println(version + "is zero");
		}
		
		if(num>0) {
			System.out.println(num + " is a positive number");
		}
		else if(num<0) {
			System.out.println(num + " is a negative number");
		}
		else {
			System.out.println(num + "is zero");
		}

	}

}
