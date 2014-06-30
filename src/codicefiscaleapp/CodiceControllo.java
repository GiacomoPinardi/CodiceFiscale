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
public class CodiceControllo {
    
    public String calcolaCodiceControllo (String codice) {
        int valore = 0;
        
        for (int i = 0; i < codice.length(); i++) {
            if ((i+1) % 2 != 0) {
                switch (codice.charAt(i)) {
                    case '0':
                        valore = valore + 1;
                        break;
                    case '1':
                        valore = valore + 0;
                        break;
                    case '2':
                        valore = valore + 5;
                        break;
                    case '3':
                        valore = valore + 7;
                        break;
                    case '4':
                        valore = valore + 9;
                        break;
                    case '5':
                        valore = valore + 13;
                        break;
                    case '6':
                        valore = valore + 15;
                        break;
                    case '7':
                        valore = valore + 17;
                        break;
                    case '8':
                        valore = valore + 19;
                        break;
                    case '9':
                        valore = valore + 21;
                        break;
                    case 'A':
                        valore = valore + 1;
                        break;
                    case 'B':
                        valore = valore + 0;
                        break;
                    case 'C':
                        valore = valore + 5;
                        break;
                    case 'D':
                        valore = valore + 7;
                        break;
                    case 'E':
                        valore = valore + 9;
                        break;
                    case 'F':
                        valore = valore + 13;
                        break;
                    case 'G':
                        valore = valore + 15;
                        break;
                    case 'H':
                        valore = valore + 17;
                        break;
                    case 'I':
                        valore = valore + 19;
                        break;
                    case 'J':
                        valore = valore + 21;
                        break;
                    case 'K':
                        valore = valore + 2;
                        break;
                    case 'L':
                        valore = valore + 4;
                        break;
                    case 'M':
                        valore = valore + 18;
                        break;
                    case 'N':
                        valore = valore + 20;
                        break;
                    case 'O':
                        valore = valore + 11;
                        break;
                    case 'P':
                        valore = valore + 3;
                        break;
                    case 'Q':
                        valore = valore + 6;
                        break;
                    case 'R':
                        valore = valore + 8;
                        break;
                    case 'S':
                        valore = valore + 12;
                        break;
                    case 'T':
                        valore = valore + 14;
                        break;
                    case 'U':
                        valore = valore + 16;
                        break;
                    case 'V':
                        valore = valore + 10;
                        break;
                    case 'W':
                        valore = valore + 22;
                        break;
                    case 'X':
                        valore = valore + 25;
                        break;
                    case 'Y':
                        valore = valore + 24;
                        break;
                    case 'Z':
                        valore = valore + 23;
                        break;
                }
            }
            else {
                switch (codice.charAt(i)) {
                    case '0':
                        valore = valore + 0;
                        break;
                    case '1':
                        valore = valore + 1;
                        break;
                    case '2':
                        valore = valore + 2;
                        break;
                    case '3':
                        valore = valore + 3;
                        break;
                    case '4':
                        valore = valore + 4;
                        break;
                    case '5':
                        valore = valore + 5;
                        break;
                    case '6':
                        valore = valore + 6;
                        break;
                    case '7':
                        valore = valore + 7;
                        break;
                    case '8':
                        valore = valore + 8;
                        break;
                    case '9':
                        valore = valore + 9;
                        break;
                    case 'A':
                        valore = valore + 0;
                        break;
                    case 'B':
                        valore = valore + 1;
                        break;
                    case 'C':
                        valore = valore + 2;
                        break;
                    case 'D':
                        valore = valore + 3;
                        break;
                    case 'E':
                        valore = valore + 4;
                        break;
                    case 'F':
                        valore = valore + 5;
                        break;
                    case 'G':
                        valore = valore + 6;
                        break;
                    case 'H':
                        valore = valore + 7;
                        break;
                    case 'I':
                        valore = valore + 8;
                        break;
                    case 'J':
                        valore = valore + 9;
                        break;
                    case 'K':
                        valore = valore + 10;
                        break;
                    case 'L':
                        valore = valore + 11;
                        break;
                    case 'M':
                        valore = valore + 12;
                        break;
                    case 'N':
                        valore = valore + 13;
                        break;
                    case 'O':
                        valore = valore + 14;
                        break;
                    case 'P':
                        valore = valore + 15;
                        break;
                    case 'Q':
                        valore = valore + 16;
                        break;
                    case 'R':
                        valore = valore + 17;
                        break;
                    case 'S':
                        valore = valore + 18;
                        break;
                    case 'T':
                        valore = valore + 19;
                        break;
                    case 'U':
                        valore = valore + 20;
                        break;
                    case 'V':
                        valore = valore + 21;
                        break;
                    case 'W':
                        valore = valore + 22;
                        break;
                    case 'X':
                        valore = valore + 23;
                        break;
                    case 'Y':
                        valore = valore + 24;
                        break;
                    case 'Z':
                        valore = valore + 25;
                        break;
                }
            }
        }
        int resto = valore % 26;
        switch (resto) {
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
                return "F";
            case 6:
                return "G";
            case 7:
                return "H";
            case 8:
                return "I";
            case 9:
                return "J";
            case 10:
                return "K";
            case 11:
                return "L";
            case 12:
                return "M";
            case 13:
                return "N";
            case 14:
                return "O";
            case 15:
                return "P";
            case 16:
                return "Q";
            case 17:
                return "R";
            case 18:
                return "S";
            case 19:
                return "T";
            case 20:
                return "U";
            case 21:
                return "V";
            case 22:
                return "W";
            case 23:
                return "X";
            case 24:
                return "Y";
            case 25:
                return "Z";
            default:
                return null;
        }
    }
}
