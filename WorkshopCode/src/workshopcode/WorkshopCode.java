/**
 *
 * @author bende
 */
package workshopcode;

public class WorkshopCode {

    public static void main(String[] args) {

        //Testing building 1 
        Buildings all = new Buildings();
        Building building = new Building("Heil", "Hitler Avenue");
        Thermometer dank = new Thermometer("Termometer");
        AirQualitySensor memes = new AirQualitySensor("QualitySensor");
        building.addSensor(dank);
        building.addSensor(memes);
        all.addBuilding(building);

        //Testing building 2
        Building building2 = new Building("Josef", "Stalin Street");
        Thermometer thermometer = new Thermometer("Thermometer1");
        AirQualitySensor AQS = new AirQualitySensor("AirQualitySensor1");
        Actuator actuator1 = new Actuator("coldAir", 0);
        Actuator actuator2 = new Actuator("hotAir", 0);
        building2.addSensor(thermometer);
        building2.addSensor(AQS);
        building2.addActuator(actuator1);
        building2.addActuator(actuator2);
        all.addBuilding(building2);

        //Printing the combined toString
        System.out.println(all.toString());

        //Further testing
        for (int i = 0; i < 3; i++) {
            //Infinite loop determines changing 
            
            if (thermometer.getReadOut() > 50) {
                if (AQS.getReadout() > 40) {
                    actuator1.setPosition(100);
                    actuator2.setPosition(0);
                } else {
                    actuator1.setPosition(50);
                }
            } else if (thermometer.getReadOut() < 15) {
                actuator1.setPosition(10);
                actuator2.setPosition(80);
            }
            
            System.out.println(actuator1.getPosition());
            System.out.println(actuator2.getPosition());
            
            thermometer.setValue(Math.random()*100);
            System.out.println(thermometer.getReadOut());
            AQS.setValue(Math.random()*100);
            System.out.println(AQS.getReadout());
        }

    }

}
