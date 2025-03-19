import java.util.Arrays;

public class Practice {

    public static class Main {
        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4};
            int[] b = new int[a.length]; // 24,12,8,6

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (i != j) {
                        if (b[i] == 0) {
                            b[i] = a[j];
                        } else {
                            b[i] *= a[j];
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(b));
        }
    }

}
