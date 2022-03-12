class Leetcode88 {
     public int[] merge(int[] nums1, int m, int[] nums2,int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        int length = nums1.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length - 1; j++) {
                if (nums1[i] > nums1[j + 1]) {
                    int t = nums1[j + 1];
                    nums1[j + 1] = nums1[i];
                    nums1[i] = t;
                }
            }
        }
        return nums1;
    }
        
}
