package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert myAlert = driver.switchTo().alert();
		String alertText = myAlert.getText();
		System.out.println(alertText);
		myAlert.dismiss();
		String text = driver.findElementById("demo").getText();
		if(text.contains("cancelled"))
		{
			System.out.println("Text verified");
		}
		else
		{
			System.out.println("Text Mismatch");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
