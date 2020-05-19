package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://trello.com/es/signup")
public class TrelloCrearCuentaPage extends PageObject {
//Campo Email
	@FindBy(id="email")
	public WebElementFacade	txtEmail;
	
//Boton Continuar 
	@FindBy(id="signup-submit")
	public WebElementFacade	btnContinuar;
	

//Campo Nombre
	@FindBy(id="displayName")
	public WebElementFacade	txtNombre;	
	
//Campo Clave
	@FindBy(id="password")
	public WebElementFacade	txtClave;

//Boton Registrarse 
	@FindBy(id="signup-submit")
	public WebElementFacade	btnRegistro;
	


//Radio Botón de Bienvenido a Trello (el label es dinamico, por eso no se tomo como referencia)
	@FindBy(xpath="//*[@id='content']/div/div/div/div[2]/div/nav/button[1]")
	public WebElementFacade btnBienvenida;		
	

		
	public void IngresarEmail(String strEmail){
		txtEmail.sendKeys(strEmail);
		btnContinuar.click();
	}

	
	public void IngresarDatos(String strNombre, String strClave){
		txtNombre.sendKeys(strNombre);
		txtClave.sendKeys(strClave);
		btnRegistro.click();
	}
	

	public void Creacion_de_usuario() {
	//Verifica ventana de Bienvenido a Trello
		btnBienvenida.click();
	}
}