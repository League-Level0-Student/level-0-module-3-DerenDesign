package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {
	public static void main(String[] args) {
		String Start = JOptionPane.showInputDialog(null, "Are you happy?");
		if (Start.equalsIgnoreCase("No")) {
			String PartTwo = JOptionPane.showInputDialog(null, "Do you want to be happy?");
			if(PartTwo.equalsIgnoreCase("No")) {
				System.out.print("Keep doing whatever");
			}
			else if(PartTwo.equalsIgnoreCase("Yes")) {
				System.out.print("Change something");
			}
			
		}	
		else if (Start.equalsIgnoreCase("Yes")){
				System.out.print("Keep doing whatever");
		}
	
}
}