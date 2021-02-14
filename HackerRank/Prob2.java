package Day1.HackerRank;
import java.util.Scanner;

class Prob2 { 
    public static void main(String  [] args) {
        Scanner sc = new Scanner(System.in);
        int x1  =sc.nextInt();
        int v1  =sc.nextInt();
        int x2  =sc.nextInt();
        int v2  =sc.nextInt();

        System.out.println(PrintResult(x1,v1,x2,v2));

    }

    private static String PrintResult(int x1, int v1, int x2, int v2) {
        String result = "YES";
        if(x1>x2  && v1>v2){
            result ="NO";
         }
         else if(x2>x1  && v2>v1){
            result ="NO";
         }
         else if(x1<x2 && v1>v2){
             result  =(x2-x1)%(v1-v2)==0? "YES" : "NO";
         }
         else if(x2<x1 && v2>v1){
            result  =(x1-x2)%(v2-v1)==0 ? "YES" : "NO";
        }
        return result;
    }
}