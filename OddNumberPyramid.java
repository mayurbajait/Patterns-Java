/*

Odd Number Pyramid
Take input of N from the user and write a program to print the Full Pyramid Number pattern as follows (N=4) :

Pattern Image

Input Format
Input consists of the integer N.

Output Format
Print the pattern for value N.

Example 1
Input

4
Output

   1   
  333  
 55555 
7777777


*/

import java.util.*;

public class Main {

    public static void main(String[] args) throws Throwable {

        Scanner cs = new Scanner(System.in);
        int rowsize = cs.nextInt();
        cs.close();
        printPattern(rowsize);
    }

    public static void printPattern(int rowsize) {
        int num = 1;
		for(int j = 0; j < rowsize; j++) {
          for(int i = rowsize - 1; i > j; i--) {
              System.out.print(" ");
          }
          for(int i = 0; i < num; i++) {
              System.out.print(num);
          }
          num += 2;
          System.out.println();
       }
    }
}
