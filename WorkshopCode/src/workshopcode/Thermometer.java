
package workshopcode;

/**
 *
 * @author bende
 */
public class Thermometer extends Sensor {
    public Thermometer(){
        
    }
    
    public double getReadOut(){
        return Math.random()*100;
    }
}
