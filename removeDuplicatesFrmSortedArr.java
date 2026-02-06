public class removeDuplicatesFrmSortedArr {

    public static int duplicates(int[] arr){

        int i = 1;

        for(int j=1; j<arr.length;j++){

            if( arr[j] == arr[j-1]){
                arr[i] = arr[j];
                i++;
            }
        }

        return i;

    }
    
    public static void main(String[] args) {
        
        int[] arr ={1,1,2,2,3};

        System.out.println(duplicates(arr));
    }
}
