package week3day2;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestData tD = new TestData();
		tD.enterCredentials();
		tD.navigateToHomePage();
		
		LoginTestData ltd = new LoginTestData();
		ltd.enterUsername();
		ltd.enterPassword();
		ltd.enterCredentials();
		ltd.navigateToHomePage();
	}

}
