/*

Bob wants to build a star pattern for a given odd number.

The pattern for ‘N’ = 7 will look like this:

*
**
***
****
***
**
*

*/

import java.util.*;

class Solution {

    static void solve(int n) {
        int a = n/2;
		// System.out.println(a);

		for(int i = 1; i <= a; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= a+1; i++){
			for(int j = i; j <= a+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution.solve(n);
    }
}

