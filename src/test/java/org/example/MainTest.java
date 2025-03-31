package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void hasZiffer_shouldReturnTrue_whenCalledWithPasswort() {
        String passwort = "1245ssaf";
        boolean actural = Main.hasZiffer(passwort);
        assertTrue(actural);
    }

    @Test
    void isZuEinfach_shouldReturnTrue_whenCalledWithPasswort() {
        String passwort = "Password1";
        boolean actural = Main.zuEinfach(passwort);
        assertTrue(actural);
    }
}