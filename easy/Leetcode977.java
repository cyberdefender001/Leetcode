class Leetcode977 {
    public int[] sortedSquares(int[] nums) {
        int minValue = 0;
        int minIndex = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            minValue = nums[i];
            minIndex = i;
            
            for (int j = i; j < nums.length; j++) {
                if (minValue > nums[j]) {
                    minValue = nums[j];
                    minIndex = j;
                }
            }
            if (minValue < nums[i]) {
                temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
        return nums;
    }
}
