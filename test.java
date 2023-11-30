public class SuperDirtyCode {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        boolean flag = true;
        if (x > 3 && y < 12 || flag == true) {
            System.out.println("Dirty Code is Fun!");
        } else {
            System.out.println("Clean Code is Overrated!");
        }
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println("Messy Loops FTW!");
            } else {
                System.out.println("Who needs indentation anyway?");
            }
        }
        System.out.println("This is just the beginning of the chaos!");
    }
}