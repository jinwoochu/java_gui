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
		this.setTitle("���ٽ��� Ȱ���ϴ� ������ Ŭ����");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
		button.addActionListener(e ->{
			label.setText("��ư�� ���������ϴ�.");
			button.setText("��ư�� ���������ϴ�.");
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
