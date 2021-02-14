package Day1;

public class ShuffleArray {
    public static void main(String args[]){
        int [] nums ={2,5,1,3,4,7};
        int n =3;
            int[] result = shuffle(nums,n);
            for(int j =0;j<nums.length;j++){
                System.out.println(result[j]);
            }
    }
    public static  int[] shuffle(int[] nums, int n) {
        int i=0;
        int[] result =new int[nums.length];
       for(int j =0;j<(nums.length); j=j+2){
        result [j]=nums[i];
        result[j+1]=nums[n];
        i++; n++;
       }
           
        return result;
    }
    
}
