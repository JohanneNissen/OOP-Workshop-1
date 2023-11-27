public class CO2Sensor extends Sensor{
    private double CO2Level;

    public double ReadCO2Levels(){
        return CO2Level;
    }

    public CO2Sensor(String name){
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
