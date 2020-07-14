/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Błażej Radwański
 */
public class ServiceAsc implements ServiceI
{

    @Override
    public List<String> sort(List<Product> products) {
     List<String>names = new ArrayList<>();
        for(Product product : products){
         names.add(product.getName());
     }
        for(int i = 0; i < names.size(); i++){
            for(int j = 0; j < names.size() - 1; j++){
            if(names.get(j).compareTo(names.get(j +1)) > 0){
                String temp;
                temp = names.get(j+1);
                names.set(j+1, names.get(j));
                names.set(j, temp);
            }
        }
        }
        return names;
    }
    
  
}
