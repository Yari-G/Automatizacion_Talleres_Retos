package com.choucair.formacion.pageobjects;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TrelloMenuPage extends PageObject{
	
	//Menú 
		@FindBy(xpath="//*[@id='header']/div[1]/button/span[1]")
		public WebElementFacade MenuTablero;
		
	//Vinculo para crear tablero
		@FindBy(xpath="//*[@id='chrome-container']/div[1]/div[1]/div/div[2]/div/div[2]/button[1]")
		public WebElementFacade vinculoCrearTablero;
			
			
	public void rutaParaCrearTablero() {
		MenuTablero.click();
		vinculoCrearTablero.click();
	}
}