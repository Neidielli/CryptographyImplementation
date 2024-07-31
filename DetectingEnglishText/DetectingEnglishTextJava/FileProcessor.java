package DetectingEnglishText.DetectingEnglishTextJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    private List<String> words;

    public FileProcessor() {
        this.words = new ArrayList<>();
        getData();
    }

    private void getData() {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(new File("english_words.txt"));
            bufferedReader = new BufferedReader(fileReader);

            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                words.add(line.toUpperCase());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public List<String> getWords() {
        return this.words;
    }
}
