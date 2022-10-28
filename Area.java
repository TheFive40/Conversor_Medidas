package JuegosMatematicos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class Area {

	private JFrame frame;
	private JTextField Valor;
	private JTextField Resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Area window = new Area();
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
	public Area() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JComboBox Opciones = new JComboBox();
		Opciones.setModel(new DefaultComboBoxModel(new String[] {"Convertir a: ", "Centimetros", "Milimetro", "Kilometros", "Decimetros", "Decametro", "Micrometro","Nanometros", "Millas", "Yarda", "Pie", "Pulgada", "Milla Nautica"}));
		Opciones.setToolTipText("Convertir a: \r\nCentimetros \r\nMetros\r\nKilometros\r\nDecimetros\r\nDecametros");
		Opciones.setBounds(10, 98, 230, 22);
		frame.getContentPane().add(Opciones);
		
		JLabel Etiqueta1 = new JLabel("INGRESE EL VALOR EN METROS");
		Etiqueta1.setFont(new Font("Leelawadee UI", Font.BOLD | Font.ITALIC, 15));
		Etiqueta1.setBounds(10, 43, 230, 25);
		frame.getContentPane().add(Etiqueta1);
		
		Valor = new JTextField();
		Valor.setBounds(250, 43, 86, 28);
		frame.getContentPane().add(Valor);
		Valor.setColumns(10);
		
		Resultado = new JTextField();
		Resultado.setColumns(10);
		Resultado.setBounds(250, 95, 86, 28);
		frame.getContentPane().add(Resultado);
		
		JButton Calcular = new JButton("Calcular");
		Calcular.setBounds(250, 157, 86, 45);
		frame.getContentPane().add(Calcular);
		
		JLabel Etiqueta2 = new JLabel("RESULTADO");
		Etiqueta2.setFont(new Font("Leelawadee UI", Font.BOLD | Font.ITALIC, 15));
		Etiqueta2.setBounds(250, 121, 103, 25);
		frame.getContentPane().add(Etiqueta2);
		
		JLabel Titulo = new JLabel("CONVERSOR DE MEDIDAS");
		Titulo.setFont(new Font("Leelawadee UI", Font.BOLD | Font.ITALIC, 15));
		Titulo.setBounds(93, 0, 230, 25);
		frame.getContentPane().add(Titulo);		
		class AccionEvento implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
					if(Opciones.getSelectedItem()=="Kilometros") {
					String Metros_Kilometros = Valor.getText();int Metros = Integer.parseInt(Metros_Kilometros);
					int resultado = Metros/1000;Resultado.setText(" " + resultado);
					}else if (Opciones.getSelectedItem()=="Centimetros") {
						String Metros_Centimetros = Valor.getText();int Metros = Integer.parseInt(Metros_Centimetros);
						int resultado = Metros*100;Resultado.setText(" " + resultado);
					}else if (Opciones.getSelectedItem()=="Decimetros") {
						String Metros_Decimetros = Valor.getText();int Metros = Integer.parseInt(Metros_Decimetros);
						int resultado = Metros*10;Resultado.setText(" " + resultado);
					}else if (Opciones.getSelectedItem()=="Decametro") {
						String Metros_Decametro = Valor.getText();int Metros = Integer.parseInt(Metros_Decametro);
						int resultado = Metros/10;Resultado.setText(" " + resultado);
					}else if (Opciones.getSelectedItem()=="Milimetro") {
						String Metros_Milimetro = Valor.getText();int Metros = Integer.parseInt(Metros_Milimetro);
						int resultado = Metros*1000;Resultado.setText(" " + resultado);
					}else if (Opciones.getSelectedItem()=="Micrometro") {
						String Metros_Micrometro = Valor.getText();int Metros = Integer.parseInt(Metros_Micrometro);
						int resultado = Metros*1000000;Resultado.setText(" " + resultado);
					}else if (Opciones.getSelectedItem()=="Nanometro") {
						String Metros_Nanometro = Valor.getText();int Metros = Integer.parseInt(Metros_Nanometro);
						int resultado = Metros*1000000000;Resultado.setText(" " + resultado);
					}else if (Opciones.getSelectedItem()=="Millas") {
						String Metros_Millas = Valor.getText();int Metros = Integer.parseInt(Metros_Millas);
						int resultado = Metros*1/1609;Resultado.setText(" " + resultado);
					}else if (Opciones.getSelectedItem()=="Yarda") {
						String Metros_Yarda = Valor.getText();int Metros = Integer.parseInt(Metros_Yarda);
						int resultado = Metros*1094;Resultado.setText(" " + resultado);
					}else if (Opciones.getSelectedItem()=="Pie") {
						String Metros_Pie = Valor.getText();int Metros = Integer.parseInt(Metros_Pie);
						double resultado = Metros*3.281;Resultado.setText(" " + resultado);
					}else if (Opciones.getSelectedItem()=="Pulgada") {
						String Metros_Pulgada = Valor.getText();int Metros = Integer.parseInt(Metros_Pulgada);
						double resultado = Metros*39.37;Resultado.setText(" " + resultado);
					}else if (Opciones.getSelectedItem()=="Milla Nautica") {
						String Metros_MillaNautica = Valor.getText();int Metros = Integer.parseInt(Metros_MillaNautica);
						int resultado = Metros/1852;Resultado.setText(" " + resultado);
					}
					
				
			}
			
		}
		Calcular.addActionListener(new AccionEvento());
	}
}
