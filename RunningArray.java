package Day1;
//import java.util.*;

public class RunningArray {
   // Scanner sc = new Scanner(System.in);
    //int n =sc.nextInt();
    public static void main(String args[]){
    int []arr ={2,1,3,5,6};

    for(int i =1; i<arr.length;i++){
        arr[i]=arr[i]+ arr[i-1];
    }

    for(int j =0; j<arr.length;j++){
        System.out.println(arr[j]);
    }
}
}
