import java.util.Scanner;

public class Game {
    private GameMap map;
    private Player player;
    private boolean running;
    
    public Game() {
        map = new GameMap();
        player = new Player(5, 5, 0);
        running = true;
    }

    private void opener(){
        System.out.println("Welcome to the Dungeon of Doom!!!!");
        System.out.println("Please refer to the list below for your options in the game:");

        System.out.println("Command\t\tResponse");
        System.out.println("------------------");
        System.out.println("HELLO\t\tTells you how much gold you need to win the game.");
        System.out.println("GOLD\t\tTells you how much gold you have.");
        System.out.println("PICKUP\t\tPicks up gold on your location.");
        System.out.println("MOVE <Direction>\t\tEnter Move N/S/E/W. For example, MOVE S.");
        System.out.println("LOOK\t\tAllows you to look at the grid.");
        System.out.println("QUIT\t\tAllows you to win or exit the game, depending on if you have enough gold!");
    }
    


    public void start() {
        Scanner scanner = new Scanner(System.in);
        opener();
        String command;

        while (running) {
            System.out.print("Enter a command: ");
            command = scanner.nextLine().toUpperCase();

            if (command.equals("HELLO")){
                System.out.println("Gold to win: " + map.goldRequired);
            }

            else if (command.equals("GOLD")){
                System.out.println("You have: " + player.goldCollected);
                System.out.println("You need: " + (map.goldRequired - player.goldCollected) + "to win");
            }

            else if (command.equals("PICKUP")){
                player.pickup(map);
            }
            
            else if (command.substring(0,4).equals("MOVE")){
                player.move(command,map);
            }
            
            else if (command.equals("LOOK")){
                map.look(player);
            }

            else if (command.equals("QUIT")){
                running = player.quit(map);
            }
            else{
                System.out.println("Invalid input");
            }

            map.print(player);

        }
        scanner.close();
    }
}


