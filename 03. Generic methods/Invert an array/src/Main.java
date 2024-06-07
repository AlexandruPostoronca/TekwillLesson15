import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String[] params = scanner.hasNext() ? scanner.nextLine().split("\\s+") : new String[0];
        switch (type) {
            case "Integer" -> {
                Integer[] array = Arrays.stream(params)
                        .map(Integer::parseInt).toArray(Integer[]::new);
                ArrayUtils.invert(array);
                outputArr(array);
            }
            case "String" -> {
                String[] array = Arrays.stream(params).toArray(String[]::new);
                ArrayUtils.invert(array);
                outputArr(array);
            }
            default -> throw new IllegalArgumentException("No such type");
        }
    }

    public static <T> void outputArr(T[] arr) {
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }
}