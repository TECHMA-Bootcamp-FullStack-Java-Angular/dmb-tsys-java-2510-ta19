package ejercicio4;

public class CalculadoraController {

	public static void handleClearButton() {
		 CalculadoraUI.num1 = 0;
		 CalculadoraUI.operator = ' ';
		 CalculadoraUI.textField.setText("");
	}
	
	
	/**
	*  Almacena este operador en la variable est�tica para su posterior uso en c�lculos.
	*  Luego, limpia el campo de texto de la calculadora para que el usuario pueda ingresar el siguiente n�mero.
	*
	* @param buttonText El texto del bot�n de operador presionado que se utilizar� para realizar operaciones.
	*/
	public static void handleOperatorButton(String buttonText) {
		 CalculadoraUI.operator = buttonText.charAt(0);
		 CalculadoraUI.num1 = Double.parseDouble( CalculadoraUI.textField.getText());
		 CalculadoraUI.textField.setText("");
	}

	/**
	 * Realiza el c�lculo y muestra el resultado de la operaci�n pendiente en la calculadora.
	*/
	public static void handleEqualsButton() {
		double num2 = Double.parseDouble( CalculadoraUI.textField.getText());
		double result = 0;
		switch ( CalculadoraUI.operator) {
		case '+':
			result =  CalculadoraUI.num1 + num2;
			break;
		case '-':
			result =  CalculadoraUI.num1 - num2;
			break;
		case '*':
			result =  CalculadoraUI.num1 * num2;
			break;
		case '/':
			result =  CalculadoraUI.num1 / num2;
			break;
		}
		 CalculadoraUI.textField.setText(String.valueOf(result));
		 CalculadoraUI.operator = ' ';
	}

	/**
	 * Borra el �ltimo car�cter del texto en el campo de texto de la calculadora.
	 */
	public static void handleDeleteButton() {
		String currentText =  CalculadoraUI.textField.getText();
		if (!currentText.isEmpty()) {
			 CalculadoraUI.textField.setText(currentText.substring(0, currentText.length() - 1));
		}
	}

	/**
	* Cambia el signo del n�mero actualmente en el campo de texto de la calculadora.
	*/
	public static void handleSignChange() {
		String currentText =  CalculadoraUI.textField.getText();
		if (!currentText.isEmpty()) {
			double currentNumber = Double.parseDouble(currentText);
			currentNumber *= -1;
			 CalculadoraUI.textField.setText(String.valueOf(currentNumber));
		}
	}

	/**
	* Este m�todo toma el texto del bot�n num�rico presionado y lo agrega al campo de texto de la calculadora, 
	* lo que permite que el usuario ingrese n�meros para realizar c�lculos.
	*
	* @param buttonText El texto del bot�n num�rico presionado que se debe agregar al campo de texto.
	*/
	public static void handleNumberButton(String buttonText) {
		 CalculadoraUI.textField.setText( CalculadoraUI.textField.getText() + buttonText);
	}
}


