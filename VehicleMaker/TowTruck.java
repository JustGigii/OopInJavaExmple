public class TowTruck extends Truck {
    private boolean _tow;
    private double _towWeight;

    public TowTruck() {
        super();
    }

    public TowTruck(boolean tow, double towWeight, int maxWeight, double hight, String manufacture,
            String model, int wheelsNum, String color, double weight) {
        super(maxWeight, hight, manufacture, model, wheelsNum, color, weight);
        _tow = tow;
        _towWeight = towWeight;
    }

    public TowTruck(TowTruck other) {
        super((Truck) other);
        _tow = other._tow;
        _towWeight = other._towWeight;
    }

}
