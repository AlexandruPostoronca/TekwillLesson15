public class Main {
    public static void main(String[] args) {
        // initialize an instance of Holder to make the code below compiled
        Holder<String> holder = new Holder<>();

        // do not change the code below
        holder.set("This is an instance of String");

        String value = holder.get();
        System.out.println(value);
    }
}