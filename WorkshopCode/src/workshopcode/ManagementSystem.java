/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopcode;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import workshopcode.Interface.IBuildingManagementInterfaceExpansion;

/**
 *
 * @author Ryge
 */
public class ManagementSystem implements IBuildingManagementInterfaceExpansion {

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
        UUID id = UUID.randomUUID();
        for (Building building : buildings.getBuildings()) {
            if (building.getUuid() == buildingId) {
                Thermometer thermometer = new Thermometer(name);
                building.addSensor(thermometer);
                id = thermometer.getId();
            }
        }
        return id;

    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        UUID id = UUID.randomUUID();
        for (Building building : buildings.getBuildings()) {
            if (building.getUuid() == buildingId) {
                AirQualitySensor airQualitySensor = new AirQualitySensor(name);
                building.addSensor(airQualitySensor);
                id = airQualitySensor.getId();
            }
        }
        return id;
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        for (Building building : buildings.getBuildings()) {
            if (building.getUuid() == buildingId) {
                building.removeSensor(sensorId);
            }
        }

    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        UUID id = UUID.randomUUID();
        for (Building building : buildings.getBuildings()) {
            if (building.getUuid() == buildingId) {
                Actuator actuator = new Actuator(name, 20);
                building.addActuator(actuator);
                id = actuator.getId();
            }
        }
        return id;
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        for (Building building : buildings.getBuildings()) {
            if (building.getUuid() == buildingId) {
                building.removeActuator(actuatorId);
            }
        }
    }

    @Override
    public void addBuilding(String name, String adress) {
        buildings.addBuilding(new Building(name, adress));

    }

    @Override
    public void removeBuilding(UUID buildingId) {
        buildings.removeBuilding(buildingId);
    }
}
