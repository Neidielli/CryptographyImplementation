package CaesarCipherJava.CrackingWithFrequencyAnalysis;

public class App {

    public static void main(String[] args) {

        String cipher = "KHOORPBQDPHLVQHLGLHOOLDQGLPDJLUOZKRHQMRBVFBEHUVHFXULWBLKDYHDGHJUHHLQVRIWZDUHHQJLQHHULQJ";
        CrackCaesar cracker = new CrackCaesar();
        cracker.crackCaesar(cipher);

    }
}
