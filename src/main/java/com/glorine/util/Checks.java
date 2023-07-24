package com.glorine.util;
import com.glorine.models.Use

public class Checks {

        public boolean isValid(UserInput userInput){
            boolean operationIsValid = operationValidator(userInput.getOperation());
            boolean messageIsValid = messageValidator(userInput.getMessage());
            boolean keyIsValid = keyValidator(userInput.getKey());
            return operationIsValid && messageIsValid && keyIsValid;
        }
        private boolean operationValidator(String operation){
            boolean isValid = operation.equalsIgnoreCase("encode") || operation.equalsIgnoreCase("decode");
            return isValid;
        }
        private boolean messageValidator(String message){
            boolean isBlankorEmpty = message.isBlank() && message.isEmpty();
            return !isBlankorEmpty;
        }
        private boolean keyValidator(int key){
            if(key >=1 && key <= 25){
                return true;
            }
            return false;
        }

    }
}
