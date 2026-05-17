public class Table {
    public static void main(String[] args) {
        System.out.println("===========>- Hello from a class running inside a docker container -<==========");
        System.out.println("Getting an environment input");
        String input = System.getenv("input");
        if (input == null) {
            System.out.println("environment input is null");
            return;
        }
        System.out.println("Env input: " + input);
        int value;
        try {
            value = Integer.parseInt(input);
            if (value > 1) {
                for (int i = 1; i <= value; i++) {
                    System.out.printf("%d * %d = %d\n", i, value, (i * value));
                }
            }
            else System.out.println("number not positive: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Env input is not a number ");
        }
    }
}