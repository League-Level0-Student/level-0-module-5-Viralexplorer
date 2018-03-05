import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.omg.Messaging.SyncScopeHelper;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
Robot viral= new Robot("mini");
		//2. Set the speed to 100
viral.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", "Color 3"}, 0);
		
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		System.out.println(colorChoice);
		if (colorChoice==0) {
			viral.setPenColor(Color.BLUE);
			viral.penDown();
		}
		if (colorChoice==1) {
			viral.setPenColor(Color.GREEN);
	viral.penDown();	
		}
		
		if (colorChoice==2) {
			viral.setPenColor(Color.BLACK);
		viral.penDown();
		}
		
		//4. Ask the use how many polygons they want to be drawn.
	String num=JOptionPane.showInputDialog(null, "How many polygons do you want");
	int fiv = Integer.parseInt(num);	
	
	//5. Use the robot to draw the number of polygons the user requested.

		//6. Make it so your shapes do not overlap
for (int i = 0; i < fiv; i++) {
	for (int j = 0; j < 4; j++) {
	
	viral.move(50);
	viral.turn(90);
	
}
	viral.penUp();
	viral.move(70);
	viral.penDown();
}
		//7. Challenge: add more colors to the Option Dialog.
	}
}

