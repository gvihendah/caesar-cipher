package com.glorine.util;
import com.glorine.models.UserInput

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChecksTest {

    @Test
    void isValid() {
        Checks checks = new Checks();
        UserInput userInput = new UserInput();
        userInput.setOperation("rtrgrg");
        userInput.setMessage("message");
        userInput.setKey(1);
        assertFalse(checks.isValid(userInput));
    }
}