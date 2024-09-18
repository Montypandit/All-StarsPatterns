package Star_Pattern;

import java.util.Scanner;

public class pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		int sp=t/2;
		int st=1;
		int val=1;
		
		for(int i=1;i<=t;i++){
			int cval=val;
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
		
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print(cval+" ");
				if(j<=st/2)
				{
					cval++;
				}
				else {
					cval--;
				}
		
			}
			if(i<=t/2)
			{
				sp--;
				st+=2;
				val++;
			}
			else {
				sp++;
				st-=2;
				val--;
			}
			System.out.println();

	    }

}
}