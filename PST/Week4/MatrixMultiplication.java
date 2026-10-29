class MatrixMultiplication {
    public int[][] multiply(int[][] a,int[][] b) {
        int m=a.length,n=a[0].length,p=b[0].length;int[][] c=new int[m][p];
        for(int i=0;i<m;i++)for(int k=0;k<n;k++)for(int j=0;j<p;j++)c[i][j]+=a[i][k]*b[k][j];
        return c;
    }
}
