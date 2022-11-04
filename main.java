import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Student amit = new Student("amit", "123", "yg4b", 99, 99, 99);
        Student hadash = new Student();
        Student holder = new Student("amit", "123", "yg4b", 99, 99, 99);
        if (amit.equals(holder))
            System.out.println("equal");
        else
            System.out.println("not equal");

    }
}