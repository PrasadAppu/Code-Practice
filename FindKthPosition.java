package Day1;

public class FindKthPosition {

    public static void main(String[] args){
        int[] arr = {1,2,4};
        int k=2;
        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int missing =0;
        int expected =1;
        for(int i =0 ;i<arr.length;){
            if(arr[i]==expected){
                expected++;
                i++;

            }
            else{
                missing++;
                if(missing == k){
                    break;
                }
                expected++;
            }
        }
        if(missing<k){
            expected+=k-missing-1;
        }
        return expected;

        
    }
}
