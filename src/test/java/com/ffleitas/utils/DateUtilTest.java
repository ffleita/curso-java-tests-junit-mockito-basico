package com.ffleitas.utils;

import com.ffleitas.utils.DateUtil;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateUtilTest {
    
    /* All years divisible by 400 ARE Leap years (1600, 2000, 2400)
All years divisible by 100 but not by 400 are NOT leap years (1700, 1880, 1900),
All years divisible by 4 but not by 100 ARE 1eap years (1996, 2004, 2008),
All years not divisible by 4 are NOT Leap years (2017, 2018, 2019) */
    
    @Test
    public void should_return_true_when_year_is_divisible_by_400() {
        
        assertTrue(DateUtil.isLeapYear(800));
    }
    
}
