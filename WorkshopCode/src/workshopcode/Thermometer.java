
package workshopcode;

/**
 *
 * @author bende
 */
public class Thermometer extends Sensor {
    
    private String name;
    
    
    public Thermometer(){
        super();
    }
    
    public double getReadOut(){
        return Math.random()*100;
    }
}
