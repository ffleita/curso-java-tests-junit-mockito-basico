package com.ffleitas.utils;

public class StringUtil {

    public static boolean isEmpty(String str) {
        
        if (str.trim().isEmpty() || str == null)
            return true;
        
        return false;
    }
}
