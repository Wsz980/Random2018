package Random2018;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Input{
	
	static int xPos = 0;
	static int yPos = 0;
	
 	private static void keyPressed(KeyEvent e){
 		while(e.getKeyCode() == KeyEvent.VK_W) {
 			xPos++;
 		}
 		while(e.getKeyCode() == KeyEvent.VK_S) {
 			xPos--;
 		}
 		while(e.getKeyCode() == KeyEvent.VK_D) {
 			yPos++;
 		}
 		while(e.getKeyCode() == KeyEvent.VK_A) {
 			yPos--;
 		}
 	}

 	public static int setXPos() {
 		return xPos;
 	}
 	
 	public static int setYPos() {
 		return yPos;
 	}
}
