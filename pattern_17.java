package Star_Pattern;

import java.util.Scanner;

public class pattern_17 {

	public static void main(String[] args) {
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		int st =t;
		int sp =0;
		
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=st;j++)
			{
				if(i>1  && i<=t/2 && j>1 && j<st)
				{
					System.out.print("\t");
				}
				else {
					System.out.print("*\t");
				}
			}
			if(i<=t/2)
			{
				sp++;
				st-=2;
			}
			else {
				sp--;
				st+=2;
			}
		
		System.out.println();
		}
	}

}
