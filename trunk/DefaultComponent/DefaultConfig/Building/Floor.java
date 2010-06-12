/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: Mateusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Floor
//!	Generated Date	: Thu, 3, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/Floor.java
*********************************************************************/

package Building;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Building/Floor.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class Floor 
public class Floor {
    
    protected Dispatcher itsDispatcher;		//## link itsDispatcher 
    
    protected Door itsDoor;		//## link itsDoor 
    
    protected FloorButton itsFloorButton;		//## link itsFloorButton 
    
    protected FloorButton itsFloorButton_1;		//## link itsFloorButton_1 
    
    protected LinkedList<FloorButton> itsFloorButton_2;		//## link itsFloorButton_2 
    
    
    // Constructors
    
    //## auto_generated 
    public  Floor() {
        {
            itsFloorButton_2 = new LinkedList<FloorButton>();
        }
    }
    
    //## auto_generated 
    public Dispatcher getItsDispatcher() {
        return itsDispatcher;
    }
    
    //## auto_generated 
    public void __setItsDispatcher(Dispatcher p_Dispatcher) {
        itsDispatcher = p_Dispatcher;
    }
    
    //## auto_generated 
    public void _setItsDispatcher(Dispatcher p_Dispatcher) {
        if(itsDispatcher != null)
            {
                itsDispatcher._removeItsFloor(this);
            }
        __setItsDispatcher(p_Dispatcher);
    }
    
    //## auto_generated 
    public void setItsDispatcher(Dispatcher p_Dispatcher) {
        if(p_Dispatcher != null)
            {
                p_Dispatcher._addItsFloor(this);
            }
        _setItsDispatcher(p_Dispatcher);
    }
    
    //## auto_generated 
    public void _clearItsDispatcher() {
        itsDispatcher = null;
    }
    
    //## auto_generated 
    public Door getItsDoor() {
        return itsDoor;
    }
    
    //## auto_generated 
    public void __setItsDoor(Door p_Door) {
        itsDoor = p_Door;
    }
    
    //## auto_generated 
    public void _setItsDoor(Door p_Door) {
        if(itsDoor != null)
            {
                itsDoor.__setItsFloor(null);
            }
        __setItsDoor(p_Door);
    }
    
    //## auto_generated 
    public void setItsDoor(Door p_Door) {
        if(p_Door != null)
            {
                p_Door._setItsFloor(this);
            }
        _setItsDoor(p_Door);
    }
    
    //## auto_generated 
    public void _clearItsDoor() {
        itsDoor = null;
    }
    
    //## auto_generated 
    public FloorButton getItsFloorButton() {
        return itsFloorButton;
    }
    
    //## auto_generated 
    public void setItsFloorButton(FloorButton p_FloorButton) {
        itsFloorButton = p_FloorButton;
    }
    
    //## auto_generated 
    public FloorButton getItsFloorButton_1() {
        return itsFloorButton_1;
    }
    
    //## auto_generated 
    public void setItsFloorButton_1(FloorButton p_FloorButton) {
        itsFloorButton_1 = p_FloorButton;
    }
    
    //## auto_generated 
    public ListIterator<FloorButton> getItsFloorButton_2() {
        ListIterator<FloorButton> iter = itsFloorButton_2.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsFloorButton_2(FloorButton p_FloorButton) {
        itsFloorButton_2.add(p_FloorButton);
    }
    
    //## auto_generated 
    public void addItsFloorButton_2(FloorButton p_FloorButton) {
        if(p_FloorButton != null)
            {
                p_FloorButton._setItsFloor(this);
            }
        _addItsFloorButton_2(p_FloorButton);
    }
    
    //## auto_generated 
    public void _removeItsFloorButton_2(FloorButton p_FloorButton) {
        itsFloorButton_2.remove(p_FloorButton);
    }
    
    //## auto_generated 
    public void removeItsFloorButton_2(FloorButton p_FloorButton) {
        if(p_FloorButton != null)
            {
                p_FloorButton.__setItsFloor(null);
            }
        _removeItsFloorButton_2(p_FloorButton);
    }
    
    //## auto_generated 
    public void _clearItsFloorButton_2() {
        itsFloorButton_2.clear();
    }
    
    //## auto_generated 
    public void clearItsFloorButton_2() {
        ListIterator<FloorButton> iter = itsFloorButton_2.listIterator();
        while (iter.hasNext()){
            (itsFloorButton_2.get(iter.nextIndex()))._clearItsFloor();
            iter.next();
        }
        _clearItsFloorButton_2();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/Floor.java
*********************************************************************/

