package week1.day2;

public class Solutions {
	public static void main(String[] args) {
		String cname = "testleaf software";
		String replace = cname.replace(" ", "");
		char[] charArray = replace.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[0] == charArray[i]) {
				count ++;
			}
		}
		System.out.println(count);
	}

}
