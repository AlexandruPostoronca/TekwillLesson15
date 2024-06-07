import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String[] params = scanner.hasNext() ? scanner.nextLine().split("\\s+") : new String[0];
        switch (type) {
            case "Integer" -> {
                Integer[] intArray = Arrays.stream(params)
                        .map(Integer::parseInt).toArray(Integer[]::new);
                System.out.println(ArrayUtils.info(intArray));
            }
            case "String" -> {
                String[] strArray = Arrays.stream(params).toArray(String[]::new);
                System.out.println(ArrayUtils.info(strArray));
            }
            default -> throw new IllegalArgumentException("No such type");
        }
    }
}