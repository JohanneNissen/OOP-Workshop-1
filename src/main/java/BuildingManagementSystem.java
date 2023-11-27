import javax.xml.namespace.QName;
import java.util.ArrayList;

public class BuildingManagementSystem {
    private ArrayList<Building> buildingList = new ArrayList<Building>();

    private void RemoveBuilding(String name){
        for(int i = 0; i < buildingList.size() ;i++){
            if(name == buildingList(i).name){
                buildingList.remove(i);
            }
        }
    }

    private void AddBuilding(String name){
        buildingList.add(new Building());
    }
}
