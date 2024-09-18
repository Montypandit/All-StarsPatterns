package Star_Pattern;

import java.util.Scanner;

public class pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"\t" );
			}
			for(int k=(2*t)-2;k>=2*i;k--)
			{
				System.out.print("\t");
			}
			
			
			for(int j=i;j>=1;j--)
			{
				if((i==t)&&(j==t))
				{
					j--;
				}
				System.out.print( j+"\t" );
			}
			
			System.out.println();
		}
	}

}
