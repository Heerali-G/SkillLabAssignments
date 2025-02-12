//1.Dynamic Programming: Minimum Coin Change Problem.
import java.util.Arrays;
public class CoinChange{
    public static int minCoins(int[] coins,int amount){
        int[] minNoCoin=new int[amount+1];
        Arrays.fill(minNoCoin, Integer.MAX_VALUE);
        minNoCoin[0]=0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    minNoCoin[i] = Math.min(minNoCoin[i], minNoCoin[i - coin] + 1);
                }
            }
        }
        if (minNoCoin[amount] == amount + 1) {
            return -1; 
        }
        else {
            return minNoCoin[amount]; 
        }
    }
    public static void main(String[] args){
        int[] coins={1, 2,5 };
        int amount=11;
        int result = minCoins(coins, amount);
        System.out.println("Minimum coins required: "+result);
    }
}
