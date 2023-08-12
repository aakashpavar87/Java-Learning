public class MoveallX {
    public static void movetoend(String str,int count,int idx,String newString) {
        if(idx == str.length()) {
            for(int i=0;i<count;i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(idx) == 'x') {
            count++;
            movetoend(str,count,idx+1,newString);
        } else {
            newString += str.charAt(idx);
            movetoend(str, count, idx+1, newString);
        }
    }
    public static void main(String args[]) {
        String st = "axbxcxdxe";
        movetoend(st, 0, 0, "");
    }
}
