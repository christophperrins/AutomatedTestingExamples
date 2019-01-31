package com.qa.reporting;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.PageFactory;

public class ReportingTest {

	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("phantomjs.binary.path", Constants.PHANTOMJS);
		driver = new PhantomJSDriver();
	}
	
	@After
	public void teardown() {
		driver.quit();
	} 
	
	@Test
	public void simpleTest() {
		driver.get(Constants.QACONSULTINGURL);
		QALandingPage qaLandingPage = PageFactory.initElements(driver, QALandingPage.class);
		assertEquals("QA Consulting not found", "QA Consulting", qaLandingPage.headerText());
	}
}
