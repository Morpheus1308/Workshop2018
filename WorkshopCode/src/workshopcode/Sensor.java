
package workshopcode;

import java.util.UUID;

/**
 *
 * @author bende
 */
public class Sensor {
    private double value;
    private String name;
    private UUID id;
    
    public Sensor(){
        id = UUID.randomUUID();
    }
    
    

    /**
     * @return the value
     */
    public double getReadout() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the desciption
     */
    
    @Override
    public String toString(){
        return String.format("Sensor name:\t %s with the id: %s", name, getId());
    }

    /**
     * @return the id
     */
    public UUID getId() {
        return id;
    }
    
    
}
