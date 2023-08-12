public class FindOccur {
    public static int First = -1;
    public static int Last = -1;

    public static void printocur(String str, int idx) {
        if(idx == str.length()) {
            System.out.println(First);
            System.out.println(Last);
            return;
        }
        char curr = str.charAt(idx);
        if (curr == 'x') {
            if (First == -1) {
                First = idx;
            } else {
                Last = idx;
            }
        }
        printocur(str, idx+1);
    }

    public static void main(String[] args) {
        String st = "axbxxbhhxg";
        printocur(st, 0);
    }

}