package com.mentora;


import org.junit.jupiter.api.Test;

import java.util.Random;

import static junit.framework.Assert.assertEquals;

public class TestStringCalculator {
   /*
    "" => "0"
    "1"
    "1,2"
    "zjdjd"
    */

    @Test
    public void test_return_zero_when_input_is_a_empty_string() {
        StringCalculator stringCalculator = new StringCalculator();
        String result = stringCalculator.sum("");
        assertEquals("0", result);
    }

    @Test
    public void test_return_input_when_input_is_a_single_number() {
        StringCalculator stringCalculator = new StringCalculator();
        Random random = new Random();
        String randomInput = String.valueOf(random.nextInt());
        String result = stringCalculator.sum(randomInput);
        assertEquals(randomInput, result);
    }

    @Test
    public void test_return_sum_when_input_is_two_numbers_separated_with_comma() {
        StringCalculator stringCalculator = new StringCalculator();
        String result = stringCalculator.sum("1,2");
        assertEquals("3", result);
    }
}
