public class MyArrayUtils {

    boolean hasMultipleMaximum(int[] arr) {

        if (arr == null || arr.length == 0) return false;

        int max = 0;
        int count = 0;

        for (int value : arr) {
            if (value > max) {
                max = value;
                count = 0;
            }

            if (value == max) {
                count++;
            }
        }

        return count > 1;
    }
}
