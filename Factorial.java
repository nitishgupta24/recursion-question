import java.util.Scanner;

public class Factorial {
    public static int Number(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm = Number(n - 1);
        int fn = n * fnm;
        return fn;

    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = Number(n);
        System.out.println(f);

        sc.close();
    }
}