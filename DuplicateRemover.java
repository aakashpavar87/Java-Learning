public class DuplicateRemover {
    public static boolean[] map = new boolean[26];
    public static void remove(String str,int idx,String newString) {
        char curr = str.charAt(idx);
        if(idx == str.length()-1) {
            System.out.println(newString);
            return;
        }
        if(map[curr-'a']) {
            remove(str, idx+1, newString);
        } else {
            newString += curr;
            map[curr-'a'] = true;
            remove(str, idx+1, newString);
        }
    }
    public static void main(String args[]) {
        String s = "abcddshhaabbcs";
        remove(s, 0, "");
    }
}
