public class InviteFriend {
    public static int calInviteWay(int n) {
        if(n <= 1) { //jo koi friend j na hoy to pachhi 1 way chhe.
            return 1;
        }
        int singleInvites = calInviteWay(n-1);//single friend aave to 1 minus karine pachhi call karvanu
        int pairInvites = (n-1) * calInviteWay(n-2);//ek pair aai gyu to bija friend mate fari thi call kari ne multiply karvanu
        return singleInvites + pairInvites;
    }
    public static void main(String[] args) {
        System.out.println("Total number of Ways to invite friend in party : "+calInviteWay(3));
    }
}
