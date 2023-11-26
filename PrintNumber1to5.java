import java.util.Scanner;

public class PrintNumber1to5 {
    public static void Number(int n) {
        if (n == 0) {
            return;
        }
         Number(n - 1);
     System.out.println(n);
       
    }

    public static void main(String[] args) {
        int n;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Number(n);
    }

}
