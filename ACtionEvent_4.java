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
		this.setTitle("����Ŭ������ ����� ���");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button){
					label.setText("��ư�� ���������ϴ�.");
					button.setText("��ư�� ���������ϴ�.");
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
