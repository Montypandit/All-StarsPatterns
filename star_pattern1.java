package Star_Pattern;
import java.util.*;
public class star_pattern1 {

	public static void main(String[] args) {
		
		 System.out.println("input the lines of star");   
		        Scanner scn = new Scanner(System.in);
                   int t=scn.nextInt();
                  scn.close();
		        for(int i=0;i<t;i++)
		        {
		            for(int j=0;j<i;j++)
		            {
		                System.out.print("*	");
		            
		            }
		            System.out.println();
		        }
		    }
		
	

}
