class StringToIntegerAtoi {
    public int myAtoi(String s) {
        int i=0,n=s.length();while(i<n&&s.charAt(i)==' ')i++;
        int sign=1;if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')){if(s.charAt(i++)=='-')sign=-1;}
        long val=0;while(i<n&&Character.isDigit(s.charAt(i))){val=val*10+(s.charAt(i++)-'0');long signed=val*sign;
            if(signed>Integer.MAX_VALUE)return Integer.MAX_VALUE;if(signed<Integer.MIN_VALUE)return Integer.MIN_VALUE;}
        return (int)(val*sign);
    }
}
