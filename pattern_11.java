package Star_Pattern;

import java.util.Scanner;

public class pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.print("input the size");
			Scanner s= new Scanner(System.in);
			int t=s.nextInt();
			s.close();
			int a=0;
			int b=1;
			
			for(int i=1;i<=t;i++) {
				for(int j=1;j<=i;j++)
				{
					System.out.print(a +"  ");
					int c=a+b;
					a=b;
					b=c;
				}
				System.out.println();
			}
			
	}

}
