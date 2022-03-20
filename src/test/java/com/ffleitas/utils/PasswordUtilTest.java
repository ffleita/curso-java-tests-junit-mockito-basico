package com.ffleitas.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {

        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters() {

        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {

        assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcdefgh8"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {

        assertEquals(PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assessPassword("abcdefgh8.."));
    }
}
