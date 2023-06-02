package SDESheetProblems;

public class Pattern2 {

    public static void pattern1() {

        for (int i = 0; i < 5; i++) {

            int N = 5;

            // printing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // printing *
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // printing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    public static void pattern2() {

        int N = 4;
        for (int i = 0; i < N; i++) {
            // printing spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            // printing *
            for (int j = 0; j < N * 2 - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // printing space again
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }

    /**
     * 
     */
    public static void pattern3() {
        int N = 4;

        // 1st patter pyramid
        for (int i = 0; i < N; i++) {

            // printing space
            for (int j = 0; j <= N - (i + 1); j++) {
                System.out.print(" ");
            }

            // printing *
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // printing space
            for (int j = 0; j <= N - (i + 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // second pyramid
        for (int i = 0; i < N; i++) {

            // printing space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            // printing *
            for (int j = 0; j < N * 2 - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // printing space

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    public static void pattern4() {

        int N = 4;
        int n = N - 1;

        // upper- half of dimond
        for (int i = 0; i < N; i++) {

            // printing *
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            // printing space
            for (int j = 0; j < N - (i + 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // lower- half of dimond
        for (int i = 0; i < N; i++) {

            // printing *
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // printing space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {

        System.out.println("New pattern : ");
        Pattern2.pattern1();

        System.out.println("New pattern : ");
        Pattern2.pattern2();

        System.out.println("New pattern : ");
        Pattern2.pattern3();

        System.out.println("New pattern : ");
        Pattern2.pattern4();

    }
}
