package week3.day1;

public abstract class SBIHeadOffice implements RBI{

	public SBIHeadOffice() {
		System.out.println("SBI head office");
	}
	public void manAadhar() {
     System.out.println("aadhar is required");
	} 
	
	public abstract void minBalance();
}
