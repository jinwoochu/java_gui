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
		this.setTitle("������ Ŭ������ ���� Ŭ������ �ۼ�");
		this.setSize(300,200);
	
		JPanel panel=new JPanel();
		button=new JButton("��ư�� �����ÿ�");
		label=new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
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
				label.setText("��ư�� ���������ϴ�.");
				button.setText("��ư�� ���������ϴ�.");
			}
			
		}
	}
}


public class ActionEvent_2 {
	public static void main(String[] args){
		CjwFrame f= new CjwFrame();
		
	}
}
