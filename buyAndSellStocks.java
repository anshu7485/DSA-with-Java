import java.util.*;

public class buyAndSellStocks {
// Ye function maximum profit nikalta hai agar aap ek bar stock khareed aur bech sakte hain
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE; // Sabse minimum price ab tak ki
        int maxProfit = 0; // Ab tak ka maximum profit

        // Har din ki price dekhte hain
        for(int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // Agar current price pechle buyPrice se zyada hai
                int profit = prices[i] - buyPrice; // Abhi tak ka profit nikal lo
                maxProfit = Math.max(maxProfit, profit); // Agar ye profit zyada hai toh update karo
            } else {
                buyPrice = prices[i]; // Nahi toh current price sabse kam price maan lo (buy karne layak)
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4}; // Har din ki prices
        System.out.println(buyAndSellStocks(prices)); // Answer print karo
    }
}

    
