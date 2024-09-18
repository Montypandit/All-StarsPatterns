package Star_Pattern;

import java.util.Scanner;

public class pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		int p=t/2;
		int sp=1;
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=p;j++)
			{
			if(i==p+1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		
			}
			for(int k=1;k<=sp;k++)
			{
				System.out.print("* ");
			}
			if(i<=t/2)
			{
				sp++;
			}else
			{
				sp--;
			}
			System.out.println();
			
			}
			
		}
	}


