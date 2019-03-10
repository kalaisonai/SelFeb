package utils;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseUtils;

public class CreateLead extends BaseUtils{
	// to run test case 2 times with same data
	// enabled if false @test will not be considered to run
	//@Test(invocationCount = 1/*, enabled = false*/)
	
	@BeforeTest
	public void setData() {
		excelFileName = "CreateLead"; 
	}
	
	@Test(dataProvider = "fetchData", expectedExceptions=Exception.class) 
	public void createLeadTest(String cname, String fname, String lname) {
//		login();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementByName("submitButton").click();
//		closeApp();
	}
	
	/*@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		
		return ReadExcel.getExcelData("CreateLead");
		*/
		/*String[][] data = ReadExcel.getExcelData();
		   return data;*/
		
		
		
		
		
		
		
		
		
		/*String[][]  data = new String[2][3];
		data[0][0] = "TL";
		data[0][1] = "Gopi";
		data[0][2] = "J";
		
		data[1][0] = "TL";
		data[1][1] = "Sethu";
		data[1][2] = "M";
		return data;*/
	//}
}
















