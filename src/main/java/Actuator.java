public abstract class Actuator {
    private String name;

    private double data;
    public double getData(){

        return data;
    }
    public abstract void PrintData();

    public void WriteData(double data){
        this.data = data;
    }
}
