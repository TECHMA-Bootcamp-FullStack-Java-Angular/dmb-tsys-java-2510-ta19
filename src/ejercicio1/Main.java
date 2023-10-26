package ejercicio1;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Hola ex1 = new Hola();
					ex1.setVisible(true);
					;

				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		});

		;
	}
}
