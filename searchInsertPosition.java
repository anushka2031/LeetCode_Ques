public class searchInsertPosition {
    
    static int position(int[] nums , int target){

        // int i;
        // for(i=0;i<nums.length;i++){
        //     if(nums[i] == target){
        //         break;
        //     }else{
        //         if(nums[i] < target){
        //             nums[i+1] = target;
        //         }
        //     }
            
        // }

        // return i;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        // If target not found, low is the insert position
        return low;
    }

    public static void main(String[] args) {
        
        

        int[] nums = {1,3,5,6};
        int key1 = 5;
        int key = 2;

        System.out.println(position(nums, key1));
        System.out.println(position(nums, key));

    }
}
