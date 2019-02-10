package week1.day2;

public class LearnDiffStatic {

	static int num1 = 10;
	int num2 = 10;
	public void counter() {
		num1++;
		num2++;
		System.out.println("static num: "+num1);
		System.out.println("non-static num: "+num2); 
	}
	public static void main(String[] args) {
		LearnDiffStatic learn = new LearnDiffStatic();
		learn.counter();
		learn.counter();
		LearnDiffStatic learn1 = new LearnDiffStatic();
		learn1.counter();
		learn.counter();
		learn1.counter();
	}

}






