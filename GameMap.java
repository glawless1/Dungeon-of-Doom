//import java.util.*;


public class GameMap {

    public char[][] map;
 
    public GameMap() {
        map = new char[][] {
            { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
            { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
            { '#', '#', '.', '.', 'G', '.', '.', '.', '.', '#', '#' },
            { '#', '#', '.', '.', '.', '.', '.', '.', '.', '#', '#' },
            { '#', '#', '.', '.', '.', '.', '.', 'G', '.', '#', '#' },
            { '#', '#', '.', '.', '.', '.', '.', '.', '.', '#', '#' },
            { '#', '#', '.', '.', '.', '.', '.', '.', '.', '#', '#' },
            { '#', '#', '.', 'G', '.', '.', '.', '.', '.', '#', '#' },
            { '#', '#', '.', '.', '.', '.', '.', 'E', '.', '#', '#' },
            { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
            { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' }
        };
    }

    public int size(){
        int len = map.length;
        return len;
    }

    public char getCell(int x, int y) {
        return map[x][y];
    }

    public void setCell(int x, int y, char entity) {
        map[x][y] = entity;
    }

    public int goldCounter(){
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'G') {
                    count++;
                }
            }
        }
        return count;
    }

    public void print(Player player) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == player.getX() && j == player.getY()) {
                    System.out.print('P' + " ");
                } else {
                    System.out.print(map[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
