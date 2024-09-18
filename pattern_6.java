package Star_Pattern;
import java.util.*;
public class pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input the size");
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		
		for(int i=1; i<=t;i++ ) {
			System.out.print("* "+ "\n" );
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			
		}

	}

}
