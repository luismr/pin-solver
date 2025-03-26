package com.detective;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class SolutionTest {

    @Test
    void testSolutionWithSimplePin() {
        String[] result = Solution.solution("1");
        assertArrayEquals(new String[]{"1", "2", "4"}, result);
    }

    @Test
    void testSolutionWithTwoDigitPin() {
        String[] result = Solution.solution("11");
        assertArrayEquals(new String[]{
            "11", "12", "14",
            "21", "22", "24",
            "41", "42", "44"
        }, result);
    }

    @Test
    void testSolutionWithZero() {
        String[] result = Solution.solution("0");
        assertArrayEquals(new String[]{"0", "8"}, result);
    }

    @Test
    void testSolutionWithNine() {
        String[] result = Solution.solution("9");
        assertArrayEquals(new String[]{"6", "8", "9"}, result);
    }

    @Test
    void testSolutionWithMultipleDigits() {
        String[] result = Solution.solution("123");
        assertTrue(result.length > 0);
        assertTrue(Arrays.asList(result).contains("123"));
        assertTrue(Arrays.asList(result).contains("223"));
    }
} 