//if n = 5

//output,
				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*	

          //approch 1,
          
import java.util.*;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print("\t");
            }
            for(int k =1; k<=i; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}

          //approch 2,

import java.util.*;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int sp = n-1;
        int st = 1;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j =1; j<=st; j++){
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }

    }
}

