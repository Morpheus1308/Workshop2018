
package workshopcode;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author bende
 */
public class Buildings {  

    //ArrayAttributes
    ArrayList<Building> buildingList = new ArrayList<>();

    //Constructor
    public Buildings() {
    }
    
    //Methods
    
    @Override
    public String toString() {
        
        String combinedString = "";
        
        for (Building b : buildingList) {
           combinedString += "\n" + b.toString();
        }
        
        return combinedString;
        
    }
    
     public boolean addBuilding(Building b) {
        return buildingList.add(b);       
    }
    
}
