package lab;
import java.util.Arrays;  

public class exp2_prog4 {

		private static int[] marks = new int[10];
		
		public static void main(String[] args) {
			for(int i=0;i<=9;i++) {
				marks[i]=Integer.parseInt(args[i]);
			}
			Arrays.sort(marks);
			for(int i=0;i<=9;i++) {
				System.out.print("Student "+(i+1)+":\t"+marks[i]+"\t");
				if(marks[i]<40)
					System.out.println("FAIL\n");
				else if(marks[i]<=50)
					System.out.println("PASS\n");
				else if(marks[i]<=75)
					System.out.println("MERIT\n");
				else
					System.out.println("DISTINCTION\n");
				
			}
		}
		
	}