package demo1;

/**
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 *
 * 输入：n = 234
 * 输出：15
 * 解释：
 * 各位数之积 = 2 * 3 * 4 = 24
 * 各位数之和 = 2 + 3 + 4 = 9
 * 结果 = 24 - 9 = 15
 */
public class Test1281 {

    public static void main(String[] args) {
        int i = new Test1281().subtractProductAndSum(1234);
        System.out.println(i);
    }

    public int subtractProductAndSum(int n) {
        int cheng = 1;
        int sum = 0;
        while (n > 0){
            int r = n % 10;
            cheng *= r;
            sum += r;
            n = n / 10;
        }
        return cheng - sum;
    }

    /*public int subtractProductAndSum(int n) {
        char[] nums = (n + "").toCharArray();
        int cheng = 1;
        int sum = 0;
        for (char num : nums) {
            sum += num-48;
            cheng *= num-48;
        }
        return cheng - sum;
    }*/

}
