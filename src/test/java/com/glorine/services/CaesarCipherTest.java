package com.glorine.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @Test
    void testEncodeReturnsTrue() {
        String plainText = "yes";
        String cipherText = "agu";
        int key = 2;
        CaesarCipher caesarCipher = new CaesarCipher();
        String output = caesarCipher.encode(plainText,key);
        assertEquals(cipherText, output)
    }

    @Test
    void testDecodereturnsTrue() {
        String cipherText = "agu";
        String plainText = "yes";
        int key = 2;
        CaesarCipher caesarCipher = new CaesarCipher();
        String output = caesarCipher.encode(plainText,key);
        assertEquals(plainText, output);
    }
}