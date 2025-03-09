package Week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8, firstTerm=0, secondTerm=1;
		System.out.println("Fibonacci series till " +  n + " terms:");
		
		for (int i=1;i<=n;++i) {
			System.out.println(firstTerm);
			
			int nextTerm=firstTerm+secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

	}

}
