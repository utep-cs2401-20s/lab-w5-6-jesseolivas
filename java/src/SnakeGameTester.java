import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class SnakeGameTester {

    /*
        This test is used to check generally if the method works in its most basic form and use
        for the findTailExhaustive method, it tests that the correct array is returned meaning
        that it finds the tail and updates the snake's length correctly at the same time.

     */
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
        assertArrayEquals(exp, t.findTailExhaustive());
    }

    /*
        This test is used to check an edge case to see if the method is still working properly when
        the snake is placed in the top right corner attempting to push for an out of bounds exception
        for the findTailExhaustive method, it tests that the correct array is returned meaning
        that it finds the tail and updates the snake's length correctly at the same time.

     */
    @Test
    public void exhaustiveTest2(){
        boolean[][] game = {{false,false,true,true,true},
                            {false,false,false,false,false},
                            {false,false,false,false,false},
                            {false,false,false,false,false},
                            {false,false,false,false,false}};
        int x = 0;
        int y = 2;
        int[] exp = {0,4,3};
        SnakeGame t = new SnakeGame(game,0,2);
        assertArrayEquals(exp, t.findTailExhaustive());
    }

    /*
        This test is used to check an edge case to see if the method is still working properly when
        the snake's head is placed in the bottom left corner and taking up the entire row, again,
        attempting to push for an out of bounds exception for the findTailExhaustive method, it tests
        that the correct array is returned meaning that it finds the tail and updates the snake's length
        correctly at the same time.

     */
    @Test
    public void exhaustiveTest3(){
        boolean[][] game = {{false,false,false,false,false},
                            {false,false,false,false,false},
                            {false,false,false,false,false},
                            {false,false,false,false,false},
                            {true,true,true,true,true}};
        int x = 0;
        int y = 2;
        int[] exp = {4,4,5};
        SnakeGame t = new SnakeGame(game,4,0);
        assertArrayEquals(exp, t.findTailExhaustive());
    }

    /*
        This test is used to check an edge case to see if the method is still working properly when
        the snake's head is placed in the top right corner and taking up the entire column, again,
        attempting to push for an out of bounds exception for the findTailExhaustive method, it tests
        that the correct array is returned meaning that it finds the tail and updates the snake's length
        correctly at the same time.

     */
    @Test
    public void exhaustiveTest4(){
        boolean[][] game = {{false,false,false,false,true},
                            {false,false,false,false,true},
                            {false,false,false,false,true},
                            {false,false,false,false,true},
                            {false,false,false,false,true}};
        int x = 0;
        int y = 2;
        int[] exp = {4,4,5};
        SnakeGame t = new SnakeGame(game,0,4);
        assertArrayEquals(exp, t.findTailExhaustive());
    }

    /*
        This test is used to check an edge case to see if the method is still working properly when
        the snake is given a curve and isn't completely straight like the others have been, again,
        attempting to push for an out of bounds exception for the findTailExhaustive method, it tests
        that the correct array is returned meaning that it finds the tail and updates the snake's length
        correctly at the same time.

     */
    @Test
    public void exhaustiveTest5(){
        boolean[][] game = {{false,false,true,false,false},
                            {false,false,true,false,false},
                            {false,false,true,false,false},
                            {false,false,true,true,true},
                            {false,false,false,false,false}};
        int x = 0;
        int y = 2;
        int[] exp = {3,4,6};
        SnakeGame t = new SnakeGame(game,0,2);
        assertArrayEquals(exp, t.findTailExhaustive());
    }

    /*
        This test is used to check generally if the method works in its most basic form and use
        for the findTailRecursive method, it tests that the correct array is returned meaning
        that it finds the tail and updates the snake's length correctly at the same time.

     */
    @Test
    public void recursiveTest1(){
        boolean[][] game = {{false,false,true,false,false},
                            {false,false,true,false,false},
                            {false,false,true,false,false},
                            {false,false,false,false,false},
                            {false,false,false,false,false}};
        int x = 0;
        int y = 2;
        int[] exp = {2,2,3};
        SnakeGame t = new SnakeGame(game,0,2);
        assertArrayEquals(exp, t.findTailRecursive());
    }

    /*
        This test is used to check an edge case to see if the method is still working properly when
        the snake is placed in the top right corner attempting to push for an out of bounds exception
        for the findTailRecursive method, it tests that the correct array is returned meaning
        that it finds the tail and updates the snake's length correctly at the same time.

     */
    @Test
    public void recursiveTest2(){
        boolean[][] game = {{false,false,true,true,true},
                            {false,false,false,false,false},
                            {false,false,false,false,false},
                            {false,false,false,false,false},
                            {false,false,false,false,false}};
        int x = 0;
        int y = 2;
        int[] exp = {0,4,3};
        SnakeGame t = new SnakeGame(game,0,2);
        assertArrayEquals(exp, t.findTailRecursive());
    }

    /*
        This test is used to check an edge case to see if the method is still working properly when
        the snake's head is placed in the bottom left corner and taking up the entire row, again,
        attempting to push for an out of bounds exception for the findTailRecursive method, it tests
        that the correct array is returned meaning that it finds the tail and updates the snake's length
        correctly at the same time.

     */
    @Test
    public void recursiveTest3(){
        boolean[][] game = {{false,false,false,false,false},
                            {false,false,false,false,false},
                            {false,false,false,false,false},
                            {false,false,false,false,false},
                            {true,true,true,true,false}};
        int x = 0;
        int y = 2;
        int[] exp = {4,3,4};
        SnakeGame t = new SnakeGame(game,4,0);
        assertArrayEquals(exp, t.findTailRecursive());
    }

    /*
        This test is used to check an edge case to see if the method is still working properly when
        the snake's head is placed in the top right corner and taking up the entire column, again,
        attempting to push for an out of bounds exception for the findTailRecursive method, it tests
        that the correct array is returned meaning that it finds the tail and updates the snake's length
        correctly at the same time.

     */
    @Test
    public void recursiveTest4(){
        boolean[][] game = {{false,false,false,false,true},
                            {false,false,false,false,true},
                            {false,false,false,false,true},
                            {false,false,false,false,true},
                            {false,false,false,false,true}};
        int x = 0;
        int y = 2;
        int[] exp = {4,4,5};
        SnakeGame t = new SnakeGame(game,0,4);
        assertArrayEquals(exp, t.findTailRecursive());
    }

    /*
        This test is used to check an edge case to see if the method is still working properly when
        the snake is given a curve and isn't completely straight like the others have been, again,
        attempting to push for an out of bounds exception for the findTailRecursive method, it tests
        that the correct array is returned meaning that it finds the tail and updates the snake's length
        correctly at the same time.

     */
    @Test
    public void recursiveTest5(){
        boolean[][] game = {{false,false,true,false,false},
                            {false,false,true,false,false},
                            {false,false,true,false,false},
                            {false,false,true,true,true},
                            {false,false,false,false,false}};
        int x = 0;
        int y = 2;
        int[] exp = {3,4,6};
        SnakeGame t = new SnakeGame(game,0,2);
        assertArrayEquals(exp, t.findTailRecursive());
    }

}
