package ejercicio3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MiniEncuestaUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ButtonGroup bgroup = new ButtonGroup();
	private JRadioButton rdbtnWindows;
	private JRadioButton rdbtnLinux;
	private JRadioButton rdbtnMacOS;
	private JCheckBox chckbxProgramador;
	private JCheckBox chckbxDesign;
	private JCheckBox chckbxAdministacion;
	private JSlider horasJlider;

	/**
	 * Create the frame.
	 */
	public MiniEncuestaUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Frame.
		setType(Type.UTILITY);
		setTitle("Encuesta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 335);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// Radio Buttom Windows
		rdbtnWindows = new JRadioButton("Windows", true);
		rdbtnWindows.setBounds(17, 51, 109, 23);
		contentPane.add(rdbtnWindows);

		// Radio Buttom Linux
		rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(17, 77, 109, 23);
		contentPane.add(rdbtnLinux);

		// Radio Buttom Mac
		rdbtnMacOS = new JRadioButton("Mac");
		rdbtnMacOS.setBounds(17, 109, 109, 23);
		contentPane.add(rdbtnMacOS);

		// Radio Buttom Group
		bgroup.add(rdbtnWindows);
		bgroup.add(rdbtnLinux);
		bgroup.add(rdbtnMacOS);

		// Check Button Programción
		chckbxProgramador = new JCheckBox("Progrmaci\u00F3n");
		chckbxProgramador.setBounds(164, 77, 139, 23);
		contentPane.add(chckbxProgramador);

		// Check Button Administración
		chckbxDesign = new JCheckBox("Adminstraci\u00F3n");
		chckbxDesign.setBounds(164, 109, 139, 23);
		contentPane.add(chckbxDesign);

		// Check Button Diseño Gráfico
		chckbxAdministacion = new JCheckBox("Dise\u00F1o Grafico");
		chckbxAdministacion.setBounds(164, 51, 157, 23);
		contentPane.add(chckbxAdministacion);

		// Label Sistema Opertivo
		JLabel lblNewLabel = new JLabel("Sistema Opertivo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(17, 25, 129, 14);
		contentPane.add(lblNewLabel);

		// Label Sistema Especialidad
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEspecialidad.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEspecialidad.setBounds(172, 25, 109, 14);
		contentPane.add(lblEspecialidad);

		// Label Sistema Horas dedicadas
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas");
		lblNewLabel_2.setBounds(17, 168, 163, 14);
		contentPane.add(lblNewLabel_2);

		// Slider Horas dedicadas al PC
		horasJlider = new JSlider();
		horasJlider.setValue(0);
		horasJlider.setPaintLabels(true);
		horasJlider.setMaximum(10);
		horasJlider.setPaintTicks(true);
		horasJlider.setToolTipText("Horas dedicadas al PC");
		horasJlider.setMinorTickSpacing(1);
		horasJlider.setMajorTickSpacing(1);
		horasJlider.setBounds(10, 186, 293, 45);
		contentPane.add(horasJlider);

		// Button Enviar -> Action Listener
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(10, 242, 293, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(aL);
		
	}

	// Comprueba las diefertes opciones y las muestra por pantalla 
	ActionListener aL = new ActionListener() {

		public void actionPerformed(ActionEvent e) {

			setVisible(false);

			String win = rdbtnWindows.isSelected() ? "Windows" : "";
			String linux = rdbtnLinux.isSelected() ? "Linux" : "";
			String mac = rdbtnMacOS.isSelected() ? "MacOS" : "";

			String dev = chckbxProgramador.isSelected() ? " Programacion " : "";
			String desing = chckbxDesign.isSelected() ? " Diseño Grafico " : "";
			String admin = chckbxAdministacion.isSelected() ? " Administacion " : "";

			String OS = "Uso " + win + linux + mac + "\n";
			String especialidad = "Para " + dev + desing + admin + "\n";
			JOptionPane.showMessageDialog(null,
					OS + especialidad + "Horas " + String.valueOf(horasJlider.getValue() + " al dia"));

		}
	};

}
