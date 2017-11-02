package Random2018;

import java.awt.Color;

import javax.swing.JFrame;

public class Build {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1000, 240);
		frame.setTitle("Hello!");
		Color white = new Color(255, 255, 255);
		frame.setBackground(white);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
