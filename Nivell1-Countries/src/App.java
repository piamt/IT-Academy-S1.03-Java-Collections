import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class App {

    final static String COUNTRIES_FILEPATH = "./src/countries.txt"; 
    final static String SCORE_FILEPATH = "./src/scores.txt"; 
    public static void main(String[] args) throws Exception {

        Map<String, String> mapFromFile = hashMapFromTextFile();
        Scanner sc = new Scanner(System.in);

        // Ask user name
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        // Get 10 random countries from countries.txt
        String[] countries = getRandomKeys(mapFromFile);

        // Repeat 10 times:
        int score = 0;
        for (int i = 0; i < 10; i++) {

            // Get capital from country i
            String country = countries[i];
            String capital = mapFromFile.get(country);

            // Ask the user for the capital
            System.out.println(name + ", which is the capital of " + country);  
            String capitalAttempt = sc.nextLine();
    
            // Check if the answer is correct and add 1 point in this case
            if((capitalAttempt != null && capitalAttempt.equalsIgnoreCase(capital))) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Meeeec! It was " + capital);
            }
        }
        System.out.println("Thank you for participating!");
    
        // Create scores.txt file if does not exist and add new line with user name and final score
        Path path = Paths.get(SCORE_FILEPATH);
        try {
            appendToFile(path, name + " : " + score + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Could not create score files or access it");
        }
    }
    
    public static Map<String, String> hashMapFromTextFile() {
  
        Map<String, String> map = new HashMap<>(); 
  
        try {
            List<String> list = Files.readAllLines(Paths.get(COUNTRIES_FILEPATH));
            for (String line : list) {
                String[] parts = line.split(" "); 
                String country = parts[0].trim(); 
                String capital = parts[1].trim(); 
                if (!country.equals("") && !capital.equals("")) {
                    map.put(country, capital); 
                }
            }
        } 
        catch (IOException e) { 
            System.out.println("File could not be read");
        } 
        return map; 
    }

    private static void appendToFile(Path path, String content) throws IOException {
        Files.write(path, content.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);

    }

    private static String[] getRandomKeys(Map<String, String> map) {
        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        Random random = new Random();
        String array[] = new String[10];

        for (int i = 0; i < 10; i++) {
            array[i] = keyList.get(random.nextInt(keyList.size()));
        }
        return array;
    }
}
