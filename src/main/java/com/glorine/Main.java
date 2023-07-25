package com.glorine;

import java.util.Scanner;
import com.glorine.models.UserInput;
import com.glorine.util.Checks;
import com.glorine.services.CaesarCipher;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation;
        String message;
        int key;
        UserInput userInput = new UserInput();
        Checks checks = new Checks();
        UserInput input;

        System.out.println("Enter you operation **encode** or **decode**");
        operation = scanner.nextLine();

        System.out.println("Enter your message");
        message = scanner.nextLine();

        System.out.println("Enter key (0-25)");
        key = scanner.nextInt();

        userInput.setKey(key);
        userInput.setMessage(message);
        userInput.setOperation(operation);

        input = userInput;

        boolean userInputIsValid = checks.isValid(userInput);

        if(userInputIsValid){
            CaesarCipher caesarCipher = new CaesarCipher();
            userInput = input;
            if (userInput.getOperation().equalsIgnoreCase("encode")){
                caesarCipher.encode(userInput.getMessage(), userInput.getKey());

            }
            else if (userInput.getOperation().equalsIgnoreCase("decode")){
                caesarCipher.decode(userInput.getMessage(), userInput.getKey());
            }
        }
        else{
            System.out.println("Bad request, please try again");
        }

        scanner.close();
    }

}