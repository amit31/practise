package practise;

public class Fibonacci {
	
	public static void main(String[] args) {
		
	
	
	
	int fib[] = new int[20]; 
	fib [0]=0;
	fib[1]=1;
	
	System.out.println(fib[0]);
	System.out.println(fib[1]);
	for(int i=2;i<7;i++)
	{
		fib[i]=fib[i-1]+fib[i-2];
		
		System.out.println(fib[i]);
	}

	
}
	
}
