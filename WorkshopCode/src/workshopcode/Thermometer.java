
package workshopcode;

/**
 *
 * @author bende
 */
public class Thermometer extends Sensor {
    
    private String name;
    
    public Thermometer(String name){
        super();
        this.name = name;
        
    }
    
    public double getReadOut(){
        return Math.random()*100;
    }
}
