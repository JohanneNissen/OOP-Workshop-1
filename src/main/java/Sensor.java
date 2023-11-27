public abstract class Sensor {
    protected String name;

    private double data;

    public double getData(){

        return data;
    }

    public abstract void PrintData();

    public String getName() {
        return name;
    }
}
