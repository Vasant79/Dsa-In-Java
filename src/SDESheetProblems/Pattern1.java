package SDESheetProblems;

public class Pattern1 {

    public static void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {

        for (int i = 1; i <= n; i++) {
            int count = 1;
            int j = 0;
            while (j < i) {
                System.out.print(count);
                count++;
                j++;

            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            int j = 0;
            while (j < i) {
                System.out.print(i);
                j++;
            }

            System.out.println();
        }
    }

    public static void pattern5(int n) {

        for (int i = n; i >= 1; i--) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {

        for (int i = 5; i >= 1; i--) {
            int j = 1;
            while (j < i + 1) {
                System.out.print(j);
                j++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {

        System.out.println("New Pattern :");
        Pattern1.pattern1(4);
        System.out.println("New Pattern :");
        Pattern1.pattern2(4);

        System.out.println("New Pattern :");
        Pattern1.pattern3(4);

        System.out.println("New Pattern :");
        Pattern1.pattern4(5);

        System.out.println("New Pattern :");
        Pattern1.pattern5(5);

        System.out.println("New Pattern :");
        Pattern1.pattern6(5);
    }
}
