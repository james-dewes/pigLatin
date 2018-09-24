/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;

import java.util.*;

/**
 *
 * @author james.dewes
 */
public class PigLatin {

    private static Collection<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static String convertWord(String aString) {
        aString = aString.toLowerCase();
        if (vowels.contains(aString.charAt(0))) {
            return aString + "yay";
        } else {
            char[] word = aString.toCharArray();
            int i = 0 ;
            while(!vowels.contains(word[i])){
                i++;
            }
            return aString.substring(i) + aString.substring(0,i) + "ay";
        }
        
    }
    public static String convert(String aString) {
        String result = "";
        String[] words = aString.split(" ");
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
