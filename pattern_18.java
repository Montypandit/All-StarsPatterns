package Star_Pattern;

import java.util.Scanner;

public class pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=t;j++)
			{
				if(i==t/2+1 || j==t/2+1)
				{
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
				if(i==1 && j<=t/2 )
			
				{
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
	}

}
