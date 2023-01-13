//Input : 5

//Output : 
1
12
123
1234
12345
123456

import java.util.*;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printNumberPattern2(n);
    }

    public static void printNumberPattern2(int n) {
        for(int i =0; i <= n; i++){
			int num = 1;
			for(int j = 0; j<=i; j++){
				System.out.print(num);
				num++;
			}
				System.out.println();
		}
    }
}
