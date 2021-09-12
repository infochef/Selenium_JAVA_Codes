package Com.Check;

import java.util.Scanner;

public class Planigdrone {

	public static void main(String[] args) {
		
		Scanner my = new Scanner(System.in);
		int sum =0, i,c;
		
		
		System.out.println("Enter the value of n");
		int n = my.nextInt();
		System.out.println("Entered number is" + n);
		c = my.nextInt();
		sum = my.nextInt();
		i = my.nextInt();
		System.out.println("a");
		for(i=1;i<n;i++)
		{
			c=sum+i;
			System.out.println("b");
		}
		System.out.println("Final output"+ c);
	}
}
