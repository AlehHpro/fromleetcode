public class Main2 {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};

        System.out.println(bestProfit(prices));
    }

    public static int bestProfit(int[] arr){
        int maxProfit = 0;

        for(int i = 0; i < arr.length; i ++){
            for(int j = i + 1; j < arr.length; j++){
                if(maxProfit < arr[j] - arr[i]){
                    maxProfit = arr[j] - arr[i];
                }
            }
        }

        return maxProfit;
    }
}
