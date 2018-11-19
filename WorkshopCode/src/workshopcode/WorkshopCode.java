/**
 *
 * @author bende
 */
package workshopcode;

public class WorkshopCode {

    public static void main(String[] args) {

        Buildings yeet = new Buildings();
        Building building = new Building("Heil", "Hitler Avenue");
        Thermometer dank = new Thermometer("Termometer");
        AirQualitySensor memes = new AirQualitySensor("yeet");
        building.addSensor(dank);
        building.addSensor(memes);
        
        
        yeet.addBuilding(building);
        
        System.out.println(yeet.toString());
        
    }

}

