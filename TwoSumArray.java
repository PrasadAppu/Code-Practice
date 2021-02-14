package Day1;

public class TwoSumArray {
    public static void main(String args[]){
        int [] numbers= {2,3,4};
        int target =6;
        int [] result =twoSum(numbers, target);
        for(int i =0;i<result.length;i++){
            System.err.println(result[i]);
        }
    }
    public  static int[] twoSum(int[] numbers, int target){

        int low =0 ;int high =numbers.length-1;

        while(low<high){
            if(numbers[low] + numbers[high]==target){
                return new int[]{low+1,high+1};
            }
            else if (numbers[low] + numbers[high]<target){
                low++;

            }
            else {
                high++;
            }
            
    }
    return new int[]{0,0};
        }
    
}
