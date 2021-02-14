package Day1;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle {
    public static void main(String args[]){
        int numRows =5;
      System.out.println(generate(numRows));
    }
    public static List<List<Integer>> generate(int numRows){
     
        if(numRows ==0){
            return new ArrayList<>();
        }
        List<Integer> list = null;
        List<Integer> pre_list  = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        
        for(int i =0; i<numRows;i++){
            list = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list.add(1);
                }
                else{
                    list.add(pre_list.get(j-1)+pre_list.get(j));
                }
            }
                pre_list =list;
                lists.add(list);
            }
        return lists;
    }
}
