public class CalPaths {
    public static int totPaths(int i, int j, int n, int m) {
        if(j==m-1||i==n-1) {
            return 1;
        }
        int rightPaths = totPaths(i, j + 1, n, m);
        int downPaths = totPaths(i + 1, j, n, m);
        return rightPaths + downPaths;
    }

    public static void main(String[] args) {
        int totalPaths = totPaths(0, 0, 3, 3);
        System.out.println(totalPaths);
    }
}
