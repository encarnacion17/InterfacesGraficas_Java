import javax.swing.*;
import java.awt.event.*;

public class Marco extends JFrame implements ActionListener{
   JLabel label1;
   JButton btn1;

   public Marco(){
	setLayout(null);
	label1 = new JLabel("Esperando...");
	label1.setBounds(10,20,90,30);
	add(label1);

	btn1 = new JButton("1");
	btn1.setBounds(25,60,100,30);
	add(btn1);
	btn1.addActionListener(this);

   }

   public void actionPerformed(ActionEvent e){
	if(e.getSource() == btn1){
	   label1.setText("Boton 1");
	}
   }

   public static void main(String[] args){
 	Marco marco = new Marco();
	marco.setBounds(0,0,200,300);
	marco.setVisible(true);
	marco.setResizable(false);
	marco.setLocationRelativeTo(null);
   }

}