public class buyAndSell {
    
    public static void main(String[] args){

        int[] arr = {7,1,5,3,6,4};
        // int[] arr = {7,6,4,3,1};
       

        int min_price = arr[0];
        int maxprof = 0;

        for(int i=1;i<arr.length;i++){
            maxprof = Math.max(maxprof,arr[i]-min_price);
            min_price = Math.min(arr[i],min_price);
        }

        System.out.println(maxprof);


    }

}
