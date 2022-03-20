package com.ffleitas.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilTest {
    
    @Test
    public void is_a_string_not_empty() {
        assertFalse(StringUtil.isEmpty("asdasdasd"));
    }
    
    @Test
    public void comilla_doble_is_empty() {
        assertTrue(StringUtil.isEmpty(""));
    }
    
    @Test
    public void null_is_empty() {
        assertTrue(StringUtil.isEmpty(null));
    }
}
