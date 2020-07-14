/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

/**
 *
 * @author Błażej Radwański
 */
public class Product 
{
    private String name;
   
    private double price;
    private double netPrice;
    
    
    public Product(double price,double netPrice, String name)
    {
        super();
        this.name = name;
        this.price = price;
        this.netPrice =netPrice;
        
    }
    public String getName()
    {
        return name;
    }
    public void SetName(String name)
    {
        this.name = name; 
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getNetPrice()
    {
        return netPrice;
    }
    public void setNetPrice(double netPrice)
    {
        this.netPrice = netPrice;
    }
}
