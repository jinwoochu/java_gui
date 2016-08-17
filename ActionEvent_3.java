package gui_ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class JwFrame extends JFrame implements ActionListener{
	
	private JButton button;
	private JLabel label;
	
	public JwFrame() {
		this.setTitle("Frame클래스가 이벤트를 구현");
		this.setSize(300,200);
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);		
		this.add(panel);
				
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button){
			label.setText("마침내 버튼이 눌러졌습니다.");
		}
	}
}

public class ActionEvent_3 {
	public static void main(String[] args){
		JwFrame f=new JwFrame();
	}
}
