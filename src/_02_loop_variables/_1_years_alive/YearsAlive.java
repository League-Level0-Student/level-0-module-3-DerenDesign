package _02_loop_variables._1_years_alive;

public class YearsAlive {
	public static void main(String[] args) {
		int x = 2007;
		while(true) {
			 x = x+1;
			 System.out.println(x);
			 if (x > 2021) {
				 System.exit(0);
			 }
		}
		
	}

}
