package Day1;


import java.util.HashSet;
import java.util.Set;

public class DuplicateContain {

    public static void main(String[] args) {

        int[] nums ={1,2,3,4};
        System.out.println(containsDuplicate(nums));
        
    }
    public static boolean containsDuplicate(int[] nums) {
        
        boolean result =false;
        Set<Integer> ap =new HashSet<Integer>();

    for(int i = 0;i<nums.length;i++){
        ap.add(nums[i]);
    }

    if(ap.size()!=nums.length){
        result =true;
    }
       
        return result; 
    }
    
}
