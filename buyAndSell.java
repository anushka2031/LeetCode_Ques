public class buyAndSell {
    
    public static void main(String[] args){

        int[] arr = {7,1,5,3,6,4};
        // int[] arr = {7,6,4,3,1};
        int l = 0;
        int r = arr.length-1;
        int maxProfit = 0;

        while (l<r) {
            
            if(arr[l] < arr[r]){
                maxProfit = arr[r] - arr[l];
            }

            l++;
            r--;
        }

        System.out.println(maxProfit);


    }

}
