package algorithm.dp;

/**
 * @author zuoshengli
 **/
public class Backpack_01 {

    private static int c = 5;

    private static int w = 55;

    private static int[] weight = {77, 22, 29, 50, 49};

    private static boolean[] states = new boolean[w+1];

    public static void main(String[] args) {
        cal();
    }

    private static void cal() {
        states[0] = true;
        if (weight[0] <= w) {
            states[weight[0]] = true;
        }
        for (int  i = 1; i < c; i++) {
            for (int j = 0; j <= w; j++) {
                states[j] = states[j];
            }

            for (int j = 0; j <= w - weight[i]; j++) {
                if (states[j]) {
                    states[weight[i]+j] = true;
                }
            }
        }

        for (int  i = w; i >= 0; i--) {
            if (states[i]) {
                System.out.println("最大重量是 ：" + i);
                return;
            }
        }


    }
}
