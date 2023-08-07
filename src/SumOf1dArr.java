public class SumOf1dArr {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};

    }

    public static int[] findSum(int[] nums){
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            if(i == 0){
               result[0] = nums[i];
            } else {
                result[i] = nums[i] + result[i-1];
            }
        }

        return result;
    }

}
