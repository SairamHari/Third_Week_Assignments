package Home_Assignments_Week3_Day1;

public class JavaConnection_02 extends  MySqlConnection  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection_02 jc2=new JavaConnection_02();
		
		jc2.executeQuery();
		jc2.connect();
		jc2.disconnect();
		jc2.executeQuery();
	}



	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Concrete class - connection successfull");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Concrete class - connection terminated");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Concrete class - update success");
	}

}
