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
public class ClientEng extends Client{
    
    private List<InvoiceEng> invoices;

    public ClientEng(String name, List<InvoiceEng>invoices) {
        super(name);
        this.invoices = invoices;
        
    }
    
    public List<InvoiceEng> getInvoices()
    {
        return invoices;
    }
    public void setInvoices(List<InvoiceEng>invoices)
    {
        this.invoices = invoices;
    }
    @Override
    public String showInfo()
    {
        return "Second name: " + this.getName();
    }
}
