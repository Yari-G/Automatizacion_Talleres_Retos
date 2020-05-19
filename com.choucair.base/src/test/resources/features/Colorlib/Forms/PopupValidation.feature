#Author: ygonzalezg@choucairtesting.com

@Regresion
Feature: Formulario Popup Validacion
  El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a través de un globo informativo.
  
 @CasoExitoso
 Scenario: Diligenciamiento exitoso del formulario Popup Validation,
  				no se presenta ningún mensaje de validación.
Given Autentico en colorlib con usuario "demo" y clave "demo"
  And Ingreso a la funcionalidad Forms Validation
When Diligencio Formulario Popup Validation
|Required	|Select	|MultipleS1	|MultipleS2	|Url									|Email					|Password1|Password2|MinSize|MaxSize|Number	|IP  				|Date				|DateEarlier|
|Valor1		|Golf		|Tennis			|Golf				|http://www.valor1.com|valor1@mail.com|valor1		|valor1		|123456	|123456	|-99.99	|200.200.5.4|2018-01-22	|2012/09/12	|
Then Verifico ingreso exitoso


 @CasoAlterno
 Scenario: Diligenciamiento con errores del formulario Popup Validation,
  				 Se presenta Globo Informativo indicando error en el diligenciamiento de alguno de los campos.
Given Autentico en colorlib con usuario "demo" y clave "demo"
  And Ingreso a la funcionalidad Forms Validation
When Diligencio Formulario Popup Validation
|Required	|Select					|MultipleS1	|MultipleS2	|Url									|Email					|Password1|Password2|MinSize|MaxSize|Number	|IP  				|Date				|DateEarlier|
|					|Golf						|Tennis			|Golf				|http://www.valor1.com|valor1@mail.com|valor1		|valor1		|123456	|123456	|-99.99	|200.200.5.4|2018-01-22	|2012/09/12	|
|Valor1		|Choose a sport	|Tennis			|Golf				|http://www.valor1.com|valor1@mail.com|valor1		|valor1		|123456	|123456	|-99.99	|200.200.5.4|2018-01-22	|2012/09/12	|
Then Verificar que se presente Globo Informativo de validación
    
