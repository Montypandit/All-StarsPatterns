package Star_Pattern;
import java.util.*;
public class pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		
		for(int i=1; i<=t;i++ )
		{
			
			for(int j=1;j<=t;j++)
			{
				if(i+j==t+1)
				{
				System.out.print("* ");
			}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}

}
