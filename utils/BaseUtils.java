package utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import utils.ReadExcel;

@Listeners(ExtentITestListenerClassAdapter.class) 
public class BaseUtils {
	public String excelFileName;
	public ChromeDriver driver;

	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String url, String uname, String pwd) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}

	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		
		return ReadExcel.getExcelData(excelFileName); 
		
	}
}






