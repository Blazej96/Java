/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.util.List;

/**
 *
 * @author Błażej Radwański
 */
public class InvoiceEng extends Invoice implements InvoiceI{
    private String code;
    private ServiceDsc service = new ServiceDsc();
    
    public InvoiceEng(String number, List<Product> products, String code)
    {
        super(number, products);
        this.code = code;
    }
    
    public String getCode(){
            return code;
    }
    public void setCode(String code)
    {
        this.code = code;
    }

    @Override
    public int productNum() {
        List<Product>products = super.getProducts();
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
