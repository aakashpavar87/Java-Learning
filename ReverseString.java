public class ReverseString {
    public static void printstr(String s,int index) {
        if(index == 0) {
            System.out.print(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        printstr(s, index-1);
    }
    public static void main(String[] args) {
        String tst = "Aakash";
        printstr(tst, tst.length()-1);
        // int i = tst.length() - 1;
        // for(;i>=0;i--) {
        //     System.out.print(tst.charAt(i));
        // }
    }
}
