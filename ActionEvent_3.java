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
		this.setTitle("FrameŬ������ �̺�Ʈ�� ����");
		this.setSize(300,200);
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
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
			label.setText("��ħ�� ��ư�� ���������ϴ�.");
		}
	}
}

public class ActionEvent_3 {
	public static void main(String[] args){
		JwFrame f=new JwFrame();
	}
}
