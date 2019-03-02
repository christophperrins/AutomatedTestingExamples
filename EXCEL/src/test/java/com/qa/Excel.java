package com.qa;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public WebDriver driver = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chris\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void loginTest() throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\Chris\\Desktop\\DemoSiteDDT.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		//Reading
		for (int rowNum = 0; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
			for (int colNum = 0; colNum < sheet.getRow(rowNum).getPhysicalNumberOfCells(); colNum++) {
				XSSFCell cell = sheet.getRow(rowNum).getCell(colNum);
				String userCell = cell.getStringCellValue();
				System.out.println(userCell);
			}
		}
		
		//Writing
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		if (cell == null) {
			cell = row.createCell(1);
		}
		cell.setCellValue("hello");
		
	
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Chris\\Desktop\\DemoSiteDDT.xlsx");

		workbook.write(fileOut);
		fileOut.flush();
		fileOut.close();
		
		file.close();		
		
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
