package week1.day1;

public class Mobile {
	String model = "redmi note 4";
	String[] mobileModel = {"redmi4", "redmi5", "redmi6", "redmi7"};
	int phoneNumber = 123456789;
	boolean hasScreenGuard = true;
	char startingModelName = 'r';
	// method syntax 
	// access_modifier return_type method_name 
	// input_argument
	// public, private, protected, default or package

	public void allMobileModel() {
		for(int i=0; i<mobileModel.length; i++)
		System.out.println(mobileModel[i]);  
		
	}
	
	
	
	
	
	

	public void mobileType(String mobileType) {
		switch (mobileType) {
		case "android": System.out.println("download from android playstore");
		break;
		case "apple": System.out.println("download from apple playstore");
		break;
		default:   System.out.println("not available");
		break;
		}
		/*if(type.equals("android")) {
			System.out.println("download from android playstore");
		} else if(type.equals("apple")) {
			System.out.println("download from apple store");  
		} else {
			System.out.println("not available");  
		}*/
	}


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
		Mobile mob = new Mobile();
		mob.allMobileModel();
		//mob.mobileType("android"); 







		//  syntax to call a method
		// className object = new ClassName();
		// object.methodName()
		/*Mobile mob = new Mobile();
		mob.dialCaller(1223456);
		mob.sendSMS(1234, "hello");
		String phoneModel = mob.getPhoneModel();
		System.out.println(phoneModel);
		boolean hasScreenGuard2 = mob.hasScreenGuard;
		System.out.println(hasScreenGuard2);*/
	}









}
