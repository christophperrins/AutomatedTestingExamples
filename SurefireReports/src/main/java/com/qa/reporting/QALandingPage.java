package com.qa.reporting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QALandingPage {

	@FindBy(xpath = "/html/body/header/div[2]/div[1]/div[1]/h1")
	private WebElement qaConsulting;
	
	public String headerText() {
		return qaConsulting.getText();
	}
}
