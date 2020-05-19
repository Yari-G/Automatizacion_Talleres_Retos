package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.TrelloLoginPage;
import com.choucair.formacion.pageobjects.TrelloMenuPage;

import net.thucydides.core.annotations.Step;

public class TrelloSteps {

	TrelloLoginPage trelloLoginPage; 
	TrelloMenuPage trelloMenuPage;
	
	@Step
	public void login_trello(String strUsuario, String strPass) { 
//		a. Abrir navegador con la url de prueba
		trelloLoginPage.open(); 
/*		b. Ingresar usuario 
  		c. Ingresar password 
  		d. Click en botón iniciar sesion */
		trelloLoginPage.IngresarDatos(strUsuario, strPass);		
// 		e. Verificar la Autenticación (label en home)	
		trelloLoginPage.VerificaHome(); 
	}
	
	@Step
	public void ingresar_a_creacion_tablero(){
		trelloMenuPage.rutaParaCrearTablero();
	}
	
}