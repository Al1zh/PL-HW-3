import java.util.Scanner;

public class task12 {
    public static int reverseNumber(int n) {
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n = n / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseNumber(n));
    }
}
