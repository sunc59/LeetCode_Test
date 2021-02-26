package demo1;

/**
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 *
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 *
 * 输入：nums = [2,5,1,3,4,7], n = 3
 * 输出：[2,3,5,4,1,7]
 * 解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
 */
public class Test1470 {

    public static void main(String[] args) {

    }

    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[2*n];
        for (int i = 0; i < nums.length; i++) {
            if (i < n){
                array[2*i] = nums[i];
            }else {
                array[(i-n)*2+1] = nums[i];
            }
        }
        return array;
    }
}
