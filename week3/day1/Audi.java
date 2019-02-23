package week3.day1;

public class Audi extends Car
{
	@Override
	public void brake()
	{
		System.out.println("ABS Brake");
	}
	
	@Override
	public void soundSystem() {
		super.soundSystem();
		System.out.println("Advanced sound system");
	} 
		
	
}
