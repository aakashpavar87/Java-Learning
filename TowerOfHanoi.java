import java.util.*;

public class TowerOfHanoi {
    public static void hanoi(int n, String src, String hlpr, String dest) {
        if (n == 1) {
            System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
            return;
        }
        // Transfer n-1 disk to helper
        hanoi(n - 1, src, dest, hlpr);
        System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
        // Transfer n-1 disk helper to destination
        hanoi(n - 1, hlpr, src, dest);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, "S", "H", "D");
        sc.close();
    }
}