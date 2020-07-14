/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.text.*;
import java.util.Date;
import java.util.List;
import java.util.Calendar;
/**
 *
 * @author Błażej Radwański
 */
public class InvoicePoland extends Invoice implements InvoiceI{
    
    private final DateFormat dateFormat = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
    private final double TRANSPORT_PRICE = 50;
    private int daysToPay;
    private ServiceAsc service = new ServiceAsc();
    
    public InvoicePoland(String number, List<Product> products, int daysToPay)
    {
        super(number, products);
        this.daysToPay = daysToPay;
        
    }
    public int getDaysToPay()
    {
        return daysToPay;
    }
    public void setDaysToPay(int daysToPay)
    {
        this.daysToPay = daysToPay;
    }
    public void showDataToPay()
    {
        Date start = super.getDate();
        
        System.out.println("Begin date: ");
        System.out.println(dateFormat.format(start));
        
        Calendar c = Calendar.getInstance();
        
        c.setTime(start);
        c.add(Calendar.DAY_OF_MONTH, daysToPay);;
        
        Date end = c.getTime();
        
        System.out.println("End date");
        System.out.println(dateFormat.format(end));
        
    }

    @Override
    public int productNum() {
        
        List<Product> products = super.getProducts();
        return products.size();
    }

    @Override
    public double totalPrice() {
        List<Product> products = super.getProducts();
        double sum = 0;
        for(Product p : products)
        {
            sum+=p.getPrice();
        }
        sum+=TRANSPORT_PRICE;
        return sum;
    }

    @Override
    public void showName() {
        List<String> names = service.sort(super.getProducts());
  for(String name : names) {
    System.out.println(name);
  }
    }
}
