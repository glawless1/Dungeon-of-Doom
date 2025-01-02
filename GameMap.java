//import java.util.*;


public class GameMap {

    public char[][] map;
    public int goldRequired;
 
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
        goldRequired = goldCounter();
    }

    public int size(){
        int len = map.length;
        return len;
    }

    public char getCell(int x, int y) {
        return map[y][x];
    }

    public void setCell(int x, int y, char entity) {
        map[y][x] = entity;
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

    public void look(Player player) {
        for (int i = (player.getY() - 2); i < (player.getY() + 3); i++) {
            for (int j = (player.getX() - 2); j < (player.getX() + 3); j++) {
                if (i == player.getY() && j == player.getX()) {
                    System.out.print('P' + " ");
                } else {
                    System.out.print(map[j][i] + " ");
                }
            }
            System.out.println();
        }
    }

    public void print(Player player) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (i == player.getY() && j == player.getX()) {
                    System.out.print('P' + " ");
                } else {
                    System.out.print(map[j][i] + " ");
                }
            }
            System.out.println();
        }
    }
}
