package com.qa.para;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ExcelPara {

	@Parameters
	public static Collection<Object[]> data() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Chris\\Desktop\\DemoSiteDDT.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Object[][] ob = new Object[sheet.getPhysicalNumberOfRows()][4];
		
//		Reading
		for (int rowNum = 0; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
				ob[rowNum][0] = sheet.getRow(rowNum).getCell(0).getStringCellValue();
				ob[rowNum][1] = sheet.getRow(rowNum).getCell(1).getStringCellValue();
				ob[rowNum][2] = sheet.getRow(rowNum).getCell(2).getStringCellValue();
				ob[rowNum][3] = rowNum;
			}
		return Arrays.asList(ob);
		}
	
	private String username;
	private String password;
	private String expected;
	private int row;
	
	public ExcelPara(String username, String password, String expected, int row) {
		this.username = username;
		this.password = password;
		this.expected = expected;
		this.row = row;
	}
	
	@Test
	public void login() {
		// testing logic
		System.out.println(username + " " + password + " " + expected);
		// grab actual result and insert it into spreadsheet
		System.out.println("actual result needs to be printed in row:" + row);
		
		try {
			assertEquals(1, 0); //assertEquals("error message", expected value, actual value);
			// write pass to excel sheet
		}
		catch (AssertionError e) {
			// write fail to excel sheet
			Assert.fail(); // Because AssertionError was caught, test no longer fails,
							// therefore we force it to fail after we have written it to excel sheet
		}
		
	}
}
