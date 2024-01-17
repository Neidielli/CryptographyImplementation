package CaesarCipherJava;

public class CaesarCipher {

    // all the letters of the alphabet
    private String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encrypt(String plainText, int key) {
        String cipherText = "";

        // case insensitive
        plainText = plainText.toUpperCase();

        // consider all the letters in the plain_text
        for (int i = 0; i < plainText.length(); i++) {
            char character = plainText.charAt(i);
            // find the numerical representation associated with that character in the
            // alphabet
            int charIndex = alphabet.indexOf(character);
            int encryptedIndex = Math.floorMod(charIndex + key, alphabet.length());

            // keep appending the encrypted character to the cipher_text
            cipherText += alphabet.charAt(encryptedIndex);
        }
        return cipherText;
    }

    public String decrypt(String cipherText, int key) {
        String plainText = "";

        for (int i = 0; i < cipherText.length(); ++i) {
            char character = cipherText.charAt(i);
            int charIndex = alphabet.indexOf(character);
            int decryptedIndex = Math.floorMod(charIndex - key, alphabet.length());
            plainText += alphabet.charAt(decryptedIndex);
        }
        return plainText;
    }

}