/**
 *
 * @author bende
 */
package workshopcode;

public class WorkshopCode {

    public static void main(String[] args) {
        
        //Interface
        

        //Testing building 1 
        Buildings buildingHandler = new Buildings();
        Building building = new Building("TEK", "Campusvej 65");
        Thermometer dank = new Thermometer("Termometer");
        AirQualitySensor memes = new AirQualitySensor("QualitySensor");
        building.addSensor(dank);
        building.addSensor(memes);
        buildingHandler.addBuilding(building);

        //Testing building 2
        Building building2 = new Building("B44", "Campusvej 64");
        Thermometer thermometer = new Thermometer("Thermometer1");
        AirQualitySensor AQS = new AirQualitySensor("AirQualitySensor1");
        Actuator actuator1 = new Actuator("coldAir", 0);
        Actuator actuator2 = new Actuator("hotAir", 0);
        building2.addSensor(thermometer);
        building2.addSensor(AQS);
        building2.addActuator(actuator1);
        building2.addActuator(actuator2);
        buildingHandler.addBuilding(building2);

        //Printing the combined toString
        System.out.println(buildingHandler.toString());

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
            System.out.println(buildingHandler.printActuator(building2.getUuid()));
            System.out.println(buildingHandler.printSensor(building2.getUuid()));
            
            System.out.println(thermometer.getReadOut());
            AQS.setValue(Math.random() * 100);
            System.out.println(AQS.getReadout());
        }

    }

}
