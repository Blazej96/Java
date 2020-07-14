/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.util.*;

/**
 *
 * @author Błażej Radwański
 */
public class Client {
    
    private String name;
    
    
    public Client(String name)
    {
        super();
        this.name = name;
        
    }
    public String getName()
    {
        return name;
    }
    public void setName()
    {
        this.name = name;
    }
    public String showInfo()
    {
        return "Name: " + name;
    }
}
