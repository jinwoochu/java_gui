package gui_ex;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class OndogiFrame extends JFrame{
	public OndogiFrame() {
		setSize(300,150);
		setTitle("¿Âµµº¯È¯±â");
		
		JPanel panel_1 = new JPanel();
		this.add(panel_1);
		
		JLabel label1 = new JLabel("È­¾¾ ¿Âµµ");
		JLabel label2 = new JLabel("¼·¾¾ ¿Âµµ");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("º¯È¯");
		panel_1.add(label1);
		panel_1.add(field1);
		panel_1.add(label2);
		panel_1.add(field2);
		panel_1.add(button);
				
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class Ondo {
	public static void main(String[] args){
		OndogiFrame f = new OndogiFrame();
	}
}
