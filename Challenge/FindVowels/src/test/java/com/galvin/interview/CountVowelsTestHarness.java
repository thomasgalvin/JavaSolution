package com.galvin.interview;

import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsTestHarness {
    private static final String VOWELS = "aeiou";
    private static final String[] input = {
            "This is who I am",
            "aeiou",
            "aeiouaeiou",
            "",
            null,
            "bcdfghjklmnpqrstvwxyz",
            "abcedfghijklmnopqrstuvwxyz",
            "abcedfghijklmnopqrstuvwxyzabcedfghijklmnopqrstuvwxyz",
            "a",
            "e",
            "i",
            "o",
            "u",
            "y",
            "AEIOU",
            "AEIOUAEIOU",
            "BCDFGHJKLMNPQRSTVWXYZ",
            "ABCEDFGHIJKLMNOPQRSTUVWXYZ",
            "ABCEDFGHIJKLMNOPQRSTUVWXYZABCEDFGHIJKLMNOPQRSTUVWXYZ",
            "A",
            "E",
            "I",
            "O",
            "U",
            "Y",
    };

    public void testCountVowels(){
        FindVowels findVowels = new FindVowels();
        for( String text: input ){
            int expected = countVowels(text);
            int result = findVowels.countVowels(text);
            System.out.println(result);
            Assert.assertEquals("Invalid vowel count for string: " + input, expected, result );
        }
    }

    private int countVowels(String text){
        if( text == null || text.isEmpty() ) return 0;
        String lower = text.toLowerCase();

        int count = 0;
        for( char c: lower.toCharArray() ){
            if( VOWELS.contains( "" + c ) ) count++;
        }
        return count;
    }

    public void testCountUniqueVowels(){
        FindVowels findVowels = new FindVowels();
        for( String text: input ){
            int expected = countUniqueVowels(text);
            int result = findVowels.countUniqueVowels(text);
            System.out.println(result);
            Assert.assertEquals("Invalid vowel count for string: " + input, expected, result );
        }
    }

    private int countUniqueVowels(String text){
        if( text == null || text.isEmpty() ) return 0;
        String lower = text.toLowerCase();

        Set<Character> set = new HashSet<>();
        for( char c: lower.toCharArray() ){
            if( VOWELS.contains( "" + c ) ) set.add(c);
        }

        return set.size();
    }
}
