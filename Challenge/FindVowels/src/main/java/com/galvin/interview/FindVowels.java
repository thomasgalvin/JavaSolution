package com.galvin.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The purpose of this exercise is to find all of the vowels in a given string. For the purpose of this
 * exercise, 'y' does **not** count as a vowel.
 */
public class FindVowels {
    private static final String VOWELS = "aeiou";

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
            if( VOWELS.contains( "" + c ) ) count++;
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
            if( VOWELS.contains( "" + c ) ) set.add(c);
        }

        return set.size();
    }
}
