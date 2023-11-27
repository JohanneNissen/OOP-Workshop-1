import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Objects;

public class BuildingManagementSystem {
    private ArrayList<Building> buildingList = new ArrayList<Building>();

    private void RemoveBuilding(String name){
        for(int i = 0; i < buildingList.size() ;i++){
            if(Objects.equals(name, buildingList.get(i).getName())){
                buildingList.remove(i);
            }
        }
    }



    private void AddBuilding(String name){
        Building medister = buildingList.add(new Building("løvens hule"));
    }
}
