package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

//import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibMenuPage extends PageObject{
	
	// Menu Forms
				@FindBy(xpath= "//*[@id='menu']/li[6]/a")
				public WebElementFacade MenuForms ;

	// Submenu Form General
			   @FindBy(xpath="//*[@id='menu']/li[6]/ul/li[1]/a")
				public WebElementFacade MenuFormGeneral ;
			   
	// Submenu Form Validation
				@FindBy(xpath="//*[@id='menu']/li[6]/ul/li[2]/a")
				public WebElementFacade MenuFormValidation  ;
				
	// Form Validation - Label Informativo
				@FindBy(xpath= "//*[@id='content']/div/div/div[1]/div/div/header/h5")
				public WebElementFacade LblFormValidation;
				
				
	public void menuFormValidation() {
		MenuForms.click();
		MenuFormValidation.click();
		String strMensaje = LblFormValidation.getText();
		assertThat(strMensaje,containsString("Popup Validation"));
	
	}
}

	

