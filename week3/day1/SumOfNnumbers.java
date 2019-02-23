package week3.day1;

public class SumOfNnumbers {

	public static void main(String[] args) {
		int sum =2;
		int count =0;
		for(int j=1; j<=sum; j++) {
			if(sum%j ==0) 
			count++;
		}
		if(count == 2)
		System.out.println("prime number"); 
		else 
			System.out.println("not prime number");

	}

}
