package gui_ex;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class FlowFrame extends JFrame{
	public FlowFrame() {
		
		setTitle("FlowLayout ¿¬½À");
		setSize(300,200);
		JPanel j = new JPanel();
		this.add(j);
		j.setLayout(new FlowLayout());
		
		for(int i=0; i<10; i++){
			j.add(new JButton("Button"+(i+1)));
		}
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}

public class FlowLayoutTest {
	public static void main(String[] args) {
		FlowFrame f = new FlowFrame();
				
	}
}
