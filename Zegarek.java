/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zegarek;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
        

/**
 *
 * @author Błażej Radwański
 */
public class Zegarek extends JFrame{
    
    
    public Zegarek()
    {
        
        super("Zegarek");
        
        this.setBounds(400, 400, 300, 200);
        initComponents();
        
        this.setDefaultCloseOperation(3);
        
    
    
    }
    
    public void initComponents()
    {
        panel.add(etykieta);
        panel.add(czas);
        
        ActionListener stoper = new Zegar();
        
        Timer zegar = new Timer(1000,stoper);
        
        
        zegar.start();
        this.getContentPane().add(panel);
        pack();
    }
    
    JPanel panel = new JPanel();
    JLabel etykieta = new JLabel("Czas: "); 
    
    JLabel czas = new JLabel(pobierzCzas());
            
     
    private class Zegar implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            
             
                     
             czas.setText(pobierzCzas());
            
        }
    } 
    
    public String pobierzCzas()
    {
         GregorianCalendar kalendarzyk = new GregorianCalendar();
             
             String h = "" + kalendarzyk.get(Calendar.HOUR);
             String m = "" + kalendarzyk.get(Calendar.MINUTE);
             String s = "" + kalendarzyk.get(Calendar.SECOND);
             if(Integer.parseInt(h)<10)
             h = "0" + h;
             if(Integer.parseInt(m) < 10)
             m = "0" + m;
             if(Integer.parseInt(s) < 10)
             s = "0" + s;
        return h + ":" + m + ":" + s;
    }
    public static void main(String[] args) 
    {
        
        new Zegarek().setVisible(true);
        
    }
    
}
