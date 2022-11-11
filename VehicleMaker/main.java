
public class main {

    public static void main(String[] args) {
        TowTruck a = new TowTruck(true, 300, 500, 44, "bmw", "yellow", 8, "red", 4);
        Vehicle b = a;
        if (b instanceof Truck) {
            Truck c = (Truck) b;
            System.out.println(c.toString());
        } else {
            System.out.println("we can't down casy :(");
        }
    }
}
