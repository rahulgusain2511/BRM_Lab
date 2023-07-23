package lab;


public class exp2_prog1 {

	public static void main(String[] args) {
		int num1,num2,num3;
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		num3=Integer.parseInt(args[2]);
		int l=num1;
		if(num2>l)
			l=num2;
		else if(num3>l)
			l=num3;
		System.out.println("Largest Number : "+l);
	}
	
}