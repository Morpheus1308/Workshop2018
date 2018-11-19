
package workshopcode;

import java.util.UUID;

/**
 *
 * @author bende
 */
public class Actuator {
    private String name;
    private UUID id;
    private double position;
    
    public Actuator(String name, double position){
      this.name = name;
      this.position = position;
      id = UUID.randomUUID();
              
    }
   
    public double getCurrentPos(){
        return getPosition();
    }
    
    public void setPosition(double pos){
        position = pos;
    }
    
    @Override
    public String toString(){
        return getName() + getId();
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
     * @return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * @return the position
     */
    public double getPosition() {
        return position;
    }
}
