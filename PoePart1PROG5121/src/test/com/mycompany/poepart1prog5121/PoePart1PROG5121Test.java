package com.mycompany.poepart1prog5121;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PoePart1PROG5121Test {

    // ===============================
    // Username Tests
    // ===============================

    @Test
    public void testUsernameCorrectlyFormatted() {
        PoePart1PROG5121 login = new PoePart1PROG5121();
        assertTrue(login.checkUserName("kyl_1"));
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {
        PoePart1PROG5121 login = new PoePart1PROG5121();
        assertFalse(login.checkUserName("kyle!!!!"));
    }

    // ===============================
    // Password Tests
    // ===============================

    @Test
    public void testPasswordMeetsComplexity() {
        PoePart1PROG5121 login = new PoePart1PROG5121();
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testPasswordFailsComplexity() {
        PoePart1PROG5121 login = new PoePart1PROG5121();
        assertFalse(login.checkPasswordComplexity("password"));
    }

    // ===============================
    // Cell Phone Tests
    // ===============================

    @Test
    public void testCellPhoneCorrectFormat() {
        PoePart1PROG5121 login = new PoePart1PROG5121();
        assertTrue(login.checkCellPhoneNumber("+27838968976"));
    }

    @Test
    public void testCellPhoneIncorrectFormat() {
        PoePart1PROG5121 login = new PoePart1PROG5121();
        assertFalse(login.checkCellPhoneNumber("08966553"));
    }

    // ===============================
    // Register User Tests
    // ===============================

    @Test
    public void testRegisterUserSuccess() {
        PoePart1PROG5121 login = new PoePart1PROG5121();

        String result = login.registerUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        assertEquals(
            "Welcome Kyle Smith, it is great to see you.",
            result
        );
    }

    @Test
    public void testRegisterUserInvalidUsername() {
        PoePart1PROG5121 login = new PoePart1PROG5121();

        String result = login.registerUser(
                "kyle!!!!",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        assertEquals(
            "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.",
            result
        );
    }

    @Test
    public void testRegisterUserInvalidPassword() {
        PoePart1PROG5121 login = new PoePart1PROG5121();

        String result = login.registerUser(
                "kyl_1",
                "password",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        assertEquals(
            "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.",
            result
        );
    }

    @Test
    public void testRegisterUserInvalidCellPhone() {
        PoePart1PROG5121 login = new PoePart1PROG5121();

        String result = login.registerUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "08966553",
                "Kyle",
                "Smith"
        );

        assertEquals(
            "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.",
            result
        );
    }

    // ===============================
    // Login Tests
    // ===============================

    @Test
    public void testLoginSuccess() {
        PoePart1PROG5121 login = new PoePart1PROG5121();

        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");

        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginFail() {
        PoePart1PROG5121 login = new PoePart1PROG5121();

        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");

        assertFalse(login.loginUser("wrongUser", "wrongPass"));
    }

    // ===============================
    // Return Login Status Tests
    // ===============================

    @Test
    public void testReturnLoginStatusSuccess() {
        PoePart1PROG5121 login = new PoePart1PROG5121();

        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");

        assertEquals(
            "Welcome Kyle Smith, it is great to see you again.",
            login.returnLoginStatus("kyl_1", "Ch&&sec@ke99!")
        );
    }

    @Test
    public void testReturnLoginStatusFail() {
        PoePart1PROG5121 login = new PoePart1PROG5121();

        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");

        assertEquals(
            "Username or password incorrect, please try again.",
            login.returnLoginStatus("wrongUser", "wrongPass")
        );
    }
}