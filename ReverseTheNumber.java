import java.util.Scanner;
class ReverseTheNumber {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int tasteCases = sc.nextInt();
        while(tasteCases  --> 0){
            int num =sc.nextInt();
            int var ;
            int res =0;
            while(num!=0){
                var =num%10;
                res =res*10 +var;
                num =num/10;
            }
            System.out.println("reverse value is -" +res);
        }
        sc.close();
    }
}