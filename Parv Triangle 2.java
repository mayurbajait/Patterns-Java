import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ParvTriangle2(n);
        
    }

	 static void ParvTriangle2(int n){
        for(int i = 1; i <= n; i++){
		    int c = i;
		    for(int j = 1; j <= n-i; j++){
		        System.out.print(" ");
		    }
		    for(int j = 1; j <= i; j++){
		        System.out.print(c);
		        c++;
		    }
		    
		    c = c - 1;
		    for(int k = 1; k <= i-1; k++){
		        c--;
		        System.out.print(c);
		        
		    }
		    
		    System.out.println();
		    
		}
       
    }
}
