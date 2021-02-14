package Day1.DAY2;
import java.util.Scanner;

public class Square {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases -- >0){
            int n= sc.nextInt();
            int start = 0;
           int end =n/2;
           int ans = 0;
          while(start <=end){
            if(n==0 ||n ==1){
              ans =n;
            }
           int mid = (start + end)/2;
            if(mid*mid <n){
              end =end/2;
            }
          }

        }
        sc.close();
    }
}
