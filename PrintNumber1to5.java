import java.util.Scanner;

public class PrintNumber1to5 {
    public static void Number(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        Number(n + 1);

    }

    public static void main(String[] args) {
        int n;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Number(n);
    }

}
