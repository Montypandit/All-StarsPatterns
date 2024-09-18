package Star_Pattern;

import java.util.Scanner;

public class pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		int st=t/2+1;
		int sp=1;
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=st;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print("* ");
			}
			
			if(i<=t/2)
			{
				st--;
				sp+=2;
			}else
			{
				st++;
				sp-=2;
			}
			System.out.println();
		}
		
	}

}
