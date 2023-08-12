import java.util.HashSet;

public class SubUniqueSequence {
    public static void printsub(String str,int idx,String newString,HashSet<String> set) {
        if(idx == str.length()) {
            if(set.contains(newString)) {
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }
        char curr = str.charAt(idx);
        //Character want to enter
        printsub(str, idx+1, newString+curr,set);
        //Character do not want to enter
        printsub(str, idx+1, newString,set);
    }
    public static void main(String args[]) {
        String s = "ccc";
        HashSet<String> set = new HashSet<>();
        printsub(s, 0, "",set);
    }
}
