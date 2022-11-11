public class Vehicle {
    protected String _manufacture;
    protected String _model;
    protected int _wheelsNum;
    protected String _color;
    protected double _weight;

    public Vehicle() {
        this._manufacture = "";
        this._model = "";
        this._wheelsNum = 0;
        this._color = "";
        this._weight = 0;
    }

    public Vehicle(String manufacture, String model, int wheelsNum, String color, double weight) {
        this._manufacture = manufacture;
        this._model = model;
        this._wheelsNum = wheelsNum;
        this._color = color;
        this._weight = weight;
    }

    public Vehicle(Vehicle other) {
        this._manufacture = other._manufacture;
        this._model = other._model;
        this._wheelsNum = other._wheelsNum;
        this._color = other._color;
        this._weight = other._weight;
    }

    public String GetManufacture() {
        return _manufacture;
    }

    public void SetManufacture(String manufacture) {
        this._manufacture = manufacture;
    }

    public String GetModel() {
        return _model;
    }

    public void SetModel(String model) {
        this._model = model;
    }

    public int GetWheelsNum() {
        return _wheelsNum;
    }

    public void SetWheelsNum(int wheelsNum) {
        this._wheelsNum = wheelsNum;
    }

    public String GetColor() {
        return _color;
    }

    public void SetColor(String color) {
        this._color = color;
    }

    public double Getweight() {
        return _weight;
    }

    public void Setweight(int weight) {
        this._weight = weight;
    }

    public String toString() {
        return "Vehicle: \n"
                + "Manufacture: " + this._manufacture + "\n"
                + "model: " + this._model + "\n"
                + "wheelsNum: " + this._wheelsNum + "\n"
                + "color: " + this._color + "\n"
                + "weight: " + this._weight + "\n";
    }
}
