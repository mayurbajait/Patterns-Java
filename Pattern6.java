    * 
  * * * 
* * * * * 
  * * * 
    * 

import java.util.*;
class Pattern6{
    public static void diamondPattern(int n) {
        //Write code here
		int star = 1, space = n / 2;
		for(int row = 1; row <= n; row++) {
			for(int i = 1; i <= space; i++) {
				System.out.print("  ");
			}
			for(int i = 1; i <= star; i++) {
				System.out.print("* ");
			}
			System.out.println();
			if(row <= n / 2) {
				star = star + 2;
				space--;
			}else{
				star = star - 2;
				space++;
			}
		}
    }
	public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				diamondPattern(n);
				t--;
			}
		}
	}

}
