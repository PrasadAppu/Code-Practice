package Day1.DAY2;
import java.util.Scanner;

public class Reaarange {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr =new int[n];
            int[] resultarray =new int[n];
            for(int i =0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            for(int i =0;i<n;i++){
                for(int j=0;i<n;j++){
                    if(arr[j]==i){
                        resultarray[i]=arr[j];
                        break;
                    }

                    }
                }
                for(int k =0;k<n;k++){
                    if(resultarray[k] !=k){
                        resultarray[k] = -1;
                    }
                }
                for(int i =0;i<n;i++){
                   System.out.println(resultarray[i]);
                }

            }
        }
    }
