package week3day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 121;
		int original = input;
		int output =0;
		
		while(input>0) {
			int rem = input%10;
			output=(output*10)+rem;
			input/=10;
		}
		if(original == output) {
			System.out.println(original+ " is a palindrome");
		}else {
			System.out.println(original+ " is not a palindrome");
		}

	}

}
