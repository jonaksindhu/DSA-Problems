package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DSAproblems1Test{
@Test
public void testMatrixMultiplication() {
    int[][] A = {{1, 2}, {3, 4}};
    int[][] B = {{2, 0}, {1, 2}};
    int[][] expected = {{4, 4}, {10, 8}};
    assertArrayEquals(expected, DSAproblems1.multiplyMatrices(A, B));
}

@Test
public void testRotateArray() {
    int[] input = {1, 2, 3, 4, 5};
    int[] expected = {3, 4, 5, 1, 2};
    assertArrayEquals(expected, DSAproblems1.rotateArray(input, 2));
}

@Test
public void testReverseNumber() {
    assertEquals(54321, DSAproblems1.reverseNumber(12345));
} 
}
    

