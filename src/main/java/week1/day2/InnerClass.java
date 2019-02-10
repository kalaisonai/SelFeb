package week1.day2;

public class InnerClass {

	static class NestedClass{
		public void test() {
			System.out.println("static in a class");
		}		
	} 
	public static void main(String[] args) {
		InnerClass.NestedClass obj = new InnerClass.NestedClass();
		obj.test();
	}

}


