//if n = 5,

//output,

*	*	*	*	*	
	*	*	*	*	*	
		*	*	*	*	*	
			*	*	*	*	*	
				*	*	*	*	*	


import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        for(int i =1; i<=n; i++){
            
            for(int j = 1; j<=i-1; j++){
                System.out.print("\t");
            }
            
            for(int k = 1; k<=n; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        

    }
}
