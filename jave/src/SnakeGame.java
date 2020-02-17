public class SnakeGame {

    public boolean[][] game;
    private int[] headPosition = new int[2];
    private static int exhaustiveChecks = 0;
    private static int recursiveChecks;


    public SnakeGame(){
        game = new boolean[1][1];
    }

    public SnakeGame(boolean[][] g, int[] h){
        for(int i = 0; i < g.length; i++){
            for(int j = 0; j < g.length; j++){
                game[i][j] = g[i][j];
            }
        }
        for(int i = 0; i < h.length; i++){
            headPosition[i] = h[i];
        }
    }

    public int[] findTailExhaustive(){
        int[] t = new int[2];

        return t;
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
