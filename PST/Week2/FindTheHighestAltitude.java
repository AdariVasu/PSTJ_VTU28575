class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int h=0,best=0; for(int g:gain){h+=g;best=Math.max(best,h);} return best;
    }
}
