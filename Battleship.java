class Battleship {
    public static void main(String[] args) {
        String[][] grid = createGrid();
        printGrid(grid);
    }

    private static String[][] createGrid() {
        String[][] grid = new String[11][11];
        char currentLet = 'A';
        grid[0][0] = " ";
        for(int i=1; i<11; i++) {
            grid[0][i] = Character.toString(currentLet++);
        }
        for(int i=1; i<11; i++) {
            grid[i][0] = Integer.toString(i);
        }
        for(int i=1; i<11; i++){
            for (int j=1; j<11; j++) {
                grid[i][j] = " ";
            }
        }
        return grid;
    }
    private static void printGrid(String[][] grid) {
        for (String[] row : grid) {
            for (String spot : row) {
                print(spot);
            }
            println("");
        }
    }
    private static void println(String s) {
        System.out.println(s);
    }
    private static void print(String s) {
        System.out.print(s);
    }
}