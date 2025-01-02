public class Player {
    
    int x;
    int y;
    int goldCollected;
    boolean running;
    
    public Player (int x, int y, int goldCollected){

        this.x = x;
        this.y = y;
        this.goldCollected = goldCollected;
        this.running = true;
    }

    public void move (char direction, GameMap map) {
        int newX = x;
        int newY = y;

        switch (direction) {
            case 'W': 
                newX--; 
                break;
            case 'A': 
                newY--; 
                break;
            case 'S':
                newX++;
                break;
            case 'D':
                newY++;
                break;
            default:
                System.out.println("Invalid move! Use W/A/S/D.");
                return;
        }


        // Handle interactions
        char destination = map.getCell(newX, newY);
        switch (destination) {
            case '.':
                break;
            case 'G':
                System.out.println("You found Gold!");
                goldCollected += 1;
                System.out.println(goldCollected);
                break;
            case '#':
                System.out.println("You hit a wall!");
                return;
            case 'E':
                if (goldCollected > 1){
                    running = false;
                }
                else{
                    System.out.println("You can't exit the game yet!");
                    return;
                }
        }        

        // Update player position
        x = newX;
        y = newY;

        // Clear the old cell
        map.setCell(newX, newY, '.');
    }

    // Getters and setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
