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
public class ClientPol extends Client {
    
    private List<InvoicePoland>invoices;

    public ClientPol(String name, List<InvoicePoland> invoices) {
        super(name);
        this.invoices = invoices;
    }
    public List<InvoicePoland> getInvoice()
    {
        return invoices;
    }
    public void setInvoices(List<InvoicePoland>invoices)
    {
        this.invoices = invoices;
    }
    public String vindicate()
    {
        String message = super.showInfo();
        message = message + "Has " + invoices.size() + "invoices to pay.";
        return message;
    }
}
