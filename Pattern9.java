//Input :
5
//Output :
A
BB
CCC
DDDD
EEEEE

  
  

import java.util.*;

public class Main {
    public static void pattern(int n){
        char alph = 65;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(alph);
			}
			alph++;
			System.out.println();
		}
	}
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
