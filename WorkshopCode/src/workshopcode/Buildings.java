package workshopcode;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author bende
 */
public class Buildings {

    //ArrayAttributes
    ArrayList<Building> buildingList = new ArrayList<>();

    //Constructor
    public Buildings() {
    }

    //Methods
    @Override
    public String toString() {

        String combinedString = "";

        for (Building b : buildingList) {
            combinedString += "\n" + b.toString();
        }

        return combinedString;

    }

    public boolean addBuilding(Building b) {
        return buildingList.add(b);
    }

    public String printActuator(UUID id) {
        StringBuilder sb = new StringBuilder();
        Building tempBuilding;
        for (Building building : buildingList) {
            if (building.getUuid() == id) {
                tempBuilding = building;
                for (Actuator actuator : tempBuilding.actuatorList) {
                    sb.append(actuator + "\n");
                }
            }
        }

        return sb.toString();
    }

    public ArrayList<String> printSensor(UUID id) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> sensorStrings = new ArrayList<>();
        Building tempBuilding;
                
        for (Building building : buildingList) {
            if (building.getUuid() == id) {
                tempBuilding = building;
                for (Sensor sensor : tempBuilding.sensorList) {
                    sensorStrings.add(sensor.toString());
                }
            }
        }

        return sensorStrings;
    }
    
    public ArrayList<Building> getBuildings(){
        return buildingList;
    }
    
}
