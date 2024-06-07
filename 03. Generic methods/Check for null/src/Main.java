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
                        .map(i -> i.equals("null") ? null : Integer.parseInt(i)).toArray(Integer[]::new);
                System.out.println(ArrayUtils.hasNull(intArray));
            }
            case "String" -> {
                String[] strArray = Arrays.stream(params)
                        .map(i -> i.equals("null") ? null : i).toArray(String[]::new);
                System.out.println(ArrayUtils.hasNull(strArray));
            }
            case "Box" -> {
                Box[] boxArray = Arrays.stream(params)
                        .map(i -> i.equals("null") ? null : new Box(i)).toArray(Box[]::new);
                System.out.println(ArrayUtils.hasNull(boxArray));
            }
            default -> throw new IllegalArgumentException("No such type");
        }
    }
}