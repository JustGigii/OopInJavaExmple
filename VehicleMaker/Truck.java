
public class Truck extends Vehicle {
    protected double _maxWeight;
    protected double _hight;

    public Truck() {
        super();
        this._maxWeight = 0;
        this._hight = 0;
    }

    public Truck(int maxWeight, double hight, String manufacture, String model, int wheelsNum, String color,
            double weight) {
        super(manufacture, model, wheelsNum, color, weight);
        _maxWeight = maxWeight;
        _hight = hight;
    }

    public Truck(Truck other) {
        super((Vehicle) other);
        this._maxWeight = other._maxWeight;
        this._hight = other._hight;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Truck: \n"
                + "maxWeight: " + this._maxWeight + "\n"
                + "hight: " + this._hight + "\n";
    }

}
