package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    String[] users;
    String[] passwords;

    @BeforeAll
    void setUp() {
        users = new String[]{"samuel01", "nicolas02", "joaquin03"};
        passwords = new String[]{"sepulveda_ufrontera", "pelizari_ufromail","faundez_ufromail"};
    }

    @AfterAll
    void tearDown() {
        users = null;
        passwords = null;
    }

    @Test
    void testGetIndex() {
            
        // Test for existing user
        assertEquals(0, Main.getIndex(users, "samuel01"));
        assertEquals(1, Main.getIndex(users, "nicolas02"));
        assertEquals(2, Main.getIndex(users, "joaquin03"));
        
        // Test for non-existing user
        assertEquals(-1, Main.getIndex(users, "nonexistent"));
        assertEquals(-1, Main.getIndex(users, "1"));
    }

    @Test
    void testValidateUser() {
            
        // Test for existing user
        assertTrue(Main.validateUser(users, "samuel01"));
        assertTrue(Main.validateUser(users, "nicolas02"));
        assertTrue(Main.validateUser(users, "joaquin03"));

        // Test for non-existing user
        assertFalse(Main.validateUser(users, "phantom_helper"));
        assertFalse(Main.validateUser(users, "1"));
    }

    @Test
    void testValidateCredentials() {

        // Test for correct credentials
        assertTrue(Main.validateCredentials(passwords, 0, "sepulveda_ufrontera"));
        assertTrue(Main.validateCredentials(passwords, 1, "pelizari_ufromail"));
        assertTrue(Main.validateCredentials(passwords, 2, "faundez_ufromail"));

        // Test for incorrect credentials
        assertFalse(Main.validateCredentials(passwords, 0, "very_safe_password"));
        assertFalse(Main.validateCredentials(passwords, 1, "wrong_password"));
        assertFalse(Main.validateCredentials(passwords, 2, "my_beauty_password"));
    }

}




