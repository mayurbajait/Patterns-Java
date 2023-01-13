// Input:
5
// Output:
1
21
321
4321
54321

import java.util.*;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printNumberPattern2(n);
    }
    public static void printNumberPattern2(int n) {
        for(int i = 1; i<=n; i++){
			for(int j = i; j>=1; j--){
				System.out.print(j);
			}
			System.out.println();
		}
    }
}
