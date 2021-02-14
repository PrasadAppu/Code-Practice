package Day1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
    
    public static void main(String[] args) {
        
        int [] nums ={1,3,2,2,3,1};
        System.out.println(findShortestSubArray(nums));
    }
    public static  int findShortestSubArray(int[] nums) {
        int elementdegree =0;

    Map<Integer,Integer> map =new HashMap<Integer, Integer>();
    for(int i =0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i], map.get(nums[i])+1);
        }
        else{
                map.put(nums[i], 1);
        }
    }

    //take degree
   
    int degree =Collections.max(map.values());
    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue() ==degree){
            elementdegree =entry.getKey();
        }
    }
    int len=nums.length,start=0,end=0;
    for(int k =0 ;k<len;k++){
        if(nums[k]==elementdegree){
        start=k;
        break;
        }
    }
    for(int k =len-1 ;k>=0;k--){
        if(nums[k]==elementdegree){
        end=k+1;
        break;
        }
    }

    return end-start;
        }
       
}
