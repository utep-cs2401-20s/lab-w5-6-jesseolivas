import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SnakeGameTester {

    // Return the array's int not the address for the tests
    @Test
    public void exhaustiveTest1(){
        boolean[][] game = {{false,false,true,false,false},
                            {false,false,true,false,false},
                            {false,false,true,false,false},
                            {false,false,false,false,false},
                            {false,false,false,false,false}};
        int x = 0;
        int y = 2;
        int[] exp = {2,2,3};

        SnakeGame t = new SnakeGame(game,0,2);
        t.findTailExhaustive();
        assertEquals(exp, t.findTailExhaustive());

    }
}
