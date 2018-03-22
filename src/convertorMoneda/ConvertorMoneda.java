package convertorMoneda;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class ConvertorMoneda extends JFrame implements ActionListener{
	public static void main(String[]args){
		ventana();
	}
	public static void ventana(){
		JRadioButton btnPeso;
		JRadioButton btnEuro;
		JRadioButton btnDollar;
		JRadioButton btnAPeso;
		JRadioButton btnAEuro;
		JRadioButton btnADollar;
		JButton btnConvertir;
		btnPeso = new JRadioButton("Pesos");
		btnEuro = new JRadioButton("Euros");
		btnDollar = new JRadioButton("Dollar");
		JFrame ventana = new JFrame("Convertor de monedas");
		Container contenedor = ventana.getContentPane();
		contenedor.setLayout(new GridLayout(3,2));
		JPanel entrada = new JPanel();
		entrada.setLayout(new GridLayout(2,1));
		JLabel labEntrada = new JLabel("Ingrese la cantidad");
		JTextField txtEntrada = new JTextField();
		entrada.add(labEntrada);
		entrada.add(txtEntrada);
		contenedor.add(entrada);
		ButtonGroup tipoMoneda = new ButtonGroup();
		tipoMoneda.add(btnPeso);
		tipoMoneda.add(btnEuro);
		tipoMoneda.add(btnDollar);
		JPanel btnTipos = new JPanel();
		btnTipos.add(btnPeso);
		btnTipos.add(btnEuro);
		btnTipos.add(btnDollar);
		contenedor.add(btnTipos);
		JLabel labConvertir = new JLabel("Convertir a:");
		contenedor.add(labConvertir);
		btnAPeso = new JRadioButton("Pesos");
		btnAEuro = new JRadioButton("Euros");
		btnADollar = new JRadioButton("Dollar");
		ButtonGroup AtipoMoneda = new ButtonGroup();
		AtipoMoneda.add(btnAPeso);
		AtipoMoneda.add(btnAEuro);
		AtipoMoneda.add(btnADollar);
		JPanel btnATipos = new JPanel();
		btnATipos.add(btnAPeso);
		btnATipos.add(btnAEuro);
		btnATipos.add(btnADollar);
		contenedor.add(btnATipos);
		btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(this);
		contenedor.add(btnConvertir);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.pack();
		ventana.setVisible(true);
		ventana.setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent accion) {
		System.out.println("hola");
		
	}
	

}
