package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.TrelloCrearCuentaPage;
import com.choucair.formacion.pageobjects.TrelloLoginPage;

import net.thucydides.core.annotations.Step;

public class TrelloCrearCuentaSteps {

		TrelloCrearCuentaPage trelloCrearCuentaPage; 
		TrelloLoginPage trelloLoginPage;
		@Step
		public void ingresar_email(String strEmail) {
//			a. Abrir navegador con la url de prueba
			trelloCrearCuentaPage.open(); 
//			b. Ingresar Email
//			c. Presionar boton Continuar 
			trelloCrearCuentaPage.IngresarEmail(strEmail);		

		}

		@Step
		public void ingresar_nombre_clave(String strNombre, String strClave) { 
/*			d. Ingresar usuario 
	  		e. Ingresar password 
	  		f. Click en botón Registrarse */
			trelloCrearCuentaPage.IngresarDatos(strNombre, strClave);
		}

		@Step
		public void verificar_creacion() {
//	 		g. Verificar creación exitosa de usuario 
			trelloCrearCuentaPage.Creacion_de_usuario();
		}
}
