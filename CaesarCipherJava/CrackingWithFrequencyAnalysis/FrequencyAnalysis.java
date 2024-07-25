package CaesarCipherJava.CrackingWithFrequencyAnalysis;

import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalysis {
    // private String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // the method to do frequency analysis. Count the occurences of the given
    // characters
    public Map<Character, Integer> run(String text) {

        // convert the text into uppercase letters
        text = text.toUpperCase();

        // we use a hashmap to store the letter-frequency pair
        Map<Character, Integer> frequencies = new HashMap<>();

        // initialize the HashMap with all the letters of the ALPHABET with frequencies
        // 0
        for (int i = 0; i < Constants.ALPHABET.length(); ++i)
            frequencies.put(Constants.ALPHABET.charAt(i), 0);

        // consider the text we want to analyze
        for (int i = 0; i < text.length(); ++i) {
            char c = text.charAt(i);

            // keep incrementing the occurrence of the given letter if it is present in the
            // ALPHABET
            if (Constants.ALPHABET.indexOf(c) != -1)
                frequencies.put(c, frequencies.get(c) + 1);
        }

        return frequencies;
    }

    public void showFrequencies(String text) {
        Map<Character, Integer> frequencies = run(text);

        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            System.out.format("Character %s has frequency: %s%n",
                    entry.getKey(), entry.getValue());
        }
    }
}