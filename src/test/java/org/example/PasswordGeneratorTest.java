package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordGeneratorTest {

    @Test
    void whenGenerating_expectSafe(){
        //given

        //when
        String randomPasswort = PasswordGenerator.generatePassword();
        //then
        assertTrue(Main.isSafe(randomPasswort));


    }
}