package Day1;

public class RichestWealth {
    public static void main(String args[]){
            int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));

        }
        public static int maximumWealth(int[][] accounts) {
            int result =0,sum=0;
            for(int i =0 ; i<accounts.length;i++){
                int p = accounts[i].length;

                for(int j =0;j<p;j++){
                    sum =sum + accounts[i][j];
                }
                if(sum > result){
                    result =sum;
                }
                    sum =0;
            }

            return result;
        }
        
}
