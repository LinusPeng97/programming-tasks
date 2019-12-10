package main.java.pers.linus;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test_1(){
        Solution solution = new Solution();
        char[][] matrix = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        System.out.println(solution.isExist(matrix, word));
    }

    @Test
    public void test_2(){
        Solution solution = new Solution();
        char[][] matrix = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABFS";
        System.out.println(solution.isExist(matrix, word));
    }

    @Test
    public void test_3(){
        Solution solution = new Solution();
        char[][] matrix = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABFSAB";
        System.out.println(solution.isExist(matrix, word));
    }

    @Test
    public void test_4(){
        Solution solution = new Solution();
        char[][] matrix = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABFS";
        System.out.println(solution.isExist(matrix, word));
    }

    @Test
    public void test_5(){
        Solution solution = new Solution();
        char[][] matrix = {{'C','A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}};
        String word = "AAB";
        System.out.println(solution.isExist(matrix, word));
    }

    @Test
    public void test_6(){
        Solution solution = new Solution();
        char[][] matrix = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        System.out.println(solution.isExist(matrix, word));
    }

    @Test
    public void test_7(){
        Solution solution = new Solution();
        char[][] matrix = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "A";
        System.out.println(solution.isExist(matrix, word));
    }

    @Test
    public void test_8(){
        Solution solution = new Solution();
        char[][] matrix = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "";
        System.out.println(solution.isExist(matrix, word));
    }

    @Test
    public void test_9(){
        Solution solution = new Solution();
        char[][] matrix = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCBA";
        System.out.println(solution.isExist(matrix, word));
    }

    @Test
    public void test_10(){
        Solution solution = new Solution();
        char[][] matrix = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCESCFSADEE";
        System.out.println(solution.isExist(matrix, word));
    }
}
