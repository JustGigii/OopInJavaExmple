
public class main {

    public static void main(String[] args) {
        Student ohad = new Student("ohad", "000001", "yg4a");
        Student omri = new Student("omri", "000000", "yg");
        Student programStudents[] = new Student[3];
        programStudents[0] = new Student(ohad);
        programStudents[1] = new Student(omri);
        programStudents[2] = new Student(ohad);
        programStudents[2].SetName("ori");
        for (int i = 0; i < programStudents.length; i++) {
            System.out.println(programStudents[i].toString());
        }
    }
}