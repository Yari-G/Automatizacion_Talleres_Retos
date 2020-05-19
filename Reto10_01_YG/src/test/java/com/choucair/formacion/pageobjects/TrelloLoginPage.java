package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://trello.com/login")
public class TrelloLoginPage extends PageObject {
//Campo usuario
	@FindBy(id="user")
	public WebElementFacade txtUsername;
//Campo passsword
	@FindBy(id="password")
	public WebElementFacade txtPassword;
//Boton
	@FindBy(id="login")
	public WebElementFacade btnSignIn;
//label del home a verificar
	@FindBy(xpath="//*[@id='content']/div/div[2]/div/div/div/div/div[2]/div/div/div/div[1]/h3")
	public WebElementFacade lblHomePpal;
		

	public void IngresarDatos(String strUsuario, String strPass){
		txtUsername.sendKeys(strUsuario);
		txtPassword.sendKeys(strPass);
		btnSignIn.click();
		}
	
		
	public void VerificaHome(){
		String labelv = "Tableros personales";
		String strMensaje = lblHomePpal.getText();
		assertThat(strMensaje, containsString(labelv));
		}	
		
}