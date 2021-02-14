package Day1;

public class BusStop {
    public static void main(String[] args) {
        int [] distance ={3,6,7,2,9,10,7,16,11};
        int start  =6;
        int destination  =2;
        System.out.println(distanceBetweenBusStops(distance,start,destination));

    }
    public static  int distanceBetweenBusStops(int[] distance, int start, int destination) {
    int val =start;
    int clockwise =0;
            while(val!=destination){  
                clockwise=clockwise+distance[val];
                if(val ==distance.length-1){
                    val=0;
                }
                else{
                    val++;
                }
        }
        //Anticlockwise

        int Anticlockwise =0;
        int len =start;
        if(len ==0){
            len =distance.length-1;
        }
        else{
            len--;
        }
        while(len!=destination){
            Anticlockwise=Anticlockwise+distance[len];
            if(len==0){
                len=distance.length-1;
            }
            else{
                len--;
            }

    }
    Anticlockwise =Anticlockwise+ distance[len];
    return Math.min(clockwise, Anticlockwise);

        
    }
}
