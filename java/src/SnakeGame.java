public class SnakeGame {

    public boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;


    public SnakeGame(){
        game = new boolean[1][1];
    }

    public SnakeGame(boolean[][] g, int x, int y){
        int size = g.length;
        headPosition = new int[2];
        game = new boolean[size][size];
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
                    if(neighbors(i,j) == 1 && i != headPosition[0] || j != headPosition[1]){
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

        if((row > 0) && game[row-1][col]){
            count++;
        }

        if((col > 0) && game[row][col-1]){
            count++;
        }
        if((col != game.length-1) && game[row][col+1]){
            count++;
        }

        if((row != game.length-1) && game[row+1][col]){
            count++;
        }
        return count;
    }

    public int[] findTailRecursive(){
        resetCounter();
        int[] t = findTailRecursive(headPosition,headPosition);
        return new int[]{t[0],t[1],getLength()};
    }

    private int[] findTailRecursive(int[] currentPosition, int[] previousPosition){
        int[] nextPosition = new int[2];
        nextPosition[0] = currentPosition[0];
        nextPosition[1] = currentPosition[1];
        // Base case
        if((nextPosition[0] != headPosition[0] && nextPosition[1] == headPosition[1]) || (nextPosition[0] == headPosition[0] && nextPosition[1] != headPosition[1]) || (nextPosition[0] != headPosition[0] && nextPosition[1] != headPosition[1]) &&neighbors(nextPosition[0],nextPosition[1]) == 1){
            if(neighbors(nextPosition[0],nextPosition[1]) == 1) {
                System.out.println("testb");
                recursiveChecks++;
                return currentPosition;
            }
        }
        // checks one down
        if(currentPosition[0]+1 < game.length && currentPosition[0] + 1 != previousPosition[0] && game[currentPosition[0]+1][currentPosition[1]]){
            nextPosition [0] = currentPosition[0] + 1;
            nextPosition [1] = currentPosition[1];
            recursiveChecks++;
            System.out.println("test1");
            return findTailRecursive(nextPosition, currentPosition);
        }
        // checks one up
        if(currentPosition[0]-1 >= 0 && currentPosition[0] - 1 != previousPosition[0] && game[currentPosition[0]-1][currentPosition[1]]){
            nextPosition [0] = currentPosition[0] - 1;
            nextPosition [1] = currentPosition[1];
            recursiveChecks++;
            System.out.println("test2");
            return findTailRecursive(nextPosition, currentPosition);
        }
        // checks one to the right
        if(currentPosition[1]+1 < game.length && currentPosition[1] + 1 != previousPosition[1] && game[currentPosition[0]][currentPosition[1]+1]){
            nextPosition [0] = currentPosition[0];
            nextPosition [1] = currentPosition[1] + 1;
            recursiveChecks++;
            System.out.println("test3");
            return findTailRecursive(nextPosition, currentPosition);
        }
        // checks one to the left
        if(currentPosition[1]-1 >= 0 && currentPosition[1] - 1 != previousPosition[1] && game[currentPosition[0]][currentPosition[1]-1]){
            nextPosition [0] = currentPosition[0];
            nextPosition [1] = currentPosition[1] - 1;
            recursiveChecks++;
            System.out.println("test4");
            return findTailRecursive(nextPosition, currentPosition);
        }

        return new int[2];
    }

    private int getLength(){
        int l = 0;
        for(int i = 0; i < game.length; i++){
            for(int j = 0; j < game[i].length; j++){
                if(game[i][j]){
                    l++;
                }
            }
        }
        return l;
    }
    private void resetCounter(){
        exhaustiveChecks = 0;
        recursiveChecks = 0;
    }

    public static int getExhaustiveChecks(){
        return exhaustiveChecks;
    }

    public static int getRecursiveChecks(){
        return recursiveChecks;
    }
    public void printBoard(){

    }
}
