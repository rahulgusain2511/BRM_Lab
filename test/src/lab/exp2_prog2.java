package lab;

public class exp2_prog2 {

	

		public static void main(String[] args) {
			
			
			
			
	 
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[2]);
			
			if (args[1].equals("+"))
				System.out.println("The sum is:- " + (x + y));
			
			else if (args[1].equals("-"))
				System.out.println("The difference is:- " + (x - y));
			
			else if (args[1].equals("*"))
				System.out.println("The product is:- " + (x * y));
			
			else 
			
		      System.out.println("The result is:- " + (x / y));
			

	 
		}
	}