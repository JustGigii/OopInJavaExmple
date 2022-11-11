
public class Car extends Vehicle {
    protected int _eRequirement;
    protected String _engine;
    protected int _chair;

    public Car() {

    }

    public Car(int eRequirement, String engine, int chair, String manufacture, String model, int wheelsNum,
            String color, double weight) {
        super(manufacture, model, wheelsNum, color, weight);
        _eRequirement = eRequirement;
        _engine = engine;
        _chair = chair;

    }

    public Car(Car other) {
        super(other);
        _eRequirement = other._eRequirement;
        _chair = other._chair;
        _engine = other._engine;
    }

    public int GetERequirement() {
        return _eRequirement;
    }

    public void SetERequirement(int _eRequirement) {
        this._eRequirement = _eRequirement;
    }

    public String Get_engine() {
        return _engine;
    }

    public void SetEngine(String _engine) {
        this._engine = _engine;
    }

    public int GetChair() {
        return _chair;
    }

    public void SetChair(int _chair) {
        this._chair = _chair;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Car:\n"
                + "eRequirement: " + this._eRequirement + "\n"
                + "engine: " + this._engine + "\n"
                + "chair: " + this._chair + "\n";
    }
}
