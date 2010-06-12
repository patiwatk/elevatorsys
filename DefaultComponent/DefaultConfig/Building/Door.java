/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: Mateusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Door
//!	Generated Date	: Thu, 3, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/Door.java
*********************************************************************/

package Building;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Building/Door.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class Door 
public class Door {
    
    protected int attribute_0;		//## attribute attribute_0 
    
    protected Car itsCar;		//## link itsCar 
    
    protected Car itsCar_1;		//## link itsCar_1 
    
    protected Floor itsFloor;		//## link itsFloor 
    
    protected SensorsControl itsSensorsControl;		//## link itsSensorsControl 
    
    
    // Constructors
    
    //## auto_generated 
    public  Door() {
    }
    
    //## auto_generated 
    public int getAttribute_0() {
        return attribute_0;
    }
    
    //## auto_generated 
    public void setAttribute_0(int p_attribute_0) {
        attribute_0 = p_attribute_0;
    }
    
    //## auto_generated 
    public Car getItsCar() {
        return itsCar;
    }
    
    //## auto_generated 
    public void __setItsCar(Car p_Car) {
        itsCar = p_Car;
    }
    
    //## auto_generated 
    public void _setItsCar(Car p_Car) {
        if(itsCar != null)
            {
                itsCar.__setItsDoor(null);
            }
        __setItsCar(p_Car);
    }
    
    //## auto_generated 
    public void setItsCar(Car p_Car) {
        if(p_Car != null)
            {
                p_Car._setItsDoor(this);
            }
        _setItsCar(p_Car);
    }
    
    //## auto_generated 
    public void _clearItsCar() {
        itsCar = null;
    }
    
    //## auto_generated 
    public Car getItsCar_1() {
        return itsCar_1;
    }
    
    //## auto_generated 
    public void __setItsCar_1(Car p_Car) {
        itsCar_1 = p_Car;
    }
    
    //## auto_generated 
    public void _setItsCar_1(Car p_Car) {
        if(itsCar_1 != null)
            {
                itsCar_1.__setItsDoor_1(null);
            }
        __setItsCar_1(p_Car);
    }
    
    //## auto_generated 
    public void setItsCar_1(Car p_Car) {
        if(p_Car != null)
            {
                p_Car._setItsDoor_1(this);
            }
        _setItsCar_1(p_Car);
    }
    
    //## auto_generated 
    public void _clearItsCar_1() {
        itsCar_1 = null;
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
                itsFloor.__setItsDoor(null);
            }
        __setItsFloor(p_Floor);
    }
    
    //## auto_generated 
    public void setItsFloor(Floor p_Floor) {
        if(p_Floor != null)
            {
                p_Floor._setItsDoor(this);
            }
        _setItsFloor(p_Floor);
    }
    
    //## auto_generated 
    public void _clearItsFloor() {
        itsFloor = null;
    }
    
    //## auto_generated 
    public SensorsControl getItsSensorsControl() {
        return itsSensorsControl;
    }
    
    //## auto_generated 
    public void __setItsSensorsControl(SensorsControl p_SensorsControl) {
        itsSensorsControl = p_SensorsControl;
    }
    
    //## auto_generated 
    public void _setItsSensorsControl(SensorsControl p_SensorsControl) {
        if(itsSensorsControl != null)
            {
                itsSensorsControl.__setItsDoor(null);
            }
        __setItsSensorsControl(p_SensorsControl);
    }
    
    //## auto_generated 
    public void setItsSensorsControl(SensorsControl p_SensorsControl) {
        if(p_SensorsControl != null)
            {
                p_SensorsControl._setItsDoor(this);
            }
        _setItsSensorsControl(p_SensorsControl);
    }
    
    //## auto_generated 
    public void _clearItsSensorsControl() {
        itsSensorsControl = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/Door.java
*********************************************************************/

