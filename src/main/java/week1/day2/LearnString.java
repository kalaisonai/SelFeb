package week1.day2;

public class LearnString {
	public static void main(String[] args) {
		//String companyName = "Testleaf"; // -> literal
		//String myCompany = "Testleaf";
		String companyName = new String("Testleaf software");
		int length = companyName.length();
		System.out.println(length);
		char[] charArray = companyName.toCharArray();
		int j=0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'e') {
				j++;
			}		
		}
		System.out.println(j);




		/*String myCompany = new String("Testleaf");
		// == -> compares objects
		// .equals -> compares values
		if (companyName.contains(myCompany)) {
			System.out.println("matches");
		}else {
			System.out.println("do not match");
		}*/
	}
}
