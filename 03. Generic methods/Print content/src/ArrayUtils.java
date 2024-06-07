public class ArrayUtils {
    // define info method here (an array as string)
    public static <T> String info(T[] arr) {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i != arr.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}