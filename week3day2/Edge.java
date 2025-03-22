package week3day2;

public class Edge extends Chrome {
	
	public void takeSnap() {
		System.out.println("Take a screenshot");
	}
	public void clearCookies() {
		System.out.println("clear rhe cookies");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edge ed = new Edge();
		ed.openIgnito();
		ed.clearCache();
		ed.closeBrowser();
		ed.navigateBack();
		ed.openURL();
	}

}
