/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopcode.Interface;

import java.util.UUID;

/**
 *
 * @author Ryge
 */
public interface IBuildingManagementInterfaceExpansion extends IBuildingManagementSystem {
    
    /**
     *
     * @param name string name to supply the constructor.
     * @param adress string adress.
     */
    public void addBuilding(String name, String adress);
    
    /**
     *
     * @param buildingId id of building which will be removed.
     */
    public void removeBuilding(UUID buildingId);
    
    
    
    
}
