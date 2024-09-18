package Star_Pattern;

import java.util.Scanner;

public class pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		
		for(int i=0;i<t;i++)
		{
			int c=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(c +" ");
				int ic=c*(i-j)/(j+1);
				c=ic;
				
			}
			System.out.println();
		}
	}

}
