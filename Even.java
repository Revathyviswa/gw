/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package even;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<20;i++)
        {if(i%2==1){
                System.out.println("even");}
             else
        {
            System.out.println("odd");
        }
            }
    
}}
