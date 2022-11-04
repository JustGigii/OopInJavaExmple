
public class main {

    public static void main(String[] args) {
        Course C = new Course("C", 3);
        if (C.AddGrade(100f) == -1)
            System.out.println("something wrong");
        if (C.AddGrade(85f) == -1)
            System.out.println("something wrong");
        if (C.AddGrade(95f) == -1)
            System.out.println("something wrong");
        System.out.println(C.toString());
        if (!C.RemoveGrade(1))
            System.out.println("something wrong");
        System.out.println(C.toString());
    }
}