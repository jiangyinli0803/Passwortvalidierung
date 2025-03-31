package org.example;

import java.util.Random;

public class PasswordGenerator {

    private static final char[] PossibleChars = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3',
            '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
            'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', '!', '@', '#', '$', '%', '&', '^','*',
            '?'
    };


   public static String generatePassword() {
       String randomPassword;
       do {
           char[] chars = new char[8];
           for (int i = 0; i < chars.length; i++) {
               int charIndex = new Random().nextInt(PossibleChars.length - 1);
               chars[i] = PossibleChars[charIndex];
           }
           randomPassword = new String(chars);
       }while(!Main.isSafe(randomPassword));
      return randomPassword;
   }

}
