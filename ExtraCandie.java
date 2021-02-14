package Day1;

import java.util.ArrayList;
import java.util.List;

public class ExtraCandie {

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies =1;
        kidsWithCandies(candies,extraCandies).forEach(System.out::println);;

        
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result =new ArrayList<Boolean>();
        int max=candies[0];
        for(int i = 1;i <candies.length;i++){
            if(candies[i] >max){
                max=candies[i];
            }
        }

        for(int j =0;j<candies.length;j++){
            if(candies[j]+extraCandies<max){
                result.add(false);
            }
            else{
                result.add(true);
            }
        }
        return result;
    }
        
    }
    
