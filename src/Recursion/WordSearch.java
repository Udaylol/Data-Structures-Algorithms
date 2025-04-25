package Recursion;

public class WordSearch {
    private static boolean helper(char[][] grid, String word, int i, int j, int idx) {
        if (idx >= word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != word.charAt(idx)) {
            return false;
        }
        char c = grid[i][j];
        boolean canFindNext = false;
        grid[i][j] = '.';

        canFindNext = canFindNext || helper(grid, word, i - 1, j, idx + 1);
        canFindNext = canFindNext || helper(grid, word, i + 1, j, idx + 1);
        canFindNext = canFindNext || helper(grid, word, i, j - 1, idx + 1);
        canFindNext = canFindNext || helper(grid, word, i, j + 1, idx + 1);

        if (canFindNext) return true;
        grid[i][j] = c;
        return false;
    }

    private static boolean findWord(char[][] grid, String word) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (helper(grid, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'S', 'U', 'C', 'E'},
                {'S', 'C', 'T', 'S'},
                {'A', 'H', 'E', 'L'}
        };
        String word = "SUCHET";
        boolean exists = findWord(grid, word);
        if (exists) {
            System.out.println("Word " + word + " exists");
        } else {
            System.out.println("Word " + word + " does not exist");
        }
    }
}