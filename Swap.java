/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);
        int A, B, temp;
        System.out.print("Enter an integer value for A: ");
        A = input.nextInt();
        System.out.print("Enter an integer value for  B: ");
        B = input.nextInt();
        System.out.println("Before: A = " + A + "   B = " + B);
      
        temp = A;
        A = B;
        B = temp;
       
        System.out.println("After: A = " + A + "   B = " + B);
    }
}
