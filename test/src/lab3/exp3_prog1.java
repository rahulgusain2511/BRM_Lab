package lab3;

public class exp3_prog1 {

	public static void main(String[] args) {


		int x,y,z,n=0,t;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		z=Integer.parseInt(args[2]);
		
		System.out.println("All possibilities of non-zero 3 digit number:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				n=x*100 + y*10 + z;
				
				if(n>=100 && n<=999)
					System.out.println(n);
				
				
				if(j==0)
				{
					t = y;
					y=z;
					z= t;
				}
				else
				{
					t=x;
					x=z;
					z=t;
				}
			}
		}
	}

		
	}


