package week3.day1;

public class ICICIChennai implements RBI,CIBIL{

	@Override
	public void manAadhar() {
		System.out.println("Aadhar required");
	}

	@Override
	public void numberOfTran() {
		System.out.println("number of transaction "+transaction);
	}

	@Override
	public void getCreditScore() {
		
	}

}
