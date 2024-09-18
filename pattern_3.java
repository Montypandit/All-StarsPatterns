package Star_Pattern;
import java.util.*;
public class pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("inpu the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<t-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
