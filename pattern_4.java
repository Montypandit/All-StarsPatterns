package Star_Pattern;
import java.util.*;
public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		
		int  sp = t/2;
		int st =1;
		
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");       		//System.out.print("\t");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print("* ");					//System.out.print("*\t");
			}
			if(i<=t/2)
			{
				sp--;
				st+=2;
			}
			else
			{
				sp++;
				st -=2;
			}
			System.out.println();
		}
		
		
		
		/*   //for(int i=0;i<t;i++)
		    {
			for(int j=0;j<=t/2;j++)
			{
				for(int k=t/2;k>j;k--)
				{
					System.out.print("  ");
				}
				for(int k=t/2;k>t/2-j;k--)
				{
					System.out.print("* ");
				}
				/*
				for(int k=t/2-1;k<t;k++)
				 {
					System.out.print(" ");
				}     
				
				*/
		
		
		
		
				
		/*    for(int k=t/2-1;k<t/2+j;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int j=t/2+1;j<t;j++)
			{
				for(int k=0;k<j-t/2;k++)
				{
					System.out.print("  ");
				}
				for(int k=j-t/2;k<=t/2;k++)
				{
					System.out.print("* ");
				}
		/*   for(int k=t/2-1;k<t;k++)
				{
					System.out.print(" ");
				}     */
		
		
		
				
		/*      for(int k=t/2+1;k<=t-j+1;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}     */
		}
	}


