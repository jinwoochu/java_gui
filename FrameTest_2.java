package gui_ex;

import javax.swing.JFrame;

class NewFrame extends JFrame{
	public NewFrame(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("NewFrame");
		setVisible(true);
	}
}

public class FrameTest_2 {
	public static void main(String[] args){
		NewFrame f=new NewFrame();
	}
}
