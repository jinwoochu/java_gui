package gui_ex;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class GawiBawiBo extends JFrame implements ActionListener{
	static final int ROCK = 0;
	static final int PAPER = 1;
	static final int SCISSOR = 2;
	
	private JPanel panel;
	private JTextField output;
	private JTextField information;
	private JButton rock;
	private JButton paper;
	private JButton scissor;
	
	public GawiBawiBo() {
				
		setTitle("가위바위보 게임");
		setSize(400,300);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));
		information = new JTextField("아래의 버튼 중에서 하나를 고르시오.");
		output=new JTextField(20);
		
		rock=new JButton("Rock");
		paper=new JButton("Paper");
		scissor=new JButton("Scissor");
		
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
		
		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);
		
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int computer = random.nextInt(3);
		if(e.getSource()==rock){
			if(computer==SCISSOR)
				output.setText("사용자 승리");
			else if(computer==ROCK)
				output.setText("비겼음");
			else
				output.setText("컴퓨터 승리");
		}
		if(e.getSource()==paper){
			if(computer==SCISSOR)
				output.setText("컴퓨터 승리");
			else if(computer==PAPER)
				output.setText("비겼음");
			else
				output.setText("사용자 승리");
				
		}
		if(e.getSource()==scissor){
			if(computer==ROCK)
				output.setText("컴퓨터 승리");
			else if(computer==SCISSOR)
				output.setText("비겼음");
			else
				output.setText("사용자 승리");
		}
	}
	
}

public class GawiBawiBoEx {
	public static void main(String[] args){
		new GawiBawiBo();
	}
}
