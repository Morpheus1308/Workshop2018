/**
 *
 * @author bende
 */
package workshopcode;

public class WorkshopCode {

    public static void main(String[] args) {

        //Testing building 1 
        Buildings yeet = new Buildings();
        Building building = new Building("Heil", "Hitler Avenue");
        Thermometer dank = new Thermometer("Termometer");
        AirQualitySensor memes = new AirQualitySensor("QualitySensor");
        building.addSensor(dank);
        building.addSensor(memes);
        yeet.addBuilding(building);

        //Testing building 2
        Building building2 = new Building("Josef", "Stalin Street");
        Thermometer dank2 = new Thermometer("Thermometer1");
        AirQualitySensor memes2 = new AirQualitySensor("AirQualitySensor1");
        Actuator actuator1 = new Actuator("VentSystem", 0);
        building2.addSensor(dank2);
        building2.addSensor(memes2);
        building2.addActuator(actuator1);
        yeet.addBuilding(building2);

        //Printing the combined toString
        System.out.println(yeet.toString());

        //Further testing
        while (true) {
            //Infinite loop determines changing 
            actuator1.getPosition();

            
            
        }

    }

}
