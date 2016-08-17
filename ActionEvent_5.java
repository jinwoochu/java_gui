package gui_ex;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ramdaFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public ramdaFrame() {
		this.setSize(300,200);
		this.setTitle("람다식을 활용하는 리스너 클래스");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		
		button.addActionListener(e ->{
			label.setText("버튼이 눌러졌습니다.");
			button.setText("버튼이 눌러졌습니다.");
		});
		panel.add(button);
		panel.add(label);
		this.add(panel);	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}


public class ActionEvent_5 {
	public static void main(String[] args){
		ramdaFrame f=new ramdaFrame();
		
	}
}
