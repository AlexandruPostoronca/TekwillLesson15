public class ArrayUtils {
    // define getFirst method here
    public static <T> T getFirst(T[] arr) {

        return arr.length > 0 ? arr[0] : null;
    }
}
