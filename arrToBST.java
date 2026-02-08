// import java.util.Arrays;

// import javax.swing.tree.TreeNode;

// public class arrToBST {

//     public TreeNode ToBST(int[] nums){

//         return arrDivider(nums, 0, nums.length-1);

//     }

    // private TreeNode arrDivider(int[] nums, int left, int right){

    //     if(left > right)
    //         return null;

    //     int mid = (left + right)/ 2;

    //     TreeNode root = new TreeNode(nums[mid]);

    //     root.left = arrDivider(nums, left, mid-1);
    //     root.right = arrDivider(nums, mid+1, right);

    //     return root;
    // }

     
//     public static void main(String[] args) {
         
//         int[] nums = {-10,-3,0,5,9};

//         // System.out.println(Arrays.toString(ToBST(nums)));

//     }
// }
