/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapispl;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Błażej Radwański
 */
public class ZapisPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String pathToSave = "D:\\Błażej Radwański\\base.txt";
        FileWriter fw = null;
        String saveText = "ala has a cat" + System.lineSeparator();
        try{
            
            fw = new FileWriter(pathToSave);
            fw.write(saveText);
            fw.write(saveText);
            
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally{
            if(fw != null){
                try{
                    fw.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
}
