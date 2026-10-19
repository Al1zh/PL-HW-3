import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printStrip(n, '#');
    }
    public static void printStrip(int n, char symbol) {
        System.out.println(String.valueOf(symbol).repeat(n));
    }
}