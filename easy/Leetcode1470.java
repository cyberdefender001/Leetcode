class Leetcode1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                array[i] = nums[i / 2];
            } else {
                array[i] = nums[n + i / 2];
            }
        }
        return array;
    }
}
