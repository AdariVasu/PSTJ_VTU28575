class DetermineIfStringsAreHalvesAlike {
    public boolean halvesAreAlike(String s) {
        int n=s.length(), count=0;
        for(int i=0;i<n/2;i++){if(isVowel(s.charAt(i)))count++;if(isVowel(s.charAt(i+n/2)))count--;}
        return count==0;
    }
    private boolean isVowel(char c){return "aeiouAEIOU".indexOf(c)>=0;}
}
