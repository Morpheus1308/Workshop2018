package workshopcode;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author bende
 */
public class Building {

    //Attributes
    private String name;
    private String address;
    private final UUID uuid;

    //ArrayAttributes
    ArrayList<Sensor> sensorList = new ArrayList<>();
    ArrayList<Actuator> actuatorList = new ArrayList<>();

    //Constructor
    public Building(String name, String address) {
        
        //Assigning name, address and uuid.
        this.name = name;
        this.address = address;
        uuid = UUID.randomUUID();

    }

    //Methods
    public boolean addSensor(Sensor s) {
        return sensorList.add(s);       
    }
    
    public boolean addActuator(Actuator a) {
        return actuatorList.add(a);
    }
    
    public boolean removeSensor(UUID uuid) {
        for (Sensor s : sensorList) {
            if (s.getId() == uuid) {
                return sensorList.remove(s);
            }
        }
        return false;
    }
    
    public boolean removeActuator(UUID uuid) {
        for (Actuator a : actuatorList) {
            if (a.getId() == uuid) {
                return actuatorList.remove(a);
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        String combinedString = name + " " + address + " " + uuid + "\nThe above building contains: ";
        for (Sensor s : sensorList) {
            combinedString += "\n" + s.toString();
        }
        for (Actuator a : actuatorList) {
            combinedString += "\n" + a.toString();
        }
        
        combinedString += "\n ----------------";
        return combinedString;
    }
    
    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UUID getUuid() {
        return uuid;
    }
}
