import java.util.*;


public class GameMap {

    public List<List<String>> map;
 
    public GameMap() {
        map = new ArrayList<>();

        // Each row of the map is a list of strings
        map.add(List.of("#########"));
        map.add(List.of("#..G....#"));
        map.add(List.of("#.......#"));
        map.add(List.of("#.....G.#"));
        map.add(List.of("#.......#"));
        map.add(List.of("#.......#"));
        map.add(List.of("#.G.....#"));
        map.add(List.of("#.....E.#"));
        map.add(List.of("#########"));
    }

    public void print() {
        for (int i = 0; i < map.size(); i++){
            System.out.println(map.get(i));
        }
    }
}









       /* public static void reader(String[] args) {
        String filePath = "gamemaps/map1.txt"; // Specify the path to your file

   
        // Create a Scanner object to read the file
        Scanner scanner = new Scanner(filePath);

        // Read the file line by line
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line); // Print the line to the console
        }

        // Close the Scanner
        scanner.close();
   }*/