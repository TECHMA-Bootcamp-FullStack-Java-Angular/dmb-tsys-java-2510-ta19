package ejercicio2;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Window.Type;
import javax.swing.DefaultComboBoxModel;

public class PeliculasUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	public JComboBox<String> comboBox = new JComboBox<String>();

	/**
	 * Create the frame.
	 */
	public PeliculasUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Frame.
		setType(Type.UTILITY);
		setTitle("Pel\u00EDculas");
		setBounds(100, 100, 450, 202);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		setLocationRelativeTo(null);

		// ComboBox -> 3 pelis por defecto
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "Avatar", "300", "Rambo" }));
		comboBox.setToolTipText("");
		comboBox.setBounds(231, 45, 193, 23);
		getContentPane().add(comboBox);

		// Imput
		textField = new JTextField();
		textField.setBounds(19, 45, 202, 23);
		getContentPane().add(textField);
		textField.setColumns(10);

		// Label: Añadir pelicula
		JButton btnNewButton = new JButton("A\u00F1adir Pel\u00EDcula");
		btnNewButton.addActionListener(add);
		btnNewButton.setBounds(19, 79, 130, 23);
		getContentPane().add(btnNewButton);

		// Label: Titulo de la pelicula
		JLabel lblNewLabel = new JLabel("Escribe el t\u00EDtulo de una pelicula");
		lblNewLabel.setBounds(19, 20, 202, 14);
		getContentPane().add(lblNewLabel);

		// Label: Peliculas
		JLabel lblNewLabel_1 = new JLabel("Pel\u00EDculas");
		lblNewLabel_1.setBounds(231, 20, 88, 14);
		getContentPane().add(lblNewLabel_1);

	}

	/**
	 * Este ActionListener responde al hacer clic en el botón. Agrega como un nuevo
	 * elemento en la posición superior del JComboBox (comboBox), lo selecciona y
	 * luego vacía el campo de texto.
	 */
	ActionListener add = new ActionListener() {

		public void actionPerformed(ActionEvent e) {

			if (!textField.getText().isEmpty()) {

				String value = textField.getText();
				comboBox.insertItemAt(value, 0);
				comboBox.setSelectedIndex(0);
				textField.setText("");

			} else {
				JOptionPane.showMessageDialog(null, "Debes de colocar una película");
			}

		}
	};

}
