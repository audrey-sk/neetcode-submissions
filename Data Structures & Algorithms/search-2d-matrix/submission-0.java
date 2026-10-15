class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int l = 0;
        int r = (rows * cols) - 1; // Total number of elements - 1
        
        while (l <= r) {
            int mid = (l + r) / 2;
            // 1D to 2D mapping:
            int midValue = matrix[mid / cols][mid % cols]; 
            
            if (target > midValue) {
                l = mid + 1;
            } else if (target < midValue) {
                r = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
