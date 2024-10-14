package static2.ex;

public class MathArrayUtils {

    static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    static double average(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    static int min(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    private MathArrayUtils() {

    }
}
