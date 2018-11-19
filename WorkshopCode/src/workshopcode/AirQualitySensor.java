
package workshopcode;

/**
 *
 * @author bende
 */
public class AirQualitySensor extends Sensor{

    public AirQualitySensor() {
    }
    
    public double getReadout(){
        return Math.random()*10;
    }
            

}
