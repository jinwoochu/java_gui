package gui_ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setText("버튼이 눌러졌습니다.");
//		label.setText("버튼이 눌러졌습니다.");
	}
}

class JinwooFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public JinwooFrame() {
		this.setSize(300,200);
		this.setTitle("리스너를 독립적인 클래스로 작성");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}
public class ActionEvent_1 {
	public static void main(String[] args){
		JinwooFrame f= new JinwooFrame();		
	}
}
