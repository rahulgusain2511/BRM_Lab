package devops.lab2;

public class reverse {
	public int rev(int a) {
		int res = 0, remainder;
	while(a != 0)   
		{  
		remainder = a % 10;  
		res = res * 10 + remainder;  
		a = a/10;  
		}  
		return res;

}
	}
