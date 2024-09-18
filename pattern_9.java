package Star_Pattern;

import java.util.Scanner;

public class pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		int outer=t/2;
		int inner=-1;
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=outer;j++)
			{
			
				System.out.print("  ");
			
			}
			System.out.print("* ");
			for(int j=1;j<=inner;j++)
			{
			
				System.out.print("  ");
			
			}
			if(i>1&&i<t)
			{
			System.out.print("* ");
			}
			if(i<=t/2)
			{
				outer--;
				inner+=2;
			}
			else
			{
				outer++;
				inner-=2;
			}
			System.out.println();
		}
	}

}
