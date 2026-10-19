import java.util.Scanner;
public class popa {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if (Pal(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    public static boolean Pal(int n) {
        if (n < 0) {
            return false;
        }
        int orig=n;
        int rev=0;
        while (n > 0) {
            int q=n%10;
            rev=rev*10+q;
            n/=10;
        }
        return orig==rev;
    }
}
