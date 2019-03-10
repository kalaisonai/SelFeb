package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getExcelData(String fileName) throws IOException {
		//open workbook
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
	    //go to sheet
		XSSFSheet sheet = wBook.getSheetAt(0);
		//get row count
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row count is: "+rowCount); 
		//get column count
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column count is: "+columnCount);
		
		String[][] data = new String[rowCount][columnCount]; 
	    for (int j = 1; j <=rowCount; j++) {
			//go to row 
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < columnCount; i++) {
				//go to column
				XSSFCell cell = row.getCell(i);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				data[j-1][i] = stringCellValue;
				
			} 
		} 
	
	      return data;
	
	
	
	
	}
}









