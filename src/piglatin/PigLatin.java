/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;

import java.util.*;
import java.util.regex.*;

/**
 *
 * @author james.dewes
 */
public class PigLatin {

    private static final Collection<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    private static final String punctuationPattern = "[\\p{Punct}\\p{IsPunctuation}]";
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static String convertWord(String aString) {
        aString = aString.toLowerCase();
        //handle non letter charicters
        char lastChar = aString.charAt(aString.length()-1); 
        boolean punctuation = Pattern.matches(punctuationPattern, ""+lastChar);
        if(punctuation){
            aString = aString.substring(0, aString.length()-1);
        }        
        
        //everything else
        if (vowels.contains(aString.charAt(0))) {
            aString += "yay";
        } else {
            char[] word = aString.toCharArray();
            int i = 0 ;
            while(i<word.length && !vowels.contains(word[i])){
                i++;
            }
            aString = aString.substring(i) + aString.substring(0,i) + "ay";
            
        }
        if(punctuation)
            {
                aString += lastChar;
            }
        return aString;
        
    }
    public static String convert(String aString) {
        String result = "";
        String[] words = aString.split("\\s+");
        for(int i = 0; i < words.length;i++)
        {
            result += convertWord(words[i]);
            if(i != words.length){
                 result +=  " ";
            }
        }
        return result;
    }
}
