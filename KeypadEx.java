package gui_ex;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Keypad extends JFrame implements ActionListener{
	
	private JLabel label;
	private JPanel panel;
	private JTextField txt;
	
	
	public Keypad() {
		this.setTitle("keypad 예제");
		
		txt=new JTextField(20);
		txt.setPreferredSize(new Dimension(30000,30)); //아무리 큰수를 넣어도 최대범위를 넘지않는다.
		this.add(txt, BorderLayout.NORTH);
		panel=new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		this.add(panel, BorderLayout.CENTER);

		for(int i=0;i<9;i++){
			JButton button = new JButton(""+(i+1));
			button.addActionListener(this);
			button.setPreferredSize(new Dimension(100, 100));
			panel.add(button);
		}
		pack();
			
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		txt.setText(txt.getText()+actionCommand);
	}
}

public class KeypadEx {
	public static void main(String[] args){
		Keypad f=new Keypad();
	}
}
