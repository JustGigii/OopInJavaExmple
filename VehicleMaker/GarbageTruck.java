public class GarbageTruck extends Truck()
{
	private int _GarbageCapacity;
	private boolean _hasSmasher;
	private boolean _hasAds;


	public GarbageTruck()
	{
		super();
	}

	public GarbageTruck(int GarbageCapacity, boolean hasSmasher,boolean hasAds, int maxWeight, double hight, String manufacture,
            String model, int wheelsNum, String color, double weight)
	{
		super(maxWeight,hight,manufacture,model,wheelsNum,color,weight);
		this._GarbageCapacity=GarbageCapacity;
		this._hasSmasher=hasSmasher;
		this._hasAds=hasAds;
	}		

	public GarbageTruck(GarbageTruck other)
	{
		super(other);
		this._GarbageCapacity=other._GarbageCapacity;
		this._hasSmasher=other._hasSmasher;
		this._hasAds=other._hasAds;
	}


    public void SetGarbageCapacity(int GarbageCapacity) {
        this._GarbageCapacity = GarbageCapacity;
    }

    public String GetGarbageCapacity() {
        return _GarbageCapacity;
    }

	 public int GethasSmasher() {
        return _hasSmasher;
    }

    public void SethasSmasher(String hasSmasher) {
        this._hasSmasher = hasSmasher;
    }

    public double GethasAds() {
        return _hasAds;
    }

    public void SethasAds(int hasAds) {
        this._hasAds = hasAds;
    }

	public String toString()
	{
        return "GarbageTruck: \n"
                +super().toString()+
                + "GarbageCapacity: " + this._GarbageCapacity + "\n"
                + "hasSmasher: " + this._hasSmasher + "\n"
                + "hasAds: " + this._hasAds + "\n";
	}