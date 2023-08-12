import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),revnum=0;
        int count =3,tmp=n;
        for(int i=0;i<count;i++) {
            int rem = tmp%10;
            revnum = (revnum*10)+rem;
            tmp /= 10;
        }
        // System.out.println(revnum);
        if(n == revnum) {
            System.out.println(n+" is a palindrome number");
        } else {
            System.out.println(n+" is not a palindrome number");
            System.out.println(revnum);
        }
        sc.close();
    }
} 