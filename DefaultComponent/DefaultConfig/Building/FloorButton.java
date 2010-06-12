/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: Mateusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: FloorButton
//!	Generated Date	: Thu, 3, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/FloorButton.java
*********************************************************************/

package Building;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Building/FloorButton.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class FloorButton 
public class FloorButton extends Button {
    
    protected Floor itsFloor;		//## link itsFloor 
    
    
    // Constructors
    
    //## auto_generated 
    public  FloorButton() {
    }
    
    //## auto_generated 
    public Floor getItsFloor() {
        return itsFloor;
    }
    
    //## auto_generated 
    public void __setItsFloor(Floor p_Floor) {
        itsFloor = p_Floor;
    }
    
    //## auto_generated 
    public void _setItsFloor(Floor p_Floor) {
        if(itsFloor != null)
            {
                itsFloor._removeItsFloorButton_2(this);
            }
        __setItsFloor(p_Floor);
    }
    
    //## auto_generated 
    public void setItsFloor(Floor p_Floor) {
        if(p_Floor != null)
            {
                p_Floor._addItsFloorButton_2(this);
            }
        _setItsFloor(p_Floor);
    }
    
    //## auto_generated 
    public void _clearItsFloor() {
        itsFloor = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/FloorButton.java
*********************************************************************/

