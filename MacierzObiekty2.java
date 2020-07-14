/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macierzobiekty2;
import java.util.*;
/**
 *
 * @author Błażej Radwański
 */
public class MacierzObiekty2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Program zlicza losowe wartości z dwuwymiarowej macierzy oraz oblicza ich sume.");
        int r = 10;
        double tablica[][] = new double[r][r];
        Matryca macierz = new Matryca();
        macierz.wykres(tablica, r);
        macierz.obliczenia(tablica, r);
        macierz.wynik(tablica, r);
        
    }
    
}

class Matryca
{
    Random r = new Random(); int suma = 0;
    void wykres(double mat[][], int r)
            
    {
        System.out.println("Macierz czysta:");
        //double mat[][] = new double[10][10];
        
        for (int i = 0; i < 10 ; i++)
        {
            for (int j = 0; j < 10; j++)
            {
            //mat[i][j] = i*j;
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    void obliczenia(double mat[][], int r)
    {
        System.out.println("Macierz z losowymi liczbami na przekątnej");
        
        for (int i = 0; i < 10; i++) {
            int a = this.r.nextInt(10);
            for (int j = 0; j < 10; j++) {
                
                mat[i][j]  = i*0*j;
                    
                if(i == j)
                {
                    mat[i][j] = a;
                    
                }
               System.out.print(mat[i][j] + "\t");
               suma+=mat[i][j];
                
                   
            }
            
             System.out.println();
             
        }
        
}
     void wynik(double mat[][], int r) 
     {
         System.out.println("");
         System.out.println("Suma wartości z tablicy = " + this.suma);
         System.out.println();
     }      
         
   
}  