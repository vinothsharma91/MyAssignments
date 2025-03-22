package week3day2;

public class Chrome extends Browser {
	
	public void openIgnito() {
		System.out.println("open the ignito tab");
	}
	public void clearCache() {
		System.out.println("clear the caches");
	}
	public void browserVersion(int i) {
		// TODO Auto-generated method stub
		System.out.println(132);
	}
	public void browserName(String string) {
		// TODO Auto-generated method stub
		System.out.println("chrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome obj = new Chrome();
		obj.openURL();
		obj.navigateBack();
		obj.closeBrowser();
		obj.browserName("chrome");
		obj.browserVersion(132);

	}
	

}
