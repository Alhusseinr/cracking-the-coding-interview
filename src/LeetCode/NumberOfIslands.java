package LeetCode;

public class NumberOfIslands {

    public static void main(String[] args){

    }

    public static void numIslands(char[][] grid){
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                convert(grid, i, j);
                count++;
            }
        }
    }

    private static void convert(char[][] grid,int i, int j){
        if(i < 0 || j < 0 || i >= grid.length  || j >= grid[i].length || grid[i][j] == '0'){
            return;
        }
        
        grid[i][j] = '0';
        convert(grid, i + 1, j );
        convert(grid, i - 1, j);
        convert(grid, i, j + 1);
        convert(grid, i, j - 1);
    }
}
