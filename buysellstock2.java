import java.util.*;
public class buysellstock2 {
    public static void main(String[] args){
        int[] prices = new int[]{7,1,5,3,6,4};
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit += (prices[i] - prices[i-1]);
        }
    }
    System.out.println("Maximum Profit: "+profit);
}
}