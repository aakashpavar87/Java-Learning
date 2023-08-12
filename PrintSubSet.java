import java.util.*;
public class PrintSubSet {
    public static void PrintSet(ArrayList<Integer> subset) {
        for(int i=0;i<subset.size();i++) {
            System.out.print(subset.get(i)+ " ");
        }
        System.out.println();
    }
    public static void getSubSets(ArrayList<Integer> subset,int n) {
        if(n == 0) {
            PrintSet(subset);
            return;
        }
        getSubSets(subset, n-1);//element add thay
        subset.add(n);//set ma add karyu
        getSubSets(subset, n-1);//element add na thay
        subset.remove(subset.size()-1);//set mathi remove karyu
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        getSubSets(subset, n);
    }
}
