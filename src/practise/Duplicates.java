package practise;

public class Duplicates {
	
	public static void main(String[] args) {
		
	
	
	int a [] = {5,7,9,4};
	int b [] = {6,7,8,4};
	
	
	for(int i=0;i<a.length;i++)
	{
		int j=0;
		
		while(j<=i)
		{
		if(a[i]==b[j])
		{
			System.out.println(a[i]);
		}
		j=j+1;
		}
			
	}
}
	
}
