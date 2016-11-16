import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI {

	private JFrame frame;
	private JTextField textFieldUsuario;
	private JTextField textFieldContra;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 885, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel paginaPrincipal = new JPanel();
		frame.getContentPane().add(paginaPrincipal, "name_3359906548350");
		paginaPrincipal.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Proyecto: Woods - Dieter - Jerry");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(261, 58, 455, 73);
		paginaPrincipal.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(72, 185, 71, 28);
		paginaPrincipal.add(lblNewLabel_1);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(191, 189, 263, 22);
		paginaPrincipal.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contrasena");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(72, 267, 106, 42);
		paginaPrincipal.add(lblNewLabel_2);
		
		textFieldContra = new JTextField();
		textFieldContra.setColumns(10);
		textFieldContra.setBounds(190, 278, 263, 22);
		paginaPrincipal.add(textFieldContra);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(191, 376, 136, 42);
		paginaPrincipal.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Crear Usuario");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(582, 246, 189, 125);
		paginaPrincipal.add(btnNewButton_1);
		
		JPanel AgregarUsuario = new JPanel();
		frame.getContentPane().add(AgregarUsuario, "name_3368813042618");
		AgregarUsuario.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Agregar Usuario");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_3.setBounds(321, 42, 274, 87);
		AgregarUsuario.add(lblNewLabel_3);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(91, 165, 106, 38);
		AgregarUsuario.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEdad.setBounds(91, 226, 106, 38);
		AgregarUsuario.add(lblEdad);
		
		JLabel lblCarrera = new JLabel("Carrera");
		lblCarrera.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCarrera.setBounds(91, 307, 106, 38);
		AgregarUsuario.add(lblCarrera);
		
		textField_2 = new JTextField();
		textField_2.setBounds(209, 174, 265, 22);
		AgregarUsuario.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(209, 235, 265, 22);
		AgregarUsuario.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(209, 316, 265, 22);
		AgregarUsuario.add(textField_4);
		
		JButton btnAgregarlo = new JButton("Agregarlo");
		btnAgregarlo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAgregarlo.setBounds(569, 173, 183, 159);
		AgregarUsuario.add(btnAgregarlo);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAtras.setBounds(209, 385, 151, 38);
		AgregarUsuario.add(btnAtras);
		
		JPanel NuevoRestaurante = new JPanel();
		frame.getContentPane().add(NuevoRestaurante, "name_4142407088969");
		NuevoRestaurante.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Nuevo Restaurante");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_4.setBounds(302, 68, 347, 78);
		NuevoRestaurante.add(lblNewLabel_4);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre_1.setBounds(99, 165, 103, 35);
		NuevoRestaurante.add(lblNombre_1);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipo.setBounds(99, 219, 103, 35);
		NuevoRestaurante.add(lblTipo);
		
		JLabel lblMa = new JLabel("Mayormente Consumido");
		lblMa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMa.setBounds(99, 278, 188, 35);
		NuevoRestaurante.add(lblMa);
		
		JLabel lblUbicacion = new JLabel("Ubicacion");
		lblUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUbicacion.setBounds(99, 337, 103, 35);
		NuevoRestaurante.add(lblUbicacion);
		
		textField_5 = new JTextField();
		textField_5.setBounds(316, 172, 323, 22);
		NuevoRestaurante.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(316, 226, 323, 22);
		NuevoRestaurante.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(316, 285, 323, 22);
		NuevoRestaurante.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(316, 344, 323, 22);
		NuevoRestaurante.add(textField_8);
		
		JButton btnNewButton_2 = new JButton("Agregar");
		btnNewButton_2.setBounds(684, 171, 123, 201);
		NuevoRestaurante.add(btnNewButton_2);
		
		JButton btnAtras_1 = new JButton("Atras");
		btnAtras_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAtras_1.setBounds(316, 400, 115, 41);
		NuevoRestaurante.add(btnAtras_1);
		
		JPanel Recomend = new JPanel();
		frame.getContentPane().add(Recomend, "name_4798007402486");
		Recomend.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Recomendaciones");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_5.setBounds(340, 73, 238, 57);
		Recomend.add(lblNewLabel_5);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setBounds(115, 159, 651, 34);
		Recomend.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_10.setColumns(10);
		textField_10.setBounds(115, 219, 651, 34);
		Recomend.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_11.setColumns(10);
		textField_11.setBounds(115, 279, 651, 34);
		Recomend.add(textField_11);
		
		JButton btnNewButton_3 = new JButton("Agregar Amigo");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(364, 342, 164, 34);
		Recomend.add(btnNewButton_3);
		
		JButton btnAgregarRestaurante = new JButton("Agregar Restaurante");
		btnAgregarRestaurante.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAgregarRestaurante.setBounds(211, 405, 186, 34);
		Recomend.add(btnAgregarRestaurante);
		
		JButton btnQuitarRestaurante = new JButton("Quitar Restaurante");
		btnQuitarRestaurante.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnQuitarRestaurante.setBounds(473, 405, 186, 34);
		Recomend.add(btnQuitarRestaurante);
	}
}
