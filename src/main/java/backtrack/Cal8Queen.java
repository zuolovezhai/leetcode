package backtrack;

/**
 * @Description
 * @Author zuoshengli
 * @Date 2020/6/13 15:24
 * @Version 1.0
 **/

public class Cal8Queen {
    private int[] result = new int[8];
    //是否可以放置棋子

    public static void main(String[] args) {
        Cal8Queen cal8Queen = new Cal8Queen();
        cal8Queen.cal(0);
    }

    private void cal(int row) {
        if (row == 8) {
            System.out.println("-----------------");
            printQueen();
            return;
        }

        for (int i = 0; i < 8; i++) {
            if (isOK(row, i)) {
                result[row] = i;
                cal(row+1);
            }
        }
    }

    private boolean isOK(int row, int col) {
        int leftup = col - 1;
        int rightup = col + 1;
        for (int i = row - 1; i >= 0; i--) {
            if (result[i] == col) {
                return false;
            }

            if (leftup >= 0) {
                return result[i] != leftup;
            }

            if (rightup < 8) {
                return result[i] != rightup;
            }

            leftup--;
            rightup++;
        }
        return true;
    }

    private void printQueen() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (result[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
