package lab;



	class Square
	{
		private double side = 5.7;
		public double findPer()
		{
			return 4*side;
		}
	}

	class Triangle
	{
		private double a =3.5;
		private double b =6.5;
		private double c =2.7;
		public double findPer()
		{
			return a+b+c;
		}
	}
	
	public class exp2_prog3 {
		public static void main(String[] args)
		{
			Square r=new Square();
			Triangle c=new Triangle();
			double total_perimeter;
			total_perimeter = r.findPer()+c.findPer();
			System.out.println("Perimeter of Sqaure = "+r.findPer());
			System.out.println("Perimeter of Triangle = "+c.findPer());
			System.out.println("Sum of Perimeter = "+total_perimeter);
		}
	}