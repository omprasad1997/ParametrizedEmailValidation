package com.emailparameterised;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

    @RunWith(Parameterized.class)
    public class ValidateEmailTest {

        private String emailTest;
        private boolean expectedResult;

        public ValidateEmailTest(String email,boolean expectedResult) {
            this.emailTest = email;
            this.expectedResult = expectedResult;
        }

    @Parameterized.Parameters
    public static Collection data(){
            return Arrays.asList(new Object[][] {{"abc@yahoo.com",true},
                                                  {"abc-100@.yahoo.com",false},
                                                  {"abc111@yahoo.com",true},
                                                  {"abc-100@abc.com",true},
                                                  {"abc.100@abc.com",true},
                                                  {"abc+100@gmail.com",true},
            });
    }
    @Test
        public void givenEmailAsVar_ShouldReturnAsPerParametrisedResult(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validEmailAddress(this.emailTest);
        Assert.assertEquals(this.expectedResult,result);
    }
}

