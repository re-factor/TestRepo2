public class UnrefactoredComplexCode {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = true;

        if (a > 0 && b < 20 || (c >= 10 && flag1 || (a + b < 30 && flag2 && flag3))) {
            System.out.println("This code is a masterpiece of complexity!");
        } else {
            System.out.println("Simplicity is overrated anyway!");
        }

        for (int i = 0; i < 3; i++) {
            while (a < 15) {
                do {
                    if (b % 2 == 0) {
                        System.out.println("Nested loops and conditions are the essence of elegance!");
                    } else {
                        System.out.println("Complexity is an acquired taste!");
                    }
                    a++;
                } while (a < 10);
                b--;
            }
        }
    }
}
