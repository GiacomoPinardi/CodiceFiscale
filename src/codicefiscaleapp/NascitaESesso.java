/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codicefiscaleapp;

/**
 *
 * @author giacomo
 */
public class NascitaESesso {
    
    public String giornoNascita (int g, boolean maschio) {
        g = g + 1;
        if (!maschio) {
            g = g + 40;
            return String.valueOf(g);
        }
        else {
            if (g <= 9) {
                return ("0" + String.valueOf(g));
            }
            else {
                return String.valueOf(g);
            }
        }
    }
    
    public String meseNascita (int m) {
        switch (m) {
            case 0:
                return "A";
            case 1:
                return "B";
            case 2:
                return "C";
            case 3:
                return "D";
            case 4:
                return "E";
            case 5:
                return "H";
            case 6:
                return "L";
            case 7:
                return "M";
            case 8:
                return "P";
            case 9:
                return "R";
            case 10:
                return "S";
            case 11:
                return "T";
            default:
                return "error";
        }
    }
    
    public String annoNascita (int g) {
        String tmp = String.valueOf(g);
        return (String.valueOf(tmp.charAt(2)) + String.valueOf(tmp.charAt(3)));
    }
}
