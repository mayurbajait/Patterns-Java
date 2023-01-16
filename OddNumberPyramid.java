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
///First Approch..

import java.util.*;

public class OddNumberPyramid {

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

//Second Approch

import java.util.Scanner;

public class OddNumberPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= count; j++) {
                System.out.print(count);

            }
            count = count + 2;
            System.out.println();
        }

    }
}
