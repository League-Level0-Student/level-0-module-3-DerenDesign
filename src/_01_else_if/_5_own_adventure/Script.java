package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Script {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("I walked up to the swamp and had a important decision to make... Should I Jump In?");
		if(answer.equals("No")) {
			JOptionPane.showMessageDialog(null, "A monster approached you and ate you! Try Again!");
			System.exit(0);
		}
		else if(answer.equals("Yes")){
			
		}
		String answer2 = JOptionPane.showInputDialog("You can see a large hole! Do you want to go in");
		if(answer2.equals("No")) {
			JOptionPane.showMessageDialog(null, "You're so boring!");
			System.exit(0);
		}
		else if(answer2.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Congrats! You chose the right chose");
		}
		
		
		
		
		
		
	}
}
