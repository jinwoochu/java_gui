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
		button.setText("��ư�� ���������ϴ�.");
//		label.setText("��ư�� ���������ϴ�.");
	}
}

class JinwooFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public JinwooFrame() {
		this.setSize(300,200);
		this.setTitle("�����ʸ� �������� Ŭ������ �ۼ�");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
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
