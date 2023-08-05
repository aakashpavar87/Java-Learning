import java.util.*;

public class PrimeRecursion {
    public static void prime(int n, int x) {
        if (n == 1 || n == 0) {
            System.out.println(n + " is not a prime number.");
        } else if (x == n) {
            System.out.println(n + " is prime");
        } else if (n % x == 0) {
            System.out.println(n + " is not prime number.");
        } else {
            prime(n, x + 1);
        }
    }

    public static void main(String args[]) {
        int num, i = 2;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        prime(num, i);
        sc.close();
    }
}