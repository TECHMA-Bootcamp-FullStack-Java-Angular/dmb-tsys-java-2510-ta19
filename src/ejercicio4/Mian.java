package ejercicio4;
import javax.swing.SwingUtilities;

public class Mian {

	public static void main(String[] args) {

		try {
			CalculadoraUI cal = new CalculadoraUI();
			SwingUtilities.invokeLater(() -> cal.frame.setVisible(true));
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
