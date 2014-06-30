/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codicefiscaleapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author bel22887
 */
public class LuogoNascita {
    
    private HashMap<String, String> codifica;
    String csvFileName = "codici_comuni.csv";
    
    public LuogoNascita() {
        
        String s;
        String[] lista;
        Scanner lettore = null;
        codifica = new HashMap();
        
        try {
            lettore = new Scanner (new File(csvFileName));
        }
        catch(FileNotFoundException ex) {
            System.out.println("Errore in apertura file: " + ex.toString());
            System.exit(1);
        }
        
        while (lettore.hasNextLine()) {
            s = lettore.nextLine();
            lista = s.split(";");
            codifica.put(lista[1], lista[0]);            
        }        
        
    }
    
    public String decode(String key) {
        return codifica.get(key.toUpperCase());
    }
}
