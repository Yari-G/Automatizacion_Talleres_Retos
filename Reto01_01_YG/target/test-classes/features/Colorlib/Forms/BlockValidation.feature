#Author: ygonzalezg@choucairtesting.com

@Regresion
Feature: Formulario Block Validacion
  El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a través de un globo informativo.
  
 @CasoExitoso
 Scenario: Diligenciamiento exitoso del formulario Block Validation,
  				no se presenta ningún mensaje de validación.
Given Autentico en colorlib con usuario "demo" y clave "demo"
  And Ingreso a la funcionalidad Forms Validation
When Diligencio Formulario Block Validation
|Required	|Email						|Password		|Password2	|Date				|Url									|Digit	|Range|
|Valor7		|pru3b4@mail.com	|holamund0	|holamund0	|01/01/2019	|http://www.valor1.com|1234567|10		|
Then Verifico ingreso exitoso


 @CasoAlterno
 Scenario: Diligenciamiento con errores del formulario Block Validation,
  				 Se presenta Globo Informativo indicando error en el diligenciamiento de alguno de los campos.
Given Autentico en colorlib con usuario "demo" y clave "demo"
  And Ingreso a la funcionalidad Forms Validation
When Diligencio Formulario Block Validation
|Required	|Email						|Password		|Password2	|Date				|Url					|Digit		|Range|
|					|correo@.com			|						|holamund1	|01/03/			|http://www.	|abcdef11	|1		|
Then Verificar que se presente error en la validacion
    