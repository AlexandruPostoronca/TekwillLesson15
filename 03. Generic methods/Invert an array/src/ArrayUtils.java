public class ArrayUtils<T> {
    public static <T> T[] invert(T[] arr) {
        T tempValue;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                tempValue = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = tempValue;
            }
        }
        return arr;
    }
}