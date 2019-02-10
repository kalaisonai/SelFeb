package week1.day2;

public class LearnStatic {

	static int num ;
	static {
		num =20;
		System.out.println("i am static block1");
	}  
	static {
		num =20;
		System.out.println("i am static block2");
	} 
	public static void test() {
		System.out.println("test");  
	}
	public static void main(String[] args) {
		System.out.println("i am main");  
		/*System.out.println(num); 
        test();
        float num= LearnOverloading.area(3.4f);
        System.out.println(num); */
	}

}
