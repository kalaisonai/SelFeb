package week1.day1;

public class Mobile2 {
	String model = "redmi note 4";
	int phoneNumber = 123456789;
	boolean hasScreenGuard = true;
	char startingModelName = 'r';
	// method syntax 
	// access_modifier return_type method_name 
	// input_argument
	// public, private, protected, default or package
	public void dialCaller(int phoneNumber) {
		System.out.println("calling "+phoneNumber);
	}
	public void sendSMS(int phoneNumber, String msg) {
		System.out.println
		("Sending message to "+phoneNumber);
	}
	public int getBatteryPercentage() {
		return 32;
	}
	public String getPhoneModel() {
		return model;
	}

	public static void main(String[] args) {
		//  syntax to call a method
		// className object = new ClassName();
		// object.methodName()
		Mobile2 mob = new Mobile2();
		mob.dialCaller(1223456);
		mob.sendSMS(1234, "hello");
		String phoneModel = mob.getPhoneModel();
		System.out.println(phoneModel);
		boolean hasScreenGuard2 = mob.hasScreenGuard;
		System.out.println(hasScreenGuard2);
	}









}
