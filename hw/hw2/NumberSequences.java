import java.util.Scanner;

public class NumberSequences {
    public static void main(String[] args) {
        String type;
        int startNum;
        int upperFibLimit;
        boolean bool = true;

        Scanner scan = new Scanner(System.in);

        while (bool) {
            System.out.print("Enter the first character of the sequence to generate\n"
                 + "(C)ollatz, (F)ib, or (E)xit: ");
            type = scan.next();

            if (type.equals("C")) {
                System.out.print("Enter the starting number (1 - 100): ");
                startNum = scan.nextInt();
                getCollatz(startNum);
                System.out.println("--------------------");
            } else if (type.equals("F")) {
                System.out.print("Enter the length of the desired fib sequence (1 - 40): ");
                upperFibLimit = scan.nextInt();
                getFib(upperFibLimit);
                System.out.println("--------------------");
            } else if (type.equals("E")) {
                System.out.println("--------------------");
                break;
            }
        }
    }


    public static void getCollatz(int startNum) {
        int step = 0;
        System.out.print("\nCollatz Sequence: ");
        while (startNum != 1) {
            System.out.print(startNum + " ");

            if ((startNum & 1) == 1) {
                startNum = 3 * startNum + 1;
                step++;
            } else {
                startNum = startNum / 2;
                step++;
            }
        }
        System.out.println(startNum);
        System.out.println("Number of steps: " + step);
    }

    public static void getFib(int upperFibLimit) {
        int a = 0;
        int b = 1;
        int c;
        if (upperFibLimit == 1) {
            System.out.println("\nFib Sequence: " + a);
        } else if (upperFibLimit == 2) {
            System.out.println("\nFib Sequence: " + a + " " + b);
        } else {
            System.out.print("\nFib Sequence: " + a + " " + b + " ");
            for (int i = 3; i <= upperFibLimit; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
            System.out.print("\n");
        }
    }
}
