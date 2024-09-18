package Star_Pattern;
import java.util.*;
public class pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<t-i-1;j++)
			{
				System.out.print("  ");
			}
			for(int j=t-i-1;j<t;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
