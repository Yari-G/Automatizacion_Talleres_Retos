package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibFormValidationPage extends PageObject{
//Campo Required
	@FindBy(id="required2")
	public WebElementFacade txtRequired2;
//Campo Email
	@FindBy(id="email2")
	public WebElementFacade txtEmail2;
//Campo Password
	@FindBy(id="password2")
	public WebElementFacade txtPassword2;	
//Campo Confirm Password
	@FindBy(id="confirm_password2")
	public WebElementFacade txtConfirmPass2;
//Campo Date
	@FindBy(id="date2")
	public WebElementFacade txtdate2;
//Campo Url 
	@FindBy(id="url2")
	public WebElementFacade txtUrl2;
//Campo Digit Only
	@FindBy(id="digits")
	public WebElementFacade txtDigits;	
//Campo Range	
	@FindBy(id="range")
	public WebElementFacade txtrange; 
//Check Box
	@FindBy(id="agree2")
	public WebElementFacade btnAgree2; 
//Boton Validate
	@FindBy(xpath="//*[@id='block-validate']/div[10]/input")
	public WebElementFacade btnValidate2;

	//Error-Campo Required
		@FindBy(xpath="//SPAN[@id='required2-error']")
		public WebElementFacade txtErrorRequired2;
	//Error-Campo Email
		@FindBy(xpath="//SPAN[@id='email2-error']")
		public WebElementFacade txtErrorEmail2;
	//Error-Campo Password
		@FindBy(xpath="//SPAN[@id='password2-error']")
		public WebElementFacade txtErrorPassword2;	
	//Error-Campo Confirm Password
		@FindBy(xpath="//SPAN[@id='date2-error']")
		public WebElementFacade txtErrorConfirmPass2;
	//Error-Campo Date
		@FindBy(xpath="//SPAN[@id='date2-error']")
		public WebElementFacade txtErrordate2;
	//Error-Campo Url 
		@FindBy(xpath="//SPAN[@id='url2-error']")
		public WebElementFacade txtErrorUrl2;
	//Error-Campo Digit Only
		@FindBy(xpath="//SPAN[@id='digits-error']")
		public WebElementFacade txtErrorDigits;	
	//Error-Campo Range	
		@FindBy(xpath="//SPAN[@id='range-error']")
		public WebElementFacade txtErrorRange; 
	
	
	
	
	public void Required(String datoPrueba) {
		txtRequired2.click();
		txtRequired2.clear();
		txtRequired2.sendKeys(datoPrueba);
	}	
	public void email(String datoPrueba) {
		txtEmail2.click();
		txtEmail2.clear();
		txtEmail2.sendKeys(datoPrueba);
	}	
	public void password(String datoPrueba) {
		txtPassword2.click();
		txtPassword2.clear();
		txtPassword2.sendKeys(datoPrueba);
	}
	public void confirm_password(String datoPrueba) {
		txtConfirmPass2.click();
		txtConfirmPass2.clear();
		txtConfirmPass2.sendKeys(datoPrueba);
	}	
	
	public void date(String datoPrueba) {
		txtdate2.click();
		txtdate2.clear();
		txtdate2.sendKeys(datoPrueba);
	}		
	
	
	public void url(String datoPrueba) {
		txtUrl2.click();
		txtUrl2.clear();
		txtUrl2.sendKeys(datoPrueba);
	}
	public void Digits(String datoPrueba) {
		txtDigits.click();
		txtDigits.clear();
		txtDigits.sendKeys(datoPrueba);
	}	

	public void Range(String datoPrueba) {
		txtrange.click();
		txtrange.clear();
		txtrange.sendKeys(datoPrueba);
	}
	public void Check() {
		btnAgree2.click();
	}
	
	public void validate() {
		btnValidate2.click();		
	}
	
	
	public void form_sin_errores() {
		assertThat(txtErrorRequired2.isCurrentlyVisible(), is (false));
		assertThat(txtErrorEmail2.isCurrentlyVisible(), is (false));
		assertThat(txtErrorPassword2.isCurrentlyVisible(), is (false));
		assertThat(txtErrorConfirmPass2.isCurrentlyVisible(), is (false));
		assertThat(txtErrordate2.isCurrentlyVisible(), is (false));
		assertThat(txtErrorUrl2.isCurrentlyVisible(), is (false));
		assertThat(txtErrorDigits.isCurrentlyVisible(), is (false));
		assertThat(txtErrorRange.isCurrentlyVisible(), is (false));
	}

	public void form_con_errores() {
		assertThat(txtErrorRequired2.isCurrentlyVisible(), is (true));
		assertThat(txtErrorEmail2.isCurrentlyVisible(), is (true));
		assertThat(txtErrorPassword2.isCurrentlyVisible(), is (true));
		assertThat(txtErrorConfirmPass2.isCurrentlyVisible(), is (true));
		assertThat(txtErrordate2.isCurrentlyVisible(), is (true));
		assertThat(txtErrorUrl2.isCurrentlyVisible(), is (true));
		assertThat(txtErrorDigits.isCurrentlyVisible(), is (true));
		assertThat(txtErrorRange.isCurrentlyVisible(), is (true));
	}


}