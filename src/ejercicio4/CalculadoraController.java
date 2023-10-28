package ejercicio4;

public class CalculadoraController {

	public static void handleClearButton() {
		 CalculadoraUI.num1 = 0;
		 CalculadoraUI.operator = ' ';
		 CalculadoraUI.textField.setText("");
	}

	public static void handleOperatorButton(String buttonText) {
		 CalculadoraUI.operator = buttonText.charAt(0);
		 CalculadoraUI.num1 = Double.parseDouble( CalculadoraUI.textField.getText());
		 CalculadoraUI.textField.setText("");
	}

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

	public static void handleDeleteButton() {
		String currentText =  CalculadoraUI.textField.getText();
		if (!currentText.isEmpty()) {
			 CalculadoraUI.textField.setText(currentText.substring(0, currentText.length() - 1));
		}
	}

	public static void handleSignChange() {
		String currentText =  CalculadoraUI.textField.getText();
		if (!currentText.isEmpty()) {
			double currentNumber = Double.parseDouble(currentText);
			currentNumber *= -1;
			 CalculadoraUI.textField.setText(String.valueOf(currentNumber));
		}
	}

	public static void handleNumberButton(String buttonText) {
		 CalculadoraUI.textField.setText( CalculadoraUI.textField.getText() + buttonText);
	}
}


