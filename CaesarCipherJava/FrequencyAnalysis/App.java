public class App {
    public static void main(String[] args) {

        String text = "My name is Neidielli and i like cryptography!!";

        FrequencyAnalysis analysis = new FrequencyAnalysis();
        analysis.showFrequencies(text);
    }
}
