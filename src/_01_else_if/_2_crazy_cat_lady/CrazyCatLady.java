
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String answer = JOptionPane.showInputDialog(null, "How many cats do you have");
		Integer.parseInt(answer);
		int Answer = Integer.parseInt(answer);
		if (Answer >= 3) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady!");
			
		}
		else if (Answer <= 3 && Answer > 0) {
			playVideo("https://www.youtube.com/watch?v=NIGnmOY-OCg");
		}
		else if (Answer == 0) {
			playVideo("https://www.youtube.com/watch?v=ZJT9CeEhM10");
		}
		
		// 2. Convert their answer into an int
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

