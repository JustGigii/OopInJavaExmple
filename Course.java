public class Course {
    private String _name;

    private float[] _grades;

    private int _size;
    private int _i;

    public Course(String name, int size) {
        SetName(name);
        SetSize(size);
        this._grades = new float[this._size];
        ResetGrades();
    }

    public Course() {
        this._name = "";
        this._size = 5;
        this._grades = new float[this._size];
        ResetGrades();
    }

    private void SetSize(int size) {
        if (size > 0 && size < 10)
            this._size = size;
        else
            this._size = 5;
    }

    public String GetName() {
        return _name;
    }

    public void SetName(String name) {
        this._name = name;
    }

    public int getCourentSizeOfGrade() {
        return _i;
    }

    public float[] get_grades() {
        return _grades;
    }

    public void ResetGrades() {
        for (int j = 0; j < this._size; j++) {
            this._grades[j] = 0;
        }
        this._i = 0;
    }

    public int AddGrade(float grade) {
        if (this._size == this._i)
            return -1;
        if (grade < 0 || grade > 100)
            return -1;
        this._grades[this._i] = grade;
        this._i++;
        return this._i - 1;
    }

    public Boolean RemoveGrade(int index) {
        if (index > this._i)
            return false;
        for (int j = index; j < _i - 1; j++) {
            this._grades[j] = this._grades[j + 1];
        }
        this._grades[this._i - 1] = 0;
        this._i--;
        return true;
    }

    public String toString() {
        String send = "Course details:\n";
        send += "name: " + this._name + "\n";
        send += "grade: {";
        for (int j = 0; j < this._i; j++) {
            send += this._grades[j] + ",";
        }
        send += "}";
        return send;
    }

    public float FinalGrade() {
        float sum = 0;
        for (int j = 0; j < this._i; j++) {
            sum += this._grades[j];
        }
        return sum / (this._i);
    }
}
