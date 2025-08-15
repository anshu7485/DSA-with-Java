import java.util.*;

public class TrappedWater {

    public static int trappedRainwater(int height[]) {
        int n = height.length;

        // Step 1: Calculate the left max boundary for each index
        int leftMax[] = new int[n];
        leftMax[0] = height[0]; // Pehle element ka left max wahi hoga
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Step 2: Calculate the right max boundary for each index
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1]; // Aakhri element ka right max wahi hoga
        for(int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Step 3: Calculate trapped water for every element
        int trappedWater = 0;
        for(int i = 0; i < n; i++) {
            // Us point pe jitna paani ruk sakta hai
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {04,2,0,6,3,2,5};
    trappedRainwater(height);
        System.out.println("Total trapped rainwater: " + trappedRainwater(height));
    }
}