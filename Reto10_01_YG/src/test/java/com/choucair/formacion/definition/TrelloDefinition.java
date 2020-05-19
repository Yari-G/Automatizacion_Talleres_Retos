package com.choucair.formacion.definition;


import java.util.List;

import com.choucair.formacion.steps.TrelloCrearCuentaSteps;
import com.choucair.formacion.steps.TrelloCrearTableroSteps;
import com.choucair.formacion.steps.TrelloSteps;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TrelloDefinition {

	@Steps
	TrelloCrearCuentaSteps trelloCrearCuentaSteps;
	@Steps
	TrelloSteps trelloSteps;
	@Steps
	TrelloCrearTableroSteps trelloCrearTableroSteps;
	
//Scenario 1 - @Registro
	@Given("^Ingresar email ([^\"]*)$")
	public void ingresar_email(String email){
		trelloCrearCuentaSteps.ingresar_email(email);
	}
	
	@When("^Ingresar nombre ([^\"]*) y clave ([^\"]*)$")
	public void ingresar_nombre_y_clave(String nombre, String clave){
		trelloCrearCuentaSteps.ingresar_nombre_clave(nombre, clave);
	
			try {
				Thread.sleep(90000);
			}catch(InterruptedException e) {}
		}		
		
	@Then("^Verificar creacion exitosa del usuario$")
	public void verificar_creacion_exitosa_del_usuario() {
		trelloCrearCuentaSteps.verificar_creacion();
	}	

	
	
//Scenario 2 - @CreacionTablero	
	@Given("^Autentico en trello con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_trello_con_usuario_y_clave(String Usuario, String Clave) {
		 trelloSteps.login_trello(Usuario, Clave);
	    
	}

	@Given("^Ingresar al vinculo de Crear Tablero$")
	public void ingresar_al_vinculo_de_Crear_Tablero() {
		trelloSteps.ingresar_a_creacion_tablero();
	}

	@When("^Ingresar nombre del tablero$")
	public void ingresar_nombre_del_tablero(DataTable dtDatosForm)  {
		List<List<String>> data = dtDatosForm.raw();
		
		for(int i=1; i<data.size(); i++) {
			trelloCrearTableroSteps.diligenciar_data_tablero(data,i);		
			trelloSteps.ingresar_a_creacion_tablero();
		}
	} 

	@Then("^Verificar creacion exitosa$")
	public void verificar_creacion_exitosa()  {
		trelloCrearTableroSteps.tablero_creado();
	}
}


