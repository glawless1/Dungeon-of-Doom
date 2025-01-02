import java.util.Scanner;

public class Game {
    private GameMap map;
    private Player player;
    
    public Game() {
        map = new GameMap();
        player = new Player(5, 5, 0); // Starting position (5,5) and health 100
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (player.running) {
            map.print(player);
            System.out.print("Move (W/A/S/D): ");
            char move = scanner.next().toUpperCase().charAt(0);
            player.move(move, map);
        }
        System.out.println("Congratulations! You win!");
        scanner.close();
    }
}


