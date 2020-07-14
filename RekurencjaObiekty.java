/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekurencjaobiekty;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Błażej Radwański
 */
public class RekurencjaObiekty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    throws IOException  {

        System.out.println("Program obliczający silnie");
        Scanner scan = new Scanner(System.in); 
      
         
   
        
        System.out.println("Podaj n:");
         int n = scan.nextInt();
        
        int c = n - 1;
        Silnia[] wynik = new Silnia[n];
        Silnia wynik1 = new Silnia();
        
        for(int i = 0; i <= n; i++)
        {

        System.out.println("silnia z " + i + "! = " + wynik1.silniaRekurencja(i));

        }
    }
    
}
class Silnia
{
    long s;
long silniaRekurencja(int n)
        {
            if(n == 0)
                return 1;
            if(n > 0)
                this.s = n*silniaRekurencja(n-1);
            return s;
        }    
}

