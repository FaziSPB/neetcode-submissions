class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int startm = 0;
        int endm = matrix.length-1;
        int targetm=-1;
        while(startm<=endm) {
            int midm=startm+(endm-startm)/2; 
            int lastn=matrix[midm].length-1;
            if (target >= matrix[midm][0] && target <= matrix[midm][lastn]) {
                targetm = midm;
                break;
            } 
            else if (target < matrix[midm][0]) endm=midm-1; 
            else startm=midm+1;
        }
        if (targetm == -1) return false;
        int startn = 0;
        int endn = matrix[targetm].length - 1;
        while (startn <= endn) {
            int midn = startn + (endn - startn) / 2;
            if (matrix[targetm][midn] == target) return true; 
            else if (matrix[targetm][midn] < target) startn = midn + 1;
            else endn = midn - 1;
            
        }
        return false;
    }
}
