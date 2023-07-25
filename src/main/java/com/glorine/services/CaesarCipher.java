package com.glorine.services;

import com.glorine.models.UserInput;


public class CaesarCipher {

    UserInput userInput = new UserInput();
    String message = userInput.getMessage();
    int key = userInput.getKey();
    int originalIndex;
    private final String lowerAlphabets = "abcdefghijklmnopqrstuvwxyz";

    private final String upperAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String encodedMessage = "";
    String decodedMessage = "";
    public String encode(String message, int key){
        for (int i = 0; i < message.length(); i++){
            char charFromMessage = message.charAt(i);
            if(Character.isLowerCase(charFromMessage)){
                originalIndex = lowerAlphabets.indexOf(charFromMessage);
                int newIndex = originalIndex + key;
                if(newIndex>25){
                    newIndex = newIndex -26;
                }
                encodedMessage += lowerAlphabets.charAt(newIndex);
            }
            else if(Character.isUpperCase(charFromMessage)){
                originalIndex = upperAlphabets.indexOf(charFromMessage);
                int newIndex = originalIndex + key;
                if(newIndex>25){
                    newIndex -= 26;
                }

                encodedMessage += upperAlphabets.charAt(newIndex);
            }
            else{
                originalIndex = lowerAlphabets.indexOf(charFromMessage);
            }
            if(originalIndex == -1){
                encodedMessage +=  charFromMessage;
            }
        }
        System.out.println("Your encoded message is: " + encodedMessage);

        return encodedMessage;
    }
    public String decode(String message, int key){
        for (int i = 0; i < message.length(); i++){
            char charFromMessage = message.charAt(i);
            if(Character.isLowerCase(charFromMessage)){
                originalIndex = lowerAlphabets.indexOf(charFromMessage);
                int newIndex = originalIndex - key;
                if(newIndex<0){
                    newIndex = newIndex +26;
                }
                decodedMessage += lowerAlphabets.charAt(newIndex);
            }
            else if(Character.isUpperCase(charFromMessage)){
                originalIndex = upperAlphabets.indexOf(charFromMessage);
                int newIndex = originalIndex - key;
                if(newIndex<0){
                    newIndex += 26;
                }

                decodedMessage += upperAlphabets.charAt(newIndex);
            }
            else{
                originalIndex = lowerAlphabets.indexOf(charFromMessage);
            }
            if(originalIndex == -1){
                decodedMessage +=  charFromMessage;
            }
        }
        System.out.println("Your decoded message is: " + decodedMessage);

        return decodedMessage;
    }

}

