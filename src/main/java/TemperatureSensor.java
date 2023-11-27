public class TemperatureSensor extends Sensor{
    private double temperature;

    public double ReadTemp(){
        return temperature;
    }

    public TemperatureSensor(String name){
        this.name = name;
    }
    public String toString(){
        return null;
    }

    @Override
    public void PrintData() {
        System.out.print(getData());
    }
}
