public class Studentdemo {
    private String name;
    private int rollno;
    private int sem;

    Studentdemo() {
        name = "ABC";
        rollno = 001;
        sem = 2;
    }

    Studentdemo(String n, int rno) {
        this.name = n;
        this.rollno = rno;
        this.sem = 2;
    }

    Studentdemo(int s) {
        this.sem = s;
        this.name = "PQR";
        this.rollno = 001;
    }

    // Copy Constructor
    Studentdemo(Studentdemo s) {
        this.name = s.name;
        this.rollno = s.rollno;
        this.sem = s.sem;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll NO. : " + rollno);
        System.out.println("Semester : " + sem);
    }

    public static void main(String args[]) {
        Studentdemo s1 = new Studentdemo();
        Studentdemo s2 = new Studentdemo("Aakash Pavar", 2057);
        Studentdemo s3 = new Studentdemo(3);
        Studentdemo s4 = new Studentdemo(s2);
        s1.display();
        System.out.println("Parameterised Constructor.");
        s2.display();
        s3.display();
        s4.display();
    }
}
