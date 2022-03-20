package com.ffleitas.utils;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {

    @Test
    public void repeat_string_multiple_times() {

        Assert.assertEquals("HolaHolaHola", Utils.repeat("Hola", 3));
    }
    
    @Test
    public void repeat_string_once() {
        Assert.assertEquals("Hola", Utils.repeat("Hola", 1));
    }
    
    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", Utils.repeat("Hola", 0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        Assert.assertEquals("", Utils.repeat("Hola", -1));
    }
}