#Author: ygonzalezg@choucairtesting.com

@Regresion
Feature: Creacion exitosa del usurio y tableros en la aplicacion Trello
  El usuario debe poder ingresar los datos requeridos para su registro en la apliacion Trello.  
	Una vez registrado, debe porder realizar la creacion de tableros dentro de la aplicacion. 
	Cada campo realiza validaciones de obligatoriedad y formato,
	el sistema debe presentar las validaciones respectivas para cada campo.
	


  @Registro
  Scenario Outline: Diligenciamiento exitoso del registro en la aplicacion Trello
    Given Ingresar email <Email>
    When Ingresar nombre <Name> y clave <Password> 
    Then Verificar creacion exitosa del usuario
    Examples: 
      |Email  				|Name 				|Password 		|
      |abz@gmail.com	|Leo Aguilar	|.Prueba12345.|
      

  @CreacionTablero
  Scenario: Diligenciamiento exitoso de la creacion de tableros.
    Given Autentico en trello con usuario "abz1@gmail.com" y clave ".HolaMundo."
    And Ingresar al vinculo de Crear Tablero
    When Ingresar nombre del tablero 
      | Nombre  	| 
      | tablero1 	| 
      | tablero2	| 
      | tablero3	|    
		Then Verificar creacion exitosa
