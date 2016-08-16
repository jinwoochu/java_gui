package gui_ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class CalculFrame extends JFrame {
	private JPanel p1;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = {
			"Backspace","","","CE","C",
			"7","8","9","/","sqrt",
			"4","5","6","x","%",
			"1","2","3","-","1/x",
			"0","+/-",".","+","="
	};
	public CalculFrame() {

		setTitle("계산기 예제");
		setSize(550, 350);
		
		p1 = new JPanel();
		
		tField=new JTextField(35);
		tField.setText("0.");
		tField.setEnabled(false);
	
		p1.setLayout(new GridLayout(0,5,3,3));
		buttons=new JButton[25];
		int index=0;
		
		for(int rows=0; rows<5; rows++){
			for(int cols=0; cols<5; cols++){
				buttons[index]=new JButton(labels[index]);
				if(cols>=3)
					buttons[index].setForeground(Color.red); //버튼의 글자색
				else
					buttons[index].setForeground(Color.blue); 
				
				buttons[index].setBackground(Color.yellow);//버튼의 배경색				
				p1.add(buttons[index]);
				index++;
			}
		}
		add(tField,BorderLayout.NORTH);
		add(p1,BorderLayout.SOUTH);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}

}

public class CalculEx {
	public static void main(String[] args) {
		CalculFrame f = new CalculFrame();

	}
}
