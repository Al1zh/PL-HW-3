import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printMatrix(n, m);
    }
    public static void printMatrix(int n, int m) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
