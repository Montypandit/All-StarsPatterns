package Star_Pattern;

import java.util.Scanner;

public class pattern_10 {

	public static void main(String[] args) {
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		int p=1;
		for(int i=1;i<t;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(p +"  ");
				p++;
			}
			System.out.println();
		}
	}

}
