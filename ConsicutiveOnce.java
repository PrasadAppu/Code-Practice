package Day1;

public class ConsicutiveOnce {

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int value= 0;
        int max  = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                ++value;
                if(value>max){
                    max = value;
                }
            }else {
                value = 0;
            } 
        }
      
        return max;
      
      }
}
