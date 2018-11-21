/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopcode;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import workshopcode.Interface.IBuildingManagementSystem;

/**
 *
 * @author Ryge
 */
public class ManagementSystem implements IBuildingManagementSystem {

    Buildings buildings = new Buildings();

    @Override
    public Map<UUID, String> getBuildingInformation() {
        Map<UUID, String> buildingInformation = new HashMap<>();
        for (Building building : buildings.getBuildings()) {
            buildingInformation.put(building.getUuid(), building.toString());
        }
        return buildingInformation;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        Building tempBuilding;
        Map<UUID, String> sensorInformation = new HashMap<>();
        for (Building building : buildings.getBuildings()) {
            if (building.getUuid() == buildingId) {
                tempBuilding = building;
                for (Sensor sensor : tempBuilding.sensorList) {
                    sensorInformation.put(sensor.getId(), sensor.toString());
                }
            }

        }
        return sensorInformation;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        Building tempBuilding;
        Map<UUID, String> actuatorInformation = new HashMap<>();
        for (Building building : buildings.getBuildings()) {
            if (building.getUuid() == buildingId) {
                tempBuilding = building;
                for (Actuator actuator : tempBuilding.actuatorList) {
                    actuatorInformation.put(actuator.getId(), actuator.toString());
                }
            }

        }
        return actuatorInformation;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        for (Building building : buildings.getBuildings()) {
            if(building.getUuid() == buildingId){
                building.addSensor(new Thermometer(name));
            }
        }

    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        UUID id = UUID.randomUUID();
        for (Building building : buildings.getBuildings()) {
            if(building.getUuid() == buildingId){
                building.addSensor(new AirQualitySensor(name));
                id = 
            }
        }
        return id
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        for (Building building : buildings.getBuildings()) {
            if(building.getUuid() == buildingId){
                building.removeSensor(sensorId);
            }
        }

    }

    @Override
    public UUID addActuator(UUID buildingId, String name) {
        
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
