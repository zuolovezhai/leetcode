package test;

/**
 * @author zuoshengli
 **/
public class Test {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println("hello " + n);

        for (int i = 0; i < n; i++) {
            System.out.println("hello " + i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("hello " + n);
            }
        }

    }
}
