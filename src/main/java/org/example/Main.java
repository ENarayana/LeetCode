package org.example;

import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 1, 11, 7};
        int target = 10;
        int[] out = new int[3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        out[0] = i;
                        out[1] = j;
                        out[2] = k;
                        System.out.println("[" + out[0] + "," + out[1] + "," + out[2] + "]");
                        return;
                    }
                }
            }
        }
    }
}
