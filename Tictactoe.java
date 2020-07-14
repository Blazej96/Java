
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Błażej Radwański
 */
public class Tictactoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Witaj w grze kółko i krzyżyk, podaj wielkość planszy: ");
        Scanner scan = new Scanner(System.in);
        int wymiar = scan.nextInt();
        char obecnySymbol = 'B';
        char[][] plansza = new char[wymiar][wymiar];
        
        
        
        
        while(true)
        {
            Tictactoe.drukujPlansze(plansza);
            boolean poprawnyRuch = ruch(obecnySymbol, plansza);
            if(poprawnyRuch){
                
                boolean wygranaWiersze = sprawdzWiersze(plansza,obecnySymbol);
                boolean wygranaKolumny = sprawdzKolumny(plansza,obecnySymbol);
                boolean wygranaP1 = sprawdzP1(plansza,obecnySymbol);
                boolean wygranaP2 = sprawdzP2(plansza,obecnySymbol);
            if(obecnySymbol == 'B')
            {
                
                obecnySymbol = 'O';
            }
            else
            {
                obecnySymbol = 'B';
            }
          }
        }
        
        
        }
    
    
        public static boolean ruch(char obecnySymbol, char[][]plansza)
        {
            System.out.println(obecnySymbol + " Twój ruch");
            System.out.println("Podaj index wiersza");
            int wiersz = new Scanner(System.in).nextInt();
            System.out.println("Podaj index kolumny");
            int kolumna = new Scanner(System.in).nextInt();
            
            boolean ruchPoprawny = plansza[wiersz][kolumna] == 0;
            if(!ruchPoprawny){
                System.out.println("Niepoprawny ruch!");
                return false;
            }
            plansza[wiersz][kolumna] = obecnySymbol;
            return true;
            
        }
        public static boolean sprawdzWiersze(char[][]plansza, char obecnySymbol)
        {
            for(int wiersz = 0; wiersz < plansza.length; wiersz++)
            {
                boolean wygrana = true;
                for(int kolumna = 0; kolumna< plansza.length; kolumna++)
                {
                    if(plansza[wiersz][kolumna] != obecnySymbol)
                    {
                        wygrana = false;
                        break;
                    }
                    
                }
                if(wygrana){return true;}
                
                
            }
            return false;
        }
        public static boolean sprawdzKolumny(char[][]plansza, char obecnySymbol)
        {
            for(int kolumna = 0; kolumna < plansza.length; kolumna++)
            {
                boolean wygrana = true;
                for(int wiersz = 0; wiersz< plansza.length; wiersz++)
                {
                    if(plansza[kolumna][wiersz] != obecnySymbol)
                    {
                        wygrana = false;
                        break;
                    }
                    
                }
                if(wygrana){return true;}
                
                
            }
            return false;
        }
        public static boolean sprawdzP1(char[][]plansza, char obecnySymbol)
        {
            for(int wiersz = 0; wiersz < plansza.length; wiersz++)
            {
                boolean wygrana = true;
                for(int kolumna = 0; kolumna< plansza.length; kolumna++)
                {
                    if(wiersz == kolumna)
                    {
                        wygrana = false;
                        break;
                    }
                    
                }
                if(wygrana){return true;}
                
                
            }
            return false;
        }
        public static boolean sprawdzP2(char[][]plansza, char obecnySymbol)
        {
            int s = plansza.length;
            for(int wiersz = 0; wiersz < plansza.length; wiersz++)
            {
                boolean wygrana = true;
                for(int kolumna = plansza.length; kolumna >= 0; kolumna--)
                {
                    if(plansza[wiersz][kolumna] != obecnySymbol)
                    {
                        wygrana = false;
                        break;
                    }
                    
                }
                if(wygrana){return true;}
                
                
            }
            return false;
        }
        public static void drukujPlansze(char[][] plansza)
        {
        for(int i = 0; i <plansza.length; i++)
            System.out.print("\t" +i );
        
        System.out.println("");
        
        for(int wiersz = 0; wiersz < plansza.length; wiersz++)
        {
            System.out.print(wiersz+ ":"+ "\t");
            for(int kolumna = 0; kolumna < plansza[wiersz].length; kolumna++)
            {
                
                System.out.print(plansza[wiersz][kolumna] + "\t");
            }
            
            System.out.println("");
        }
        
        }
    
    

}