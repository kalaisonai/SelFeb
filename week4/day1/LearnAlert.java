package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElementByXPath("//button[text()='Alert Box']").click();
//		driver.switchTo().alert().accept();
//			
//		driver.findElementByXPath("//button[text()='Confirm Box']").click();
//		
		
		
		driver.switchTo().alert().dismiss();
//		
//		driver.switchTo().alert().sendKeys(keysToSend);
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		
		Alert myAlert = driver.switchTo().alert();
		String text = myAlert.getText();
		System.out.println("Alert Text"+text);
		myAlert.sendKeys("Nanganallur");
		myAlert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
