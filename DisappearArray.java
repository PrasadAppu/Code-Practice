package Day1;

import java.util.ArrayList;
import java.util.List;

public class DisappearArray {
    public static void main(String[] args){
        int [] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result =findDisappearedNumbers(nums);

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> result =new ArrayList<>();
            for(int i =0; i<nums.length;i++){
                int value =Math.abs(nums[i])-1;
                if(nums[value]>0){
                nums[value] =-nums[value];
                }
            }   
            for(int j=0;j<nums.length;j++){
                if(nums[j]>0){
                    result.add(j+1);
                }
            }
            return result;
        }
}
