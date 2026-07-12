import java.util.*;

class Solution {
    int[] nums;
    Random random = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        int[] arr = nums.clone();

        for (int i = 0; i < arr.length; i++) {
            int j = random.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }
}