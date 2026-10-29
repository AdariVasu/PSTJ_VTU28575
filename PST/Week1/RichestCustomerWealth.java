class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int best=0;
        for (int[] row:accounts) { int sum=0; for(int x:row) sum+=x; best=Math.max(best,sum); }
        return best;
    }
}
