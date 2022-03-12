class Leetcode1295 {
    public int findNumbers(int[] nums) {
        
        int temp = 0;
        int counter = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            int count = 0;
            while (nums[i] > 0) {
                temp = nums[i] % 10;
                nums[i] /= 10; 
                count++;   
            }
            if (count % 2 == 0)
                counter++;
        }
        return counter;
    }
}
