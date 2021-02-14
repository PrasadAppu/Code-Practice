package Day1;
import java.util.Scanner;
public class ArrayRotation2 {
    public static void main(String [] args){
 Scanner sc =new Scanner(System.in);
 int t =sc.nextInt();
 while(t-->0){
 int n= sc.nextInt();
 int d =sc.nextInt();
 int[] arr=new int[n];
 for(int i=0;i<n;i++){
     arr[i]= sc.nextInt();
    }
  
    for(int m =0 ;m<d;m++){
       rotateOnebyOne(n,m,arr);
       }
     printArray(n ,arr);
       sc.close();
     }
 }

     private static void printArray(int n, int[] arr) {
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
             }
     }

     private static void rotateOnebyOne(int n, int m, int[] arr) {
        int temp =arr[0];
        for(int j =0; j<n; j++){
            if(j+1<n){
            arr[j] =arr[j+1];
             }
            else{
                arr[j] =temp;
            }
        }
 
 }
}