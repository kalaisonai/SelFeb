package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String window = driver.getWindowHandle(); 
		System.out.println(window); 
		driver.findElementById("home").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> list1 = new ArrayList<>();
		list1.addAll(allWindows);
		driver.switchTo().window(list1.get(1));
		String title = driver.getTitle();
		System.out.println("Second window title is: "+title); 
		driver.switchTo().window(list1.get(2));
		driver.close();
		
	}
}







