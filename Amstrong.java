/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amstrong;

/**
 *
 * @author Student
 */
public class Amstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int c=0,a,temp;  
    int n=153;
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
    }
}
