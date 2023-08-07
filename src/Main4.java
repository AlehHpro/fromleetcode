public class Main4 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,6,0,5};
        TreeNode root = new Main4().constructMaximumBinaryTree(arr);


    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int leftInd = 0;
        int rightInd = nums.length;
        int maxIndex;

        maxIndex = findMax(nums, leftInd, rightInd);
        TreeNode root = new TreeNode(nums[maxIndex]);
        construct(nums, leftInd, maxIndex, root);
        construct(nums, maxIndex + 1, rightInd, root);

        return root;
    }

    public static void construct(int[] arr, int leftInd, int rightInd, TreeNode root){
        if(leftInd >= rightInd){
            return;
        }
        int maxIndex = findMax(arr, leftInd, rightInd);
        addNode(arr[maxIndex], root);
        construct(arr, leftInd, maxIndex, root);
        construct(arr, maxIndex + 1, rightInd, root);
    }

    public static void addNode(int value, TreeNode root){
        if(root == null){
            root = new TreeNode(value);
            return;
        }
        if(value < root.val){
            if(root.left == null){
                TreeNode node = new TreeNode(value);
                root.left = node;
            } else {
                addNode(value, root.left);
            }
        } else {
            if(root.right == null){
                TreeNode node = new TreeNode(value);
                root.right = node;
            } else {
                addNode(value, root.right);
            }
        }
    }

    public static int findMax(int[] arr, int leftInd, int rightIndex){
        int max = leftInd;
        for(int i = leftInd; i < rightIndex; i++){
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) {
           this.val = val;
       }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
}
