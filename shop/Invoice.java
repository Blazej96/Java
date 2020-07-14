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
public class Invoice {
    
    
    private String number;
    private Date date;
    private List<Product> products;
    
    public Invoice( String number, List products)
    {
        super();
        this.number = number;
        this.date = new Date();
        this.products = products;
    }
    public String getNumber()
    {
        return number;
    }
    public void setNumber(String number)
    {
        this.number = number;
    }
    public Date getDate()
    {
        return date;
    }
    public void setDate(Date date)
    {
        this.date = date;
    }
    public List<Product> getList()
    {
        return products;
    }
    public void setList(List<Product> products)
    {
        this.products = products;
    }
    public List<Product> getProducts() {
    return products;
    }
    public void setProducts(List<Product> products) {
    this.products = products;
    }
    
    }
    

