public class PlaceTiles {
    public static int fixTile(int n,int m) {
        if(n == m) {
            return 2;
        } else if(n < m) {
            return 1;
        }
        int verticalFix = fixTile(n-1,m);//ubhi tile muki hoy to 1 x m size kapai jaay
        int horizontalFix = fixTile(n-m, m);//aadi tile muki hoy to row kapai jaay
        int totalFix = verticalFix + horizontalFix;
        return totalFix;
    }
    public static void main(String[] args) {
        System.out.println("Total ways of placing 1 x m Tile in n x m Floor : "+fixTile(4, 2));
    }
}
