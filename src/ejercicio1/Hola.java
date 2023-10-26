package ejercicio1;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Hola extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Hola() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Frame.
		setTitle("Saludador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Centra el JFrame en la pantalla
		setLocationRelativeTo(null);

		// Imput -> Key (ENTER) Listener
		textField = new JTextField();
		textField.setBounds(105, 122, 230, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addKeyListener(aK);

		// Label
		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(115, 67, 201, 30);
		contentPane.add(lblNewLabel);

		// Button -> Action Listener
		JButton btnSaludar = new JButton("¡Saludar!");
		btnSaludar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSaludar.setBounds(181, 153, 89, 23);
		contentPane.add(btnSaludar);
		btnSaludar.addActionListener(aL);

	}

	/**
	 * Este ActionListener de hacer clic en un botón. Verifica si el campo de texto
	 * no está vacío, crea un Saludo, lo hace visible y y oculta la ventana actual.
	 *
	 * @param e El evento de acción que desencadena este ActionListener.
	 */
	ActionListener aL = new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if (!textField.getText().isEmpty()) {

				Saludo saludo = new Saludo(textField.getText());
				saludo.setVisible(true);

				setVisible(false);

			} else {
				JOptionPane.showMessageDialog(null, "Si no escribes tu nombre no te podré saludar");
			}

		}
	};

	/**
	 * Este KeyAdapter de hacer ENTER. Verifica si el campo de texto no está vacío,
	 * crea un Saludo, lo hace visible y y oculta la ventana actual.
	 */
	KeyAdapter aK = new KeyAdapter() {

		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {

				if (!textField.getText().isEmpty()) {

					Saludo saludo = new Saludo(textField.getText());
					saludo.setVisible(true);
					setVisible(false);

				} else {
					JOptionPane.showMessageDialog(null, "Si no escribes tu nombre no te podré saludar");
				}

			}
		}
	};
}
