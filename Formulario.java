import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
   private JLabel label1;
   private  JButton btn1, btn2, btn3;

   public Formulario(){
	setLayout(null);
	label1 = new JLabel("Esperando...");
	label1.setBounds(10,10,200,30);
	add(label1);

	btn1 = new JButton("1");
	btn1.setBounds(10,90,100,30);
	add(btn1);
	btn1.addActionListener(this);

	btn2 = new JButton("2");
	btn2.setBounds(120,90,100,30);
	add(btn2);
	btn2.addActionListener(this);

	btn3 = new JButton("3");
	btn3.setBounds(230,90,100,30);
	add(btn3);
	btn3.addActionListener(this);
   }
  
   public void actionPerformed(ActionEvent e){
	if(e.getSource() == btn1){
	   label1.setText("Has presionado el boton 1");
	} 
      else if(e.getSource() == btn2){
	   label1.setText("Has presionado el boton 2");
	} 
	else if(e.getSource() == btn3){
	   label1.setText("Has presionado el boton 3");
	} 
   }

   public static void main(String[] args){
	Formulario form1 = new Formulario();
	form1.setBounds(0,0,360,180);
	form1.setVisible(true);
	form1.setResizable(false);
	form1.setLocationRelativeTo(null);
   }
}