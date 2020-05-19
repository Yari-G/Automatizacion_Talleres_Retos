package com.choucair.formacion.pageobjects;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TrelloTableroPage extends PageObject{
	//Campo Titulo del Tablero
	@FindBy(xpath="//*[@id='layer-manager-overlay']/div/div/div[1]/div/input")
	public WebElementFacade txtNameBoard;
	
	//Boton Crear Tablero
	@FindBy(xpath="//*[@id='layer-manager-overlay']/div/div/div[2]/div[2]/button")
	public WebElementFacade btnCrarTablero;	
	
	//Verificar Tableros Personales
	@FindBy(xpath="//*[@id='content']/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div[1]/h3")
	public WebElementFacade lblTableros;
	
	//Botón Home
	@FindBy (xpath="//*[@id='header']/div[1]/a[1]/span")
	public WebElementFacade btnHome;
	
	public void NombreTablero(String datoPrueba) {
		txtNameBoard.click();
		txtNameBoard.clear();
		txtNameBoard.sendKeys(datoPrueba);
		
	}
	public void crearTablero() {
		btnCrarTablero.click();	
	}
	
	public void Home() {
		btnHome.click();
	}

	public void board_creado() {
		String labelv = "Tableros personales";
		String strMensaje = lblTableros.getText();
		assertThat(strMensaje,containsString(labelv));
		
	}
}
