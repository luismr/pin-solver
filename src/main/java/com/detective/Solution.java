package com.detective;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPin = scanner.nextLine();
        scanner.close();

        String[] result = solution(inputPin);
        System.out.println(Arrays.toString(result));
    }

    public static String[] solution(String pin) {
        // Adjacency map based on keypad layout and test cases
        Map<Character, List<Character>> adjacentDigits = Map.of(
            '0', List.of('0', '8'),
            '1', List.of('1', '2', '4'),
            '2', List.of('1', '2', '3', '5'),
            '3', List.of('2', '3', '6', '5'),
            '4', List.of('1', '4', '5', '7'),
            '5', List.of('2', '4', '5', '6', '8'),
            '6', List.of('3', '5', '6', '9'),
            '7', List.of('4', '7', '8'),
            '8', List.of('5', '7', '8', '9', '0'),
            '9', List.of('6', '8', '9')
        );

        List<String> combinations = new ArrayList<>();
        backtrack(pin, 0, new StringBuilder(), adjacentDigits, combinations);

        Collections.sort(combinations);
        return combinations.toArray(new String[0]);
    }

    private static void backtrack(String pin, int index, StringBuilder current,
                                  Map<Character, List<Character>> adjMap, List<String> result) {
        if (index == pin.length()) {
            result.add(current.toString());
            return;
        }

        char digit = pin.charAt(index);
        for (char adj : adjMap.get(digit)) {
            current.append(adj);
            backtrack(pin, index + 1, current, adjMap, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
} 