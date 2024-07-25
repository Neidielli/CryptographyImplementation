package CaesarCipherJava.CrackingWithFrequencyAnalysis;

import java.util.HashMap;
import java.util.Map;

public class CrackCaesar {

    // we have to calculate the frequencies of the letters in the cipherText
    private FrequencyAnalysis frequencyAnalysis;

    public CrackCaesar() {
        frequencyAnalysis = new FrequencyAnalysis();
    }

    // this is how we crack the cipher with frequency analysis
    public void crackCaesar(String cipherText) {

        // a hashmap stores the character-frequency pairs
        Map<Character, Integer> frequencies = frequencyAnalysis.run(cipherText);

        // a simple 0(n) linear to find the character with the maximum frequency
        Map.Entry<Character, Integer> maxEntry = null;

        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        // make a guess about the Caesar cipher's key
        char mostFrequentChar = maxEntry.getKey();

        int approximatedKey = Constants.ALPHABET.indexOf(mostFrequentChar) -
                Constants.ALPHABET.indexOf('E');
        System.out.println("The key is: " + approximatedKey);
    }

}
