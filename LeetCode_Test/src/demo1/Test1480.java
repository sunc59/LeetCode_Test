package demo1;

/**
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * 请返回 nums 的动态和。
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 */
public class Test1480 {

    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4};
        int[] sum = new Test1480().runningSum(nums);
        for (int i : sum) {
            System.out.print(i+" ");
        }
    }
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

    /*public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            sums[i] = sum;
        }
        return sums;
    }*/

    /*public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        int index = 1;
        while (index <= nums.length){
            int sum = 0;
            for (int i = 0; i < index; i++) {
                sum += nums[i];
            }
            sums[index-1] = sum;
            index++;
        }
        return sums;
    }*/
}
