public class DoubleArrMax {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,5},{7,3},{3,5}};

    }

    public int maximumWealth(int[][] accounts) {
        int maxValue = 0;
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if (sum > maxValue){
                maxValue = sum;
            }
        }
        return maxValue;
    }
}
