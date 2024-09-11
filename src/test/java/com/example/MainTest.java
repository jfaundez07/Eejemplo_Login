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
    void testGetIndex1() {
        // Test for existing user
        assertEquals(2, Main.getIndex(users, "joaquin03"));
    }

    @Test
    void testGetIndex2() {
        // Test for non-existing user
        assertEquals(-1, Main.getIndex(users, "nonexistent"));
    }

    @Test
    void testValidateUser1() {  
        // Test for existing user
        assertTrue(Main.validateUser(users, "samuel01"));
    }

    @Test
    void testValidateUser2() {
        // Test for non-existing user
        assertFalse(Main.validateUser(users, "phantom_helper"));
    }

    @Test
    void testValidateCredentials1() {
        // Test for correct credentials
        assertTrue(Main.validateCredentials(passwords, 1, "pelizari_ufromail"));
    }

    @Test
    void testValidateCredentials2() {
        // Test for incorrect credentials
        assertFalse(Main.validateCredentials(passwords, 0, "very_safe_password"));
    }

}




