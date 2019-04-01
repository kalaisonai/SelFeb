package challenges;

public class NextChar {

	public static void main(String[] args) {
		String txt  = "B2C3D4";
		char[] charArray = txt.toCharArray();
		for (char c : charArray) {
			//System.out.println((int)c);
			int asc = ((int)c)+1;
			System.out.print((char)asc);
		}
	}

}
