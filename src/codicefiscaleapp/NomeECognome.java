/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codicefiscaleapp;

/**
 *
 * @author Giacomo
 */
public class NomeECognome {
    
    public String calcolaNome (String s) {
        s = s.toUpperCase();
        char[] nome;
        int[] pConsonante = new int[50];
        int[] pVocale = new int[50];
        int nConsonanti;
        int nVocali;
        
        nome = s.toCharArray();
        
        nConsonanti = 0;
        nVocali = 0;

        for (int i = 0; i < nome.length; i++) {
            if (this.wordType(nome[i]) == 1) {
                pConsonante[nConsonanti] = i;
                nConsonanti ++;
            }
            else if (this.wordType(nome[i]) == 0) {
                pVocale[nVocali] = i;
                nVocali ++;
            }
        }
        
        if (s.length() < 3) {
            switch (s.length()) {
                case 1:
                    return s + "XX";
                case 2:
                    switch (nConsonanti) {
                        case 0: case 2:
                            return s + "X";
                        case 1:
                            return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pVocale[0]]) + "X");                        
                    }
            }
        }
        else {
            
            if (nConsonanti <= 3) {
                switch (nConsonanti) {
                    case 1:
                        return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pVocale[0]]) + String.valueOf(nome[pVocale[1]]));
                    case 2:
                        return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pConsonante[1]]) + String.valueOf(nome[pVocale[0]]));
                    case 3:
                        return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pConsonante[1]]) + String.valueOf(nome[pConsonante[2]]));
                }
            }
            else {
                return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pConsonante[2]]) + String.valueOf(nome[pConsonante[3]]));
            }
        }
        return (String.valueOf(nome[0]) + String.valueOf(nome[1]) + String.valueOf(nome[2]));
    }
    
    /*
    public String calcolaNome (String n) {
        n = n.toUpperCase();
        char[] nome;
        int[] pConsonante = new int[50];
        int[] pVocale = new int[50];
        int nConsonanti;
        int nVocali;
        
        nome = n.toCharArray();
        
        if (n.length() < 3) {
            switch (n.length()) {
                case 1:
                    return n + "XX";
                case 2:
                    if (this.isConsonants(nome[0])) {
                        return (String.valueOf(nome[0]) + String.valueOf(nome[1]) + "X");
                    }
                    else if (this.isConsonants(nome[1])) {
                        return (String.valueOf(nome[1]) + String.valueOf(nome[0]) + "X");
                    }
                    else {
                        return n + "X";
                    }
                default:
                    return "error";
            }
        }
        else {
            
            nConsonanti = 0;
            nVocali = 0;

            for (int i = 0; i < nome.length; i++) {
                if (this.isConsonants(nome[i])) {
                    pConsonante[nConsonanti] = i;
                    nConsonanti ++;
                }
                else {
                    pVocale[nVocali] = i;
                    nVocali ++;
                }
            }
            
            System.out.println("consonanti:");
            System.out.println(nome[pConsonante[0]]);
            System.out.println(nome[pConsonante[1]]);
            System.out.println(nome[pConsonante[2]]);
            System.out.println(nome[pConsonante[3]]);
            System.out.println("vocali:");
            System.out.println(nome[pVocale[0]]);
            System.out.println(nome[pVocale[1]]);
            System.out.println(nome[pVocale[2]]);
            System.out.println(nome[pVocale[3]]);
            
            if (nConsonanti <= 3) {
                switch (nConsonanti) {
                    case 1:
                        return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pVocale[0]]) + String.valueOf(nome[pVocale[1]]));
                    case 2:
                        return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pConsonante[1]]) + String.valueOf(nome[pVocale[0]]));
                    case 3:
                        return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pConsonante[1]]) + String.valueOf(nome[pConsonante[2]]));
                }
            }
            else {
                return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pConsonante[2]]) + String.valueOf(nome[pConsonante[3]]));
            }
        }
        return (String.valueOf(nome[0]) + String.valueOf(nome[1]) + String.valueOf(nome[2]));
    }
    */
    
    public String calcolaCognome(String s) {
        
        s = s.toUpperCase();
        char[] nome;
        int[] pConsonante = new int[50];
        int[] pVocale = new int[50];
        int nConsonanti;
        int nVocali;
        
        nome = s.toCharArray();
        
        nConsonanti = 0;
        nVocali = 0;

        for (int i = 0; i < nome.length; i++) {
            if (this.wordType(nome[i]) == 1) {
                pConsonante[nConsonanti] = i;
                nConsonanti ++;
            }
            else if (this.wordType(nome[i]) == 0) {
                pVocale[nVocali] = i;
                nVocali ++;
            }
        }
        
        if (s.length() < 3) {
            switch (s.length()) {
                case 1:
                    return s + "XX";
                case 2:
                    switch (nConsonanti) {
                        case 0: case 2:
                            return s + "X";
                        case 1:
                            return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pVocale[0]]) + "X");                        
                    }
            }
        }
        else {
            
            if (nConsonanti <= 3) {
                switch (nConsonanti) {
                    case 1:
                        return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pVocale[0]]) + String.valueOf(nome[pVocale[1]]));
                    case 2:
                        return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pConsonante[1]]) + String.valueOf(nome[pVocale[0]]));
                    case 3:
                        return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pConsonante[1]]) + String.valueOf(nome[pConsonante[2]]));
                }
            }
            else {
                return (String.valueOf(nome[pConsonante[0]]) + String.valueOf(nome[pConsonante[1]]) + String.valueOf(nome[pConsonante[2]]));
            }
        }
        return (String.valueOf(nome[0]) + String.valueOf(nome[1]) + String.valueOf(nome[2]));
    
    }
    
    private short wordType (char c) {
        if ((c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')) {
            return 0;
        }
        else if ((c == 'B') || (c == 'C') || (c == 'D') || (c == 'F') || (c == 'G') || (c == 'H') || (c == 'J') || (c == 'K') || (c == 'L') || (c == 'M') || (c == 'N') || (c == 'P') || (c == 'Q') || (c == 'R') || (c == 'S') || (c == 'T') || (c == 'V') || (c == 'W') || (c == 'X') || (c == 'Y') || (c == 'Z')) {
            return 1;
        }
        else {
            return 2;
        }
    }
    
}
