public class ComplexConditional {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        boolean condition1 = true;
        boolean condition2 = false;

        if (x > 0 && y < 30 || condition1 && (x + y < 100 || condition2)) {
            System.out.println("Complex conditions satisfied!");
        } else {
            System.out.println("Complex conditions not satisfied!");
        }
    }
}
