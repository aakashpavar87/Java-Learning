public class SubSequence {
    public static void printsub(String str,int idx,String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(idx);
        //Character want to enter
        printsub(str, idx+1, newString+curr);
        //Character do not want to enter
        printsub(str, idx+1, newString);
    }
    public static void main(String args[]) {
        String s = "abc";
        printsub(s, 0, "");
    }
}
