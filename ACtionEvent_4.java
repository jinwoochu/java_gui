package gui_ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ChuFrame extends JwFrame{
	
	private JButton button;
	private JLabel label;
	
	public ChuFrame() {
		this.setSize(300,200);
		this.setTitle("무명클래스를 사용한 방법");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button){
					label.setText("버튼이 눌러졌습니다.");
					button.setText("버튼이 눌러졌습니다.");
				}
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}

public class ACtionEvent_4 {
	public static void main(String[] args){
		ChuFrame f= new ChuFrame();
		
	}
}
