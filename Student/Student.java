public class Student {
    private String _name;
    private String _id;
    private String _classid;
    private Course _c;
    private Course _asm;
    private Course _dataStructure;

    public Student(String name, String id, String classid) {
        this._name = name;
        this._id = id;
        this._classid = classid;
        this._c = new Course("C", 3);
        this._asm = new Course("ASM", 4);
        this._dataStructure = new Course("DataStructure", 2);
    }

    public Student() {
        this._name = "";
        this._id = "";
        this._classid = "";

    }

    public Student(Student other) {
        this._name = other._name;
        this._id = other._id;
        this._classid = other._classid;
        this._c = other._c;
        this._asm = other._asm;
        this._dataStructure = other._dataStructure;
    }

    public String GetName() {
        return this._name;
    }

    public void SetName(String name) {
        this._name = name;
    }

    public String GetId() {
        return this._id;
    }

    public void SetId(String id) {
        this._id = id;
    }

    public String GetClassid() {
        return _classid;
    }

    public void SetClassid(String classid) {
        this._classid = classid;
    }

    public Boolean equals(Student other) {
        return this._name == other._name && this._id == other._id;
    }

    public Course getC() {
        return _c;
    }

    public Course getAsm() {
        return _asm;
    }

    public Course GetDataStructure() {
        return _dataStructure;
    }

    public int Cmp(Student other) {
        float avgI = (this._c.FinalGrade() + this._asm.FinalGrade() + this._dataStructure.FinalGrade()) / 3.0f;
        float avgO = (other._c.FinalGrade() + other._asm.FinalGrade() + other._dataStructure.FinalGrade()) / 3.0f;
        if (avgI == avgO)
            return 0;
        else if (avgI > avgO)
            return 1;
        else
            return -1;
    }

    // public String toString() {
    // return "name: " + this._name + "\nid: " + this._id + "\nclass: " +
    // this._classid +
    // "\n" + this._c.toString() +
    // "\n" + this._asm.toString() +
    // "\n" + this._dataStructure.toString();

    // }
    public String toString() {
        return "name: " + this._name + "\nid: " + this._id + "\nclass: " +
                this._classid;
    }

}
