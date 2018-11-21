
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
    
    public String toString(){
        return String.format("Sensor name:\t %s with the id: %s", name, getId());
    }
}
