package gui_ex;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class PizzaFrame extends JFrame{
	public PizzaFrame() {
		
		setSize(550,150);
		setTitle("���� �ֹ���");
		
		JPanel root = new JPanel();
		this.add(root);
		JPanel bridge1 = new JPanel();
		JPanel bridge2 = new JPanel();
		root.add(bridge1);
		root.add(bridge2);
		
		JLabel headwrite = new JLabel("�Ѹ��� �Դ� ����� �������!!");  
		bridge1.add(headwrite);
		
		JButton button1 = new JButton("������������");
		JButton button2 = new JButton("�������");
		JButton button3 = new JButton("Ǫ������������");
		JLabel gatsu = new JLabel("����");
		JTextField bincan = new JTextField(10);		//JTextField(int a) << a��� �Ű������� 
													//�޾Ƽ� �ؽ�Ʈ�ʵ��� ũ�⸦ �����Ѵ�.
		bridge2.add(button1);
		bridge2.add(button2);
		bridge2.add(button3);
		bridge2.add(gatsu);
		bridge2.add(bincan);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		

	}
}

public class PizzaOrder {
	public static void main(String[] args){
		PizzaFrame f = new PizzaFrame();
		
		
		
	}
}
