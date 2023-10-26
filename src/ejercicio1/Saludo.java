package ejercicio1;

import java.awt.Font;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Saludo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Saludo(String nameUser) {

		initialize(nameUser);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String nameUser) {

		// From
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 136);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Label espera un UserName
		JLabel lblNewLabel = new JLabel("Hola " + nameUser);
		lblNewLabel.setBounds(136, 26, 128, 42);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);

		// Centra el JFrame en la pantalla
		setLocationRelativeTo(null);

	}
}
