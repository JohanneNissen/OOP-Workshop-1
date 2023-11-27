import java.util.ArrayList;

public class Building {
    private ArrayList<Actuator> actuatorList = new ArrayList<Actuator>();
    private ArrayList<Sensor> sensorList = new ArrayList<Sensor>();

    private String name;

    public Building(String name, ArrayList<Actuator> actuatorList, ArrayList<Sensor> sensorList){
        this.name = name;
        this.sensorList = sensorList;
        this.actuatorList = actuatorList;
    }
    private void RemoveSensor(String name){
        for(int i = 0; i< sensorList.size(); i++){
            if(name == sensorList(i).name)
                sensorList.remove(i);
        }
    }

    private void AddSensor(Sensor sensor){

        sensorList.add(sensor);

    }

    private void RemoveActuator(String name){

        for (int i = 0; i < actuatorList.size(); i++) {
            if(name == actuatorList(i).name)
                actuatorList.remove(i);
        }
    }

    private void AddActuator(Actuator actuator){

        actuatorList.add(actuator);
    }
}
