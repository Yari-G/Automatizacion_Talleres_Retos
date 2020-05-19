package com.choucair.formacion.steps;

import java.util.List;
import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;
import net.thucydides.core.annotations.Step;


public class colorlibFormValidationSteps {
	
	  ColorlibFormValidationPage colorlibFormValidationPage;
		
	@Step
	public  void diligenciar_block_datos_tabla(List<List<String>> data, int id) {
		colorlibFormValidationPage.Required(data.get(id).get(0).trim());
		colorlibFormValidationPage.email(data.get(id).get(1).trim());
		colorlibFormValidationPage.password(data.get(id).get(2).trim());
		colorlibFormValidationPage.confirm_password(data.get(id).get(3).trim());
		colorlibFormValidationPage.date(data.get(id).get(4).trim());
		colorlibFormValidationPage.url(data.get(id).get(5).trim());
		colorlibFormValidationPage.Digits(data.get(id).get(6).trim());
		colorlibFormValidationPage.Range(data.get(id).get(7).trim());
		colorlibFormValidationPage.Check();
		colorlibFormValidationPage.validate();
	}
	@Step
	public void verificar_ingreso_datos_formulario_exitoso() {
		colorlibFormValidationPage.form_sin_errores();
	}
	@Step
	public void verificar_ingreso_datos_formulario_con_errores() {
		colorlibFormValidationPage.form_con_errores();
	}
	
}

