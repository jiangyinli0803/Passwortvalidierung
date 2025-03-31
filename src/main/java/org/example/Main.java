package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String passwort;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Bitte geben Sie einen Passwort ein: ");
            passwort = scanner.nextLine();
            if(passwort.length() < 8){    // mindestens 8 Zeichen lang
                System.out.println("Das Passwort sollte mindesten 8 Zeichen lang.");
            }else if(!hasZiffer(passwort)){   // Ziffer enthält
                System.out.println("Das Passwort sollte Ziffer haben");
            }else if(!hasBuchstabe(passwort)){  // Groß- und kleinbuchstaben enthält
                System.out.println("Das Passwort sollte Groß- und Kleinbuchstabe haben");
            }else if(!hatSonderzeichen(passwort)){
                System.out.println("Das Passwort sollte Sonderzeichen haben");
            }
            else if(zuEinfach(passwort)){     // keine häufig verwendete Passwörter
                System.out.println("Das Passwort is zu schwach.");
            }else{
                System.out.println("Ihr Passwort erfüllt die Anforderungen.");
                return;
            }
        }while(true);



    }
    public static boolean hasZiffer(String passwort){
        //String[] buchstaben = passwort.split(" ");
        //for(String buchstabe : buchstaben){
        return passwort.matches(".*\\d.*");  //".*[0-9].*"
    }
    public static boolean hasBuchstabe(String passwort){
        String[] buchstaben = passwort.split(" ");
        for(String buchstabe : buchstaben){
            if(buchstabe.matches(".*[A-Z].*") && buchstabe.matches(".*[a-z].*")){
                return true;
            }
        }
        return false;
    }
    public static boolean zuEinfach(String passwort){

        if(passwort.matches("Passwor[td](\\d)\\1*") || passwort.matches("(\\d)\\1*Passwor[td]")
                || passwort.matches("(0)?12(3(4(5(6(7(8(9)?)?)?)?)?)?)?Passwor[td]")
                || passwort.matches("Passwor[td](0)?12(3(4(5(6(7(8(9)?)?)?)?)?)?)?")
                ||passwort.matches("Aa((0)?12345(6(7(8(9)?)?)?)?)?")
                ||passwort.matches("Aa(\\d)\\1{5,}")){
            return true;
        }
        return false;
    }
    public static boolean hatSonderzeichen(String passwort){
        return passwort.matches(".*[^a-zA-Z0-9].*");
    }
}