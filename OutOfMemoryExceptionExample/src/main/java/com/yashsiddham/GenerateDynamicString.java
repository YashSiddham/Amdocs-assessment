package com.yashsiddham;

import java.util.*;

public class GenerateDynamicString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Using a linked HashMap over HashMap, to maintain order in which alphabets are supposed to be added
        // Also, Hashmap gives inconsistent results as compared to LinkedHashMap
        Map<Character, Integer> alphabetMap = new LinkedHashMap<>();
        int distinctCharacters = 0;

        // While loop keeps prompting users to enter a valid input in case
        // users do not enter a valid number
        while (true) {
            System.out.print("Enter the number of distinct alphabets: ");
            String inputReps = scanner.nextLine();
            try {
                distinctCharacters = Integer.parseInt(inputReps);
                if (distinctCharacters > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer greater than 0.");
                }
            } catch (NumberFormatException e) {

                System.out.println("Invalid input.");
            }
        }

        // Accepting characters and their number of occurences
        for (int i = 0; i < distinctCharacters; i++) {
            System.out.print("Enter alphabet " + (i + 1) + ": ");
            char alphabet = scanner.next().charAt(0);
            System.out.print("Enter the number of occurrences for '" + alphabet + "': ");
            int count = scanner.nextInt();

            // Entering the alphabet and it's count in the LinkedHashMap
            alphabetMap.put(alphabet, count);
        }

        // Finally building a string with the
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : alphabetMap.entrySet()) {
            char alphabet = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                result.append(alphabet);
            }
        }
        System.out.println("Generated String: " + result.toString());
        scanner.close();
    }
}