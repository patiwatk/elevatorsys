/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: Mateusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: SensorsControl
//!	Generated Date	: Thu, 3, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/SensorsControl.java
*********************************************************************/

package Building;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Building/SensorsControl.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class SensorsControl 
public class SensorsControl {
    
    protected Car itsCar;		//## link itsCar 
    
    protected Door itsDoor;		//## link itsDoor 
    
    protected Engine itsEngine;		//## link itsEngine 
    
    protected Engine itsEngine_1;		//## link itsEngine_1 
    
    
    // Constructors
    
    //## auto_generated 
    public  SensorsControl() {
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
                itsCar._removeItsSensorsControl(this);
            }
        __setItsCar(p_Car);
    }
    
    //## auto_generated 
    public void setItsCar(Car p_Car) {
        if(p_Car != null)
            {
                p_Car._addItsSensorsControl(this);
            }
        _setItsCar(p_Car);
    }
    
    //## auto_generated 
    public void _clearItsCar() {
        itsCar = null;
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
                itsDoor.__setItsSensorsControl(null);
            }
        __setItsDoor(p_Door);
    }
    
    //## auto_generated 
    public void setItsDoor(Door p_Door) {
        if(p_Door != null)
            {
                p_Door._setItsSensorsControl(this);
            }
        _setItsDoor(p_Door);
    }
    
    //## auto_generated 
    public void _clearItsDoor() {
        itsDoor = null;
    }
    
    //## auto_generated 
    public Engine getItsEngine() {
        return itsEngine;
    }
    
    //## auto_generated 
    public void __setItsEngine(Engine p_Engine) {
        itsEngine = p_Engine;
    }
    
    //## auto_generated 
    public void _setItsEngine(Engine p_Engine) {
        if(itsEngine != null)
            {
                itsEngine.__setItsSensorsControl_1(null);
            }
        __setItsEngine(p_Engine);
    }
    
    //## auto_generated 
    public void setItsEngine(Engine p_Engine) {
        if(p_Engine != null)
            {
                p_Engine._setItsSensorsControl_1(this);
            }
        _setItsEngine(p_Engine);
    }
    
    //## auto_generated 
    public void _clearItsEngine() {
        itsEngine = null;
    }
    
    //## auto_generated 
    public Engine getItsEngine_1() {
        return itsEngine_1;
    }
    
    //## auto_generated 
    public void __setItsEngine_1(Engine p_Engine) {
        itsEngine_1 = p_Engine;
    }
    
    //## auto_generated 
    public void _setItsEngine_1(Engine p_Engine) {
        if(itsEngine_1 != null)
            {
                itsEngine_1.__setItsSensorsControl(null);
            }
        __setItsEngine_1(p_Engine);
    }
    
    //## auto_generated 
    public void setItsEngine_1(Engine p_Engine) {
        if(p_Engine != null)
            {
                p_Engine._setItsSensorsControl(this);
            }
        _setItsEngine_1(p_Engine);
    }
    
    //## auto_generated 
    public void _clearItsEngine_1() {
        itsEngine_1 = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/SensorsControl.java
*********************************************************************/

