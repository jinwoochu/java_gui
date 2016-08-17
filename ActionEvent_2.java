package gui_ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class CjwFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public CjwFrame(){
		this.setTitle("리스너 클래스를 내부 클래스로 작성");
		this.setSize(300,200);
	
		JPanel panel=new JPanel();
		button=new JButton("버튼을 누르시오");
		label=new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(new MyListener_2());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
			
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private class MyListener_2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button){
				label.setText("버튼이 눌려졌습니다.");
				button.setText("버튼이 눌러졌습니다.");
			}
			
		}
	}
}


public class ActionEvent_2 {
	public static void main(String[] args){
		CjwFrame f= new CjwFrame();
		
	}
}
