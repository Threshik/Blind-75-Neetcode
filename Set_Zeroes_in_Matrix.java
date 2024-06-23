class Solution {
    public void setZeroes(int[][] matrix) {
      int n = matrix.length; //row
      int m = matrix[0].length; //col

      int[] col = new int[m]; //row array
      int[] row = new int[n]; //col array

      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
            if(matrix[i][j]==0)
            {
                row[i]=1;
                col[j]=1;
            }
        }
      }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
            if(row[i]==1||col[j]==1)
            {
                matrix[i][j]=0;
            }
        }
      }
        
    }
}
