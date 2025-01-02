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

    public void move (String direction, GameMap map) {
        int newX = x;
        int newY = y;

        switch (direction) {
            case "MOVE N": 
                newY--; 
                break;
            case "MOVE W": 
                newX--; 
                break;
            case "MOVE S":
                newY++;
                break;
            case "MOVE E":
                newX++;
                break;
            default:
                System.out.println("MOVE N/ MOVE S/ MOVE E/ MOVE W: ");
                return;
        }


        // Handle interactions
        char destination = map.getCell(newX, newY);
        if (destination == '#'){
            return;
        }  

        // Update player position
        x = newX;
        y = newY;
    }

    public void pickup(GameMap map){
        if (map.getCell(getY(), getX()) == 'G'){
            goldCollected += 1;
            System.out.println("Success. Gold owned: " + goldCollected);
            map.setCell(getY(), getX(), '.');
        }
        else{
            System.out.println("Failed. Gold owned: " + goldCollected);
            System.out.println(map.getCell(getY(), getX()));
            System.out.println(getX());
            System.out.println(getY());
        }
    }

    public boolean quit(GameMap map){

        if (map.getCell(getY(), getX()) == 'E'){
            if (goldCollected >= map.goldRequired){
                System.out.println("WIN");
                System.out.println("Congratulations!");
                return false;
            }
            else{
                System.out.println("LOSE");
                System.out.println("Unlucky, better luck next time.");
                return false;
            }
        }
        else{
            System.out.println("You need to be on 'E' to win/exit the game. ");
            return true;
        }

    }

    // Getters and setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
