/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the First no : ");
            int n1=sc.nextInt();
            System.out.print("Enter the Second no : ");
            int n2=sc.nextInt();
            int r;
             
            while(n2 != 0)
            {
                r = n1 % n2;
                n1 = n2;
                n2 = r;
    }
            System.out.println("THE ANS IS"+n1);
}
}