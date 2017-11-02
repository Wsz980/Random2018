package Random2018;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GUI extends JPanel {

	public GUI(int x) {
		this.setSize(1000, 250);
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Color blue = new Color(100, 100, 239);
		g2.setColor(blue);
		g2.fillRect(getXPos(), getYPos(), 50, 150);
	}

	public static int getXPos() {
		return Input.setXPos();
	}

	public static int getYPos() {
		return Input.setYPos();
	}

}
