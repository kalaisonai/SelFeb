package week1.day2;

public class LearnStr {

	int num ;
	public LearnStr() {
		num = 2;
		System.out.println("i am constructor");
	}
	//public LearnStr() {} 
	public void test() {
		System.out.println("test "+num);  
	}
	
	
	
	public static void main(String[] args) {
		LearnStr str = new LearnStr();
		str.test();

		String companyName = "TestLeaf";
		String cName = new String();
		
		
		//System.out.println(companyName.lastIndexOf('e'));  
		//System.out.println(companyName.indexOf('e'));
		//System.out.println(companyName.charAt(5));  
		

	}

}
