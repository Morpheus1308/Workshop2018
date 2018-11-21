
package workshopcode;

/**
 *
 * @author bende
 */
public class AirQualitySensor extends Sensor{
    
    private String name;
    public AirQualitySensor(String name) {
        super();
        this.name = name;
    }
    
    public double getReadout(){
        return Math.random()*10;
    }
    
    public String toString(){
        return String.format("Sensor name:\t %s with the id: %s", name, getId());
    }
            

}
