package Looping;
import java.util.Scanner;
public class Looping_rps 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("n = ");
		n = scan.nextInt();
		
		for(int i = 1; i <=n; i++)
		{
			for(int j = 1; j<=n; j++)
			{
				// OUTPUT
				// 1000
				// 0100
				// 0010
				// 0001
				
				if(j != i)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				
//				// atau
//				if(j == i)
//				{
//					System.out.print("1");
//				}
//				else
//				{
//					System.out.print("0");
//				}
				
				
				// OUTPUT
				// 1010
				// 0101	
				// 1010
				// 0101
				
//				if(i%2 == 1)
//				{	
//					if(j%2 == 0)
//					{
//						System.out.print("0");
//					}
//					else
//					{
//						System.out.print("1");
//					}	
//				}
//				else if(i%2 == 0)
//				{
//					if (j%2 == 0)
//					{
//						System.out.print("1");
//					}
//					else
//					{	
//					System.out.print("0");
//					}
//				}	
				
				
				// OUTPUT
				// 1010
				// 1010
				// 1010
				// 1010
				
//				if(j%2 == 1)
//				{	
//					System.out.print("1");
//				}
//				else if (j%2 == 0)
//				{
//					System.out.print("0");
//				}	
			}	
		System.out.println("");			// pindah baris	
		}	
	}
}
