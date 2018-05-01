/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamorse;

/**
 *
 * @author Julio Chan
 */
import java.util.Scanner;

public class PruebaMorse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String text = null;
        String morse = null;
        
        System.out.println("Ingrese texto para convertir a código morse"
                + " o viceversa.");
        text = r.nextLine();
        
        morse = convert(text);
        
        System.out.println(morse);
    }
    
    static String convert(String text) {
        String result = "";
        String[] parts = text.split(" ");
        
        for (String word : parts) {
            if (!word.contains(".")) {
                String[] characters = word.split("");
                for (String c : characters) {
                    result += charConverter(c) + " ";
                }
                result += "  ";
            }
            else if (word.contains(".") || word.contains("-")) {
                result += charConverter(word) + " ";
            }
        }
        
        return result;
    }
    
    private static String charConverter(String character) {
        String cha = character.toUpperCase();
        String c = null;
        
        switch (cha) {
            case "A":
                c = ".-";
            break;
            
            case ".-":
                c = "A";
            break;
            
            case "B":
                c = "-...";
            break;
            
            case "-...":
                c = "B";
            break;
            
            case "C":
                c = "-.-.";
            break;
            
            case "-.-.":
                c = "C";
            break;
            
            case "D":
                c = "-..";
            break;
            
            case "-..":
                c = "D";
            break;
            
            case "E":
                c = ".";
            break;
            
            case ".":
                c = "E";
            break;
            
            case "F":
                c = "..-.";
            break;
            
            case "..-.":
                c = "F";
            break;
            
            case "G":
                c = "--.";
            break;
            
            case "--.":
                c = "G";
            break;
            
            case "H":
                c = "....";
            break;
            
            case "....":
                c = "H";
            break;
            
            case "I":
                c = "..";
            break;
            
            case "..":
                c = "I";
            break;
            
            case "J":
                c = ".---";
            break;
            
            case ".---":
                c = "J";
            break;
            
            case "K":
                c = "-.-";
            break;
            
            case "-.-":
                c = "K";
            break;
            
            case "L":
                c = ".-..";
            break;
            
            case ".-..":
                c = "L";
            break;
            
            case "M":
                c = "--";
            break;
            
            case "--":
                c = "M";
            break;
            
            case "N":
                c = "-.";
            break;
            
            case "-.":
                c = "N";
            break;
            
            case "O":
                c = "---";
            break;
            
            case "---":
                c = "O";
            break;
            
            case "P":
                c = ".--.";
            break;
            
            case ".--.":
                c = "P";
            break;
            
            case "Q":
                c = "--.-";
            break;
            
            case "--.-":
                c = "Q";
            break;
            
            case "R":
                c = ".-.";
            break;
            
            case ".-.":
                c = "R";
            break;
            
            case "S":
                c = "...";
            break;
            
            case "...":
                c = "S";
            break;
            
            case "T":
                c = "-";
            break;
            
            case "-":
                c = "T";
            break;
            
            case "U":
                c = "..-";
            break;
            
            case "..-":
                c = "U";
            break;
            
            case "V":
                c = "...-";
            break;
            
            case "...-":
                c = "V";
            break;
            
            case "W":
                c = ".--";
            break;
            
            case ".--":
                c = "W";
            break;
            
            case "X":
                c = "--..--";
            break;
            
            case "--..--":
                c = "X";
            break;
            
            case "Y":
                c = "-.--";
            break;
            
            case "-.--":
                c = "Y";
            break;
            
            case "Z":
                c = "--..";
            break;
            
            case "--..":
                c = "Z";
            break;
            
            case "1":
                c = ".----";
            break;
            
            case ".----":
                c = "1";
            break;
            
            case "2":
                c = "..---";
            break;
            
            case "..---":
                c = "2";
            break;
            
            case "3":
                c = "...--";
            break;
            
            case "...--":
                c = "3";
            break;
            
            case "4":
                c = "....-";
            break;
            
            case "....-":
                c = "4";
            break;
            
            case "5":
                c = ".....";
            break;
            
            case ".....":
                c = "5";
            break;
            
            case "6":
                c = "-....";
            break;
            
            case "-....":
                c = "6";
            break;
            
            case "7":
                c = "--...";
            break;
            
            case "--...":
                c = "7";
            break;
            
            case "8":
                c = "---..";
            break;
            
            case "---..":
                c = "8";
            break;
            
            case "9":
                c = "----.";
            break;
            
            case "----.":
                c = "9";
            break;
            
            case "0":
                c = "-----";
            break;
            
            case "-----":
                c = "0";
            break;
            
            default:
                c = "(x)";
            break;
        }
        
        return c;
    }
    
}
