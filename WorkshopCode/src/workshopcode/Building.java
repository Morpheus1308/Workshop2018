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
    
    public void removeSensor(UUID uuid) {
        
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
