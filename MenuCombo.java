/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucombo;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author Błażej Radwański
 */
public class MenuCombo extends JFrame{

    
    public MenuCombo()
    {
        
        initComponents();
        
    }
    
    public void initComponents()
    {
        
        this.setTitle("Combo v 1.0.0");
        this.setBounds(300, 300, 300, 300);
        kombinacja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ColorHandler handler = (ColorHandler)((JComboBox)e.getSource()).getSelectedItem();
                
                ((JComboBox)e.getSource()).setBackground(handler.getColor());
                
                
            }
        });
        panel.add(kombinacja);
        
        kombinacja.addItem(new ColorHandler("Czarny", Color.BLACK));
        kombinacja.addItem(new ColorHandler("Żółty", Color.YELLOW));
        kombinacja.addItem(new ColorHandler("Zielony", Color.GREEN));
        kombinacja.addItem(new ColorHandler("Czerwony", Color.RED));
        //kombinacja.addItem(new String("Czerwony"));
        
        
        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(3);
        
        
        
        
    }
    private class ColorHandler
    {
        public ColorHandler(String colorName, Color kolor)
        {
            this.kolor = kolor;
            this.colorName = colorName;
            
        }
        public String toString()
        {
            return this.colorName;
        }
        public Color getColor()
        {
            return this.kolor;
        }
        private Color kolor;
        private String colorName;
    }
    private JPanel panel = new JPanel();
    private JComboBox kombinacja = new JComboBox();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
          new MenuCombo().setVisible(true);
    }
    
}
