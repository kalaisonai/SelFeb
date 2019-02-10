package week1.day2;

public class LearnKeywords {

	int num =10;
	public void test() {
		int num =5;
		System.out.println(this.num); 
	}
	public static void main(String[] args) {
		LearnKeywords key = new LearnKeywords();
		key.test();
	}

}
