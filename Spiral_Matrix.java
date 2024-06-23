class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      ArrayList<Integer> al=new ArrayList<>();
        if (matrix == null || matrix.length == 0) return al;
        int ul = 0; 
        int ll = matrix.length - 1; 
        int l = 0; 
        int r = matrix[0].length - 1; 
        while(l<=r && ul<=ll){
            for(int i=l;i<=r;i++){
                al.add(matrix[ul][i]);
            }
            ul++;
            for(int i=ul;i<=ll;i++){
                al.add(matrix[i][r]);
            }
            r--;
            if(ul<=ll){
                for(int i=r;i>=l;i--){
                    al.add(matrix[ll][i]);
                }
                ll--;
            } 
            if(l<=r){  
                for(int i=ll;i>=ul;i--){
                    al.add(matrix[i][l]);
                }
                l++;
            }    
        }
    return al;  
    }
}
