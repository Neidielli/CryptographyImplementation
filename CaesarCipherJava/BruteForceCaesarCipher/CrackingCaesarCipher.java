package CaesarCipherJava.BruteForceCaesarCipher;

// Cracking Caesar Cipher in Java using Brute Force
public class CrackingCaesarCipher {

    private String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public void crack(String cipherText) {
        // we try all the possible key values (27)
        for (int key = 0; key < ALPHABET.length(); ++key) {

            String plainText = "";

            for (int i = 0; i < cipherText.length(); ++i) {
                char character = cipherText.charAt(i);
                int charIndex = ALPHABET.indexOf(character);
                int decryptedIndex = Math.floorMod(charIndex - key, ALPHABET.length());
                plainText += ALPHABET.charAt(decryptedIndex);
            }

            // print the actual decrypted string with the given key
            System.out.format("Cracking Caesar-cipher with %s key the result is: %s%n",
                    key, plainText);
        }
    }
}
