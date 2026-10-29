import java.util.*;
public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);int a=0,b=0;
        for(int i=0;i<3;i++){int x=sc.nextInt(),y=sc.nextInt();if(x>y)a++;else if(x<y)b++;}
        System.out.println(a+" "+b);
    }
}
