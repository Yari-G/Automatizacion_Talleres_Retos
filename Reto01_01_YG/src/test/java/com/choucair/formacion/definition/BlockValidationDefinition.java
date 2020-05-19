package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.BlockValidationSteps;
import com.choucair.formacion.steps.colorlibFormValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BlockValidationDefinition {


	@Steps
	BlockValidationSteps blockValidationSteps;
	@Steps
	colorlibFormValidationSteps colorlibFormValidationSteps;
	
	
	@Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_clave(String Usuario, String Clave) {
		blockValidationSteps.login_colorlib(Usuario, Clave);
   }

	@Given("^Ingreso a la funcionalidad Forms Validation$")
	public void ingreso_a_la_funcionalidad_Forms_Validation() {
		blockValidationSteps.ingresar_form_validation();
		
		
	}
	
	@When("^Diligencio Formulario Block Validation$")
	public void diligencio_Formulario_Block_Validation(DataTable dtDatosForm){
		List<List<String>> data = dtDatosForm.raw();
		
		for(int i=1; i<data.size(); i++) {
			colorlibFormValidationSteps.diligenciar_block_datos_tabla(data,i);
		}
		
	}
	
	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso() {
		colorlibFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
	}
	@Then("^Verificar que se presente error en la validacion$")
	public void verificar_que_se_presente_error_en_la_validacion() {
		colorlibFormValidationSteps.verificar_ingreso_datos_formulario_con_errores();
		
	}
}