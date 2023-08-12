import java.util.Scanner;
class hello{
    public static void main(String args[]) {
        System.out.print("Enter your name : ");
        try (Scanner scan = new Scanner(System.in)) {
            String name = scan.nextLine();
            System.out.print("Your name is "+name);
            // System.out.print("java");
            System.out.print("\nEnter your age : ");
            int age = scan.nextInt();
            if(age>18) {
                System.out.println("You are an Adult");
            }
            else {
                System.out.println("You are not an adult try again");
            }
            // System.out.println("Your age is"+age);
        }
    }
}