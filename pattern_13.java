package Star_Pattern;

import java.util.Scanner;

public class pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		
		/*for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i +" * "+ j+ " = " +(i*j));
			}
			System.out.println("\n \n");
			
		}*/
		for(int j=1;j<=10;j++)
		{
			System.out.println(t +" * "+ j+ " = " +(t*j));
		}
		System.out.println("\n \n");
	}

}
