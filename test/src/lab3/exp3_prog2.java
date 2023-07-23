package lab3;

public class exp3_prog2 {

	public static void main(String[] args) {
		int num[];
		num = new int[10];
		
		long sum=0;
		
		System.out.println("Numbers :");
		for(int i=0;i<10;i++)
		{
			num[i]=Integer.parseInt(args[i]);
			System.out.print(num[i]+"\t");
			sum+= num[i];
		}
		
		System.out.println("\nSum of these numbers : "+sum);
		System.out.println("\nSquare of each number :");
		for(int i=0;i<10;i++)
		{
			System.out.println(num[i]*num[i]);
		}
	}
}