//4 botones en forma de cuadrado

import javax.swing.*;
import java.awt.event.*;

public class Opciones extends JFrame implements ActionListener{
   private JLabel label1;
   private JButton btn1, btn2, btn3, btn4;

   public Opciones(){
	setLayout(null);
	label1 = new JLabel("Presiona un boton");
	label1.setBounds(10,20,150,30);
	add(label1);

	btn1 = new JButton("Boton 1");
	btn1.setBounds(10,110,90,30);
	add(btn1);
	btn1.addActionListener(this);

	btn2 = new JButton("Boton 2");
	btn2.setBounds(110,110,90,30);
	add(btn2);
	btn2.addActionListener(this);

	btn3 = new JButton("Boton 3");
	btn3.setBounds(10,160,90,30);
	add(btn3);
	btn3.addActionListener(this);

	btn4 = new JButton("Boton 4");
	btn4.setBounds(110,160,90,30);
	add(btn4);
	btn4.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e){
	if(e.getSource() == btn1){
	   label1.setText("Presionaste el 1");
	}
	else if(e.getSource() == btn2){
	   label1.setText("Presionaste el 2");
	}
	else if(e.getSource() == btn3){
	   label1.setText("Presionaste el 3");
	}
	else if(e.getSource() == btn4){
	   label1.setText("Presionaste el 4");
	}	
   }
   
   public static void main(String[] args){
	Opciones opcion = new Opciones();
	opcion.setBounds(0,0,250,250);
	opcion.setVisible(true);
	opcion.setResizable(false);
	opcion.setLocationRelativeTo(null);
   }
}