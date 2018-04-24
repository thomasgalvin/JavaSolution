package com.galvin.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The purpose of this exercise is to find all of the vowels in a given string.
 *
 * There are two methods: one counts all the letters in a string tha are vowels, and the second
 * counts how many unique vowels are in a string. Implement both methods.
 *
 * For the purpose of this exercise, 'y' does **not** count as a vowel.
 */
public class FindVowels {
    private static final Set<Character> VOWELS = new HashSet<>();
    static{
        for( char c: "aeiou".toCharArray() ) VOWELS.add(c);
    }

    /**
     * This method simply counts each letter in the string that is a vowel. Repeated vowels are counted.
     * So the string "This is who I am" would return 5.
     *
     * @param text the text
     * @return the number of vowels in the string
     */
    public int countVowels(String text){
        if( text == null || text.isEmpty() ) return 0;
        String lower = text.toLowerCase();

        int count = 0;
        for( char c: lower.toCharArray() ){
            if( isVowel(c) ) count++;
        }
        return count;
    }

    /**
     * This method counts the **unique** vowels in a String. Repeated vowels are **not** counted.
     * So the string "This is who I am" would return 3.
     *
     * @param text the text
     * @return the number of unique vowels
     */
    public int countUniqueVowels(String text){
        if( text == null || text.isEmpty() ) return 0;
        String lower = text.toLowerCase();

        Set<Character> set = new HashSet<>();
        for( char c: lower.toCharArray() ){
            if( isVowel(c) ) set.add(c);
        }

        return set.size();
    }

    private boolean isVowel(char c){
        return VOWELS.contains(c);
    }
}
