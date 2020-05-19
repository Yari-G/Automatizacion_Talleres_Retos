package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.TrelloTableroPage;
import net.thucydides.core.annotations.Step;

public class TrelloCrearTableroSteps {
	TrelloTableroPage	trelloTableroPage;
	
	@Step 									
	public void diligenciar_data_tablero(List<List<String>> data, int id){
		trelloTableroPage.NombreTablero(data.get(id).get(0).trim()); 
		trelloTableroPage.crearTablero();
		trelloTableroPage.Home();
	}
	
	public void tablero_creado() {
		trelloTableroPage.board_creado();
		
	}
}