import java.util.ArrayList;

public class Building {
    private ArrayList<Actuator> actuatorList = new ArrayList<Actuator>();
    private ArrayList<Sensor> sensorList = new ArrayList<Sensor>();

    private String name;

    public Building(String name){
        this.name = name;


    }
    private void RemoveSensor(String name){
        for(int i = 0; i< sensorList.size(); i++){
            if(name == sensorList.get(i).name)
                sensorList.remove(i);
        }
    }

    private void AddSensor(Sensor sensor){

        sensorList.add(sensor);

    }

    private void RemoveActuator(String name){

        for (int i = 0; i < actuatorList.size(); i++) {
            if(name == actuatorList.get(i).name)
                actuatorList.remove(i);
        }
    }

    private void AddActuator(Actuator actuator){

        actuatorList.add(actuator);
    }

    public ArrayList<Actuator>GetActuators(){
        actuatorList = new ArrayList<Actuator>();
        VentilationActuator AC = new VentilationActuator("pøllemåler");
        actuatorList.add(AC);
        return actuatorList;
    }

    public ArrayList<Sensor>GetSensors(){
        sensorList = new ArrayList<Sensor>();
        TemperatureSensor temp = new TemperatureSensor("varm kakao måler");
        sensorList.add(temp);
        CO2Sensor co2Sensor = new CO2Sensor("pruttemåler");
        sensorList.add(co2Sensor);

        return sensorList;
    }

    public String getName(){
        return this.name;
    }
}
