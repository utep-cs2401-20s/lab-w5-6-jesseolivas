public class SnakeGame {

    public boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;


    public SnakeGame(){
        game = new boolean[1][1];
    }

    public SnakeGame(boolean[][] g, int x, int y){
        for(int i = 0; i < g.length; i++){
            for(int j = 0; j < g[i].length; j++){
                game[i][j] = g[i][j];
            }
        }
        headPosition [0] = x;
        headPosition [1] = y;
    }

    public int[] findTailExhaustive(){
        resetCounter();
        int[] t = new int[3];
        int length = 0;
        // Start at the first cell
        // check if part of snake, if not, check neighbors, then check next cell
        //
        for(int i = 0; i < game.length; i++){
            for(int j = 0; j < game[i].length;j++){
                exhaustiveChecks ++;
                if(game[i][j]){
                    length++;
                    if(neighbors(i,j) == 1){
                        t[0] = i;
                        t[1] = j;
                    }
                }
            }

        }
        t[2] = length;
        return t;
    }

    public int neighbors(int row, int col){
        // Counter to add and return each cell's neighbors
        int count = 0;

        // These if statements check the corresponding cell for
        // any live cells i.e. "neighbors" and update the count
        // if boolean is accepted.
        if((row > 0) && (col > 0) && game[row-1][col-1] == true){
            count++;
        }
        if((row > 0) && game[row-1][col] == true){
            count++;
        }
        if((row > 0) && (col != game.length-1) && game[row-1][col+1] == true){
            count++;
        }
        if((col > 0) && game[row][col-1] == true){
            count++;
        }
        if((col != game.length-1) && game[row][col+1] == true){
            count++;
        }
        if((row != game.length-1) && (col > 0) && game[row+1][col-1] == true){
            count++;
        }
        if((row != game.length-1) && game[row+1][col] == true){
            count++;
        }
        if((row != game.length-1) && (col != game.length -1) && game[row+1][col+1] == true){
            count++;
        }
        return count;
    }

    public int[] findTailRecursive(){
        int[] t = new int[2];

        return t;
    }

    private int[] fintTailRecursive(int[] currentPosition, int[] previousPosition){
        int[] t = new int[2];

        return t;
    }

    private void resetCounter(){
        exhaustiveChecks = 0;
        recursiveChecks = 0;
    }

    private static int getExhaustiveChecks(){
        return exhaustiveChecks;
    }

    private static int getRecursiveChecks(){
        return recursiveChecks;
    }
}
