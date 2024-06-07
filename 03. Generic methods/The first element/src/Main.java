import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String[] params = scanner.nextLine().split("\\s+");
        switch (type) {
            case "Integer" -> {
                Integer[] intArray = Arrays.stream(params)
                        .filter(i -> !i.equals("null"))
                        .map(Integer::parseInt).toArray(Integer[]::new);
                System.out.println(ArrayUtils.getFirst(intArray));
            }
            case "String" -> {
                String[] strArray = Arrays.stream(params)
                        .filter(i -> !i.equals("null")).toArray(String[]::new);
                System.out.println(ArrayUtils.getFirst(strArray));
            }
            default -> throw new IllegalArgumentException("No such type");
        }
    }
}