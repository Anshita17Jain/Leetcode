class Solution {
    public int countNegatives(int[][] grid) {
        int left = grid.length; 
        int right = grid[0].length;
        int row = 0;
        int col = right - 1; 
        int count = 0;
        while(row < left && col >= 0){
            if(grid[row][col] >= 0){
                row++;
            }else{
                count += left - row;
                col--;
            }
        }
            return count;
    }
}