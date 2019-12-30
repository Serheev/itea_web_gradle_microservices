package com.serheev;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationService {

    private static final String DATE_REGEX = "^\\d{2}-\\d{2}-\\d{4}$";
    private static final String IP4_REGEX = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    private static Pattern pattern;
    private Matcher matcher;

    public boolean isValidDate(String date) {
        pattern = Pattern.compile(DATE_REGEX);
        matcher = pattern.matcher(date);
        boolean isTrue = matcher.matches();
        return isTrue;
    }

    public boolean isValidIP4(String ip4) {
        pattern = Pattern.compile(IP4_REGEX);
        matcher = pattern.matcher(ip4);
        return matcher.matches();
    }
}
