public class Student {
    private String _name;
    private String _id;
    private String _classid;
    // private float _gradeC;
    // private float _gradeAsm;
    // private float _gradeDataStructure;

    public Student(String name, String id, String classid, float gradeC, float gradeAsm, float gradeDataStructure) {
        this._name = name;
        this._id = id;
        this._classid = classid;
        // this._gradeC = gradeC;
        // this._gradeAsm = gradeAsm;
        // this._gradeDataStructure = gradeDataStructure;
    }

    public Student() {
        this._name = "";
        this._id = "";
        this._classid = "";
        // this._gradeC = 0;
        // this._gradeAsm = 0;
        // this._gradeDataStructure = 0;
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

    // public int Cmp(Student other) {
    // // float avgI = (this._gradeAsm + this.GetGradeC() +
    // this.GetGradeDataStructure()) / 3.0f;
    // // float avgO = (other._gradeAsm + other.GetGradeC() +
    // other.GetGradeDataStructure()) / 3.0f;
    // if (avgI == avgO)
    // return 0;
    // // else if (avgI > avgO)
    // return 1;
    // else
    // return -1;
    // }

    // public String toString() {
    // return "name: " + this._name + " id: " + this._id + " class: " +
    // this._classid + " gradec: " + this._gradeC
    // + " GradeAsm: " + this._gradeAsm + " DataStructure: " +
    // this._gradeDataStructure;
    // }

}
