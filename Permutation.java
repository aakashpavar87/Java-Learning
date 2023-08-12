public class Permutation{
    public static void printPer(String str,int idx,String perm) {
        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPer(newStr, idx+1, perm+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPer(str, 0, "");
    }
}