package com.glorine.util;
import com.glorine.models.UserInput

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChecksTest {

    @Test
    void testInvalidOperation_checkReturnsFalse() {
        Checks checks = new Checks();
        UserInput userInput = new UserInput();
        userInput.setOperation("rtrgrg");
        userInput.setMessage("message");
        userInput.setKey(1);
        assertFalse(checks.isValid(userInput));
    }
    @Test
    public void testInvalidmessage_checkReturnsFalse() {
        Checks checks = new Checks();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("");
        userInput.setKey(1);
        assertFalse(checks.isValid(userInput));
    }
    @Test
    public void testInvalidkey_checkReturnsFalse() {
        Checks checks = new Checks();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("hello");
        userInput.setKey(26);
        assertFalse(checks.isValid(userInput));
    }
    @Test
    public void testValidInputs_checkReturnsTrue() {
        Checks checks = new Checks();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("hello");
        userInput.setKey(4);
        assertTrue(checks.isValid(userInput));
    }
}