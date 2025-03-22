package week3day2;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connected to java Database");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected from java Database");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Executing update in java Database");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection db = new JavaConnection();
		db.connect();
		db.disconnect();
		db.executeUpdate();
	}

}
