package Day1;
import java.util.Scanner;
public class ArrayRotation3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-->0){
             int n= sc.nextInt();
             int d =sc.nextInt();
             int[] arr =new int[n];
              for(int i  =0 ;i <n;i++){
                  arr [(n-d+i)%n] =sc.nextInt();
              } 

              for(int i  =0 ;i <n;i++){
                System.out.print(arr[i]+" ");
            }
         }
    }
    public static void printArray(int[] arr, int n){
        for(int i  =0 ;i <n;i++){
               System.out.print(arr[i]+" ");
           } 
   }
} 