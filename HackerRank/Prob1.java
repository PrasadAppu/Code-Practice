package Day1.HackerRank;
import java.util.Scanner;
public class Prob1 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int sum =0;
        if(n>1){
            int temp =0;
        for(int i =0;i<n;i++){
            int a =sc.nextInt();
           sum= sum+(temp*a);
           temp =a;
        }
    }
    else
    sum =sc.nextInt();
        System.out.println(sum);
    }
    
}