package algorithm.backtrack;

/**
 * @Description 01背包
 * @Author zuoshengli
 * @Date 2020/6/15 14:14
 * @Version 1.0
 **/

public class Backpack_01 {
    //背包容量
    public static int c = 5;
    //背包总重量
    public static int w = 100;
    //各个物品重量
    public static int[] weight = {77, 22, 29, 50, 49};
    //结果
    public static int maxW = Integer.MIN_VALUE;
    //记录哪几个物品 放在了包里
    public static boolean[] states = new boolean[c];

    public static void main(String[] args) {
        cal(0, 0);
        System.out.println("最大重量 : " + maxW);
    }


    public static void cal(int i, int cw) { {
        if (i == c || cw == w) {
            if (cw > maxW) {
                maxW = cw;

            }
            return;
        }

        cal(i+1, cw);
        if (cw + weight[i] < w) {
            cal(i+1, cw + weight[i]);
        }
    }

    }



}
