class Leetcode1920 {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[nums[i]] ;
        }
        return array;
    }
}
