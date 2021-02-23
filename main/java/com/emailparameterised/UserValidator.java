package com.emailparameterised;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String EMAIL_ADDRESS = "^(abc)?(.+)@([0-9a-zA-Z][-]?)([.][a-z]{2,3})?(.*)$";

    public boolean validEmailAddress(String email) {
        return Pattern.matches(EMAIL_ADDRESS, email);
    }
}
