package ejercicio2;

import java.awt.EventQueue;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					PeliculasUI frm = new PeliculasUI();
					frm.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		});

		;
	}
}
