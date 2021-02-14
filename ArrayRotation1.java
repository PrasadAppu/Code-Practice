package Day1;
import java.util.Scanner;
class ArayRotation1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ;i<n; i++){
            arr[i]= sc.nextInt();
        }
        int d =sc.nextInt();
        int[] temparr = new int[d];
        for(int i =0 ;i<d;i++){
            temparr[i] =arr[i];
        }
        for(int i =0 ;i<n;i++){
            if(i+d<n){
            arr [i] =arr[i+d];
            }
            else{
                arr[i] =temparr[i+d-n];
            }
        } 
        for(int i =0 ;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}