/*
 * @lc app=leetcode.cn id=303 lang=java
 *
 * [303] 区域和检索 - 数组不可变
 */

// @lc code=start
class NumArray {
    // 从0开始, preSum[x] 表示数组前x个元素之和(不包括x),
    // 如果数据有10个元素,那么下标最大就是10,所以需要大小为num.length+1
    private int[]  preSum ;
    public NumArray(int[] nums) {
        preSum=new int[nums.length+1];
        preSum[0]=0;
        for (int i = 1; i < nums.length+1; i++) {
            preSum[i]=preSum[i-1]+nums[i-1];
        }

    }
    
    public int sumRange(int left, int right) {
       return    preSum[right+1] - preSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
// @lc code=end

