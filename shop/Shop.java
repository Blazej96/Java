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
public class Shop {
     
    public List<ClientPol> initPol() 
    {
        Product p1 = new Product(1999.99, 1399.34, "Telewizor");
        Product p2 = new Product(34.99, 30.99, "Krem");
        Product p3 = new Product(2500, 1454, "Laptop");
        Product p4 = new Product(1199.99, 987.99, "Telefon");
        Product p5 = new Product(499.99, 324.33, "Tablet");
        Product p6 = new Product(34.4, 30, "Zegar");
        Product p7 = new Product(34.49, 29.99, "Szampon");
        Product p8 = new Product(234, 189.99, "Perfum");
        Product p9 = new Product(34.4, 29.9, "Krem do stóp");
        Product p10 = new Product(34.4, 28.88, "Telewizor");
        
     List<Product> products1 = new ArrayList<Product>();
     products1.add(p1);
     products1.add(p2);

     
     List<Product> products2 = new ArrayList<Product>();
     products2.add(p3);
     products2.add(p4);
     
    List<Product> products3 = new ArrayList<Product>();
    products3.add(p5);
    products3.add(p6);
    products3.add(p7);
     
    InvoicePoland i1 = new InvoicePoland("12/2020", products1, 30);
    InvoicePoland i2 = new InvoicePoland("04/2020", products2, 30);
    InvoicePoland i3 = new InvoicePoland("10/2020", products3, 30);
     
    List<InvoicePoland> invoices1 = new ArrayList<InvoicePoland>();
    invoices1.add(i1);
    invoices1.add(i2);
     
    List<InvoicePoland> invoices2 = new ArrayList<InvoicePoland>();
    invoices2.add(i3);
     
    ClientPol c1 = new ClientPol("Nowak", invoices1);
    ClientPol c2 = new ClientPol("Kowalski", invoices2);
     
     
    List<ClientPol> clients = new ArrayList<ClientPol>();
    clients.add(c1);
    clients.add(c2);
     
    return clients;
  }
    
    public List <ClientEng> initEng()
    {
        Product p1 = new Product(34, 26.99, "Krem");
        Product p2 = new Product(34.49, 30.75, "Szampon");
        Product p3 = new Product(299.99, 150.65, "Perfum");
        Product p4 = new Product(3499.99, 2000.34, "TV");
        Product p5 = new Product(2699.99, 2199.21, "Laptop");
        
        List<Product> products1 = new ArrayList<Product>();
        products1.add(p1);
        products1.add(p2);
        products1.add(p3);
        
        List<Product> products2 = new ArrayList<Product>();
        products2.add(p4);
        products2.add(p5);
        
        InvoiceEng i1 = new InvoiceEng("11/2020", products1, "A30");
        InvoiceEng i2 = new InvoiceEng("09/2020", products2, "B25");
               
        List<InvoiceEng> invoice1 = new ArrayList<InvoiceEng>();
        invoice1.add(i1);
        
        List<InvoiceEng> invoice2 = new ArrayList<InvoiceEng>();
        invoice1.add(i2);
        
        ClientEng c1 = new ClientEng("Smith", invoice1);
        ClientEng c2 = new ClientEng("Kovalsky", invoice2);
        
        List<ClientEng> clients = new ArrayList<ClientEng>();
        
        clients.add(c1);
        clients.add(c2);
        
        return clients;
        
    }
    
    public void checkInvoicePoland(List<ClientPol> clients)
    {
        for(ClientPol client : clients){
            for(InvoicePoland invoice : client.getInvoice())
            {
                invoice.showDataToPay();
            }
        }
    }
    
    public void vindicateAll (List<ClientPol> clients)
    {
        for(ClientPol client : clients)
        {
            System.out.println(client.showInfo());
            System.out.println(client.vindicate());
        }
    }
   
    public void showAll(List<ClientEng> clients)
    {
        for(ClientEng client : clients)
        {
            System.out.println(client.showInfo());
        }
    }
    public double sumPrice(List<ClientPol> clientPol, List<ClientEng> clientEng)
    {
       double sum = 0;
        
        for( ClientPol client: clientPol)
        {
           for(InvoicePoland invoice: client.getInvoice())
           {
               for(Product product : invoice.getProducts())
               {
                   sum+=product.getPrice();
               }
           }
        }
        for(ClientEng client : clientEng)
        {
            for(InvoiceEng invoice : client.getInvoices())
            {
                for (Product product : invoice.getProducts())
                {
                    sum+=product.getPrice();
                }
            }
        }
       return sum; 
    }
    public double netPrice(List<ClientPol> clientPol, List<ClientEng> clientEng)
    {
    double netSum = 0;
        
        for(ClientPol client : clientPol)
        {
            for(InvoicePoland invoice : client.getInvoice())
            {
                for(Product product : invoice.getProducts())
                        {
                            netSum+=product.getNetPrice();
                        }
            }
        }
        for(ClientEng client : clientEng)
        {
            for(InvoiceEng invoice : client.getInvoices())
            {
                for(Product product : invoice.getProducts())
                {
                    netSum+=product.getNetPrice();
                }
            }
        }
        
        
        return netSum;
    }
    public double costOfShop(List<ClientPol> clientPol, List<ClientEng> clientEng)
    {
         return sumPrice(clientPol, clientEng) - netPrice(clientPol, clientEng);
    }

        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Shop shop = new Shop();
   
        
        List<ClientPol> clientPol = shop.initPol();
        List<ClientEng> clientEng = shop.initEng();
        
        shop.checkInvoicePoland(clientPol);
        System.out.println("");
        shop.vindicateAll(clientPol);
        System.out.println("");
        shop.showAll(clientEng);
      
        System.out.println("");
    
        System.out.println("Price: ");
        System.out.println(shop.sumPrice(clientPol, clientEng));
        System.out.println("Net price: ");
        System.out.println(shop.netPrice(clientPol, clientEng));
        System.out.println("");
        System.out.println("Costs: ");
        System.out.println(shop.costOfShop(clientPol, clientEng));
        System.out.println("");
        
        
        List<InvoiceI>invoices = new ArrayList<>();
        for(ClientPol clients : clientPol)
            for(InvoicePoland invoice : clients.getInvoice())
            {
                invoices.add(invoice);
            }
       
        for(ClientEng clients : clientEng)
            for(InvoiceEng incoice : clients.getInvoices())
            {
                invoices.add(incoice);
            }
        
        for(InvoiceI in : invoices)
        {
            System.out.println("Faktura");
            System.out.println(in.productNum());
            System.out.println(in.totalPrice());
            in.showName();
        }
    }
    
}
