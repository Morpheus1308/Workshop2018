
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
        return name + " " + super.getId();
    }
            

}
