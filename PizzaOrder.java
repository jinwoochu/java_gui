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
		setTitle("피자 주문기");
		
		JPanel root = new JPanel();
		this.add(root);
		JPanel bridge1 = new JPanel();
		JPanel bridge2 = new JPanel();
		root.add(bridge1);
		root.add(bridge2);
		
		JLabel headwrite = new JLabel("싼맛에 먹는 진우네 대박피자!!");  
		bridge1.add(headwrite);
		
		JButton button1 = new JButton("배터지는피자");
		JButton button2 = new JButton("대박피자");
		JButton button3 = new JButton("푸드파이터피자");
		JLabel gatsu = new JLabel("개수");
		JTextField bincan = new JTextField(10);		//JTextField(int a) << a라는 매개변수를 
													//받아서 텍스트필드의 크기를 지정한다.
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
