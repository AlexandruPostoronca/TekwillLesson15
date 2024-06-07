public class ArrayUtils {
    // define hasNull method here
    public static <T> boolean hasNull(T[] arr) {
        boolean result=false;
        for (T x : arr) {
            if (x==null) {
                result= true;
            }
        }
        return result;
    }
}
