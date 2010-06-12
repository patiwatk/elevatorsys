/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: Mateusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Engine
//!	Generated Date	: Thu, 3, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/Engine.java
*********************************************************************/

package Building;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Building/Engine.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class Engine 
public class Engine {
    
    protected int speed;		//## attribute speed 
    
    protected Car itsCar;		//## link itsCar 
    
    protected Dispatcher itsDispatcher;		//## link itsDispatcher 
    
    protected SensorsControl itsSensorsControl;		//## link itsSensorsControl 
    
    protected SensorsControl itsSensorsControl_1;		//## link itsSensorsControl_1 
    
    
    // Constructors
    
    //## auto_generated 
    public  Engine() {
    }
    
    //## auto_generated 
    public int getSpeed() {
        return speed;
    }
    
    //## auto_generated 
    public void setSpeed(int p_speed) {
        speed = p_speed;
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
                itsCar.__setItsEngine(null);
            }
        __setItsCar(p_Car);
    }
    
    //## auto_generated 
    public void setItsCar(Car p_Car) {
        if(p_Car != null)
            {
                p_Car._setItsEngine(this);
            }
        _setItsCar(p_Car);
    }
    
    //## auto_generated 
    public void _clearItsCar() {
        itsCar = null;
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
                itsDispatcher._removeItsEngine(this);
            }
        __setItsDispatcher(p_Dispatcher);
    }
    
    //## auto_generated 
    public void setItsDispatcher(Dispatcher p_Dispatcher) {
        if(p_Dispatcher != null)
            {
                p_Dispatcher._addItsEngine(this);
            }
        _setItsDispatcher(p_Dispatcher);
    }
    
    //## auto_generated 
    public void _clearItsDispatcher() {
        itsDispatcher = null;
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
                itsSensorsControl.__setItsEngine_1(null);
            }
        __setItsSensorsControl(p_SensorsControl);
    }
    
    //## auto_generated 
    public void setItsSensorsControl(SensorsControl p_SensorsControl) {
        if(p_SensorsControl != null)
            {
                p_SensorsControl._setItsEngine_1(this);
            }
        _setItsSensorsControl(p_SensorsControl);
    }
    
    //## auto_generated 
    public void _clearItsSensorsControl() {
        itsSensorsControl = null;
    }
    
    //## auto_generated 
    public SensorsControl getItsSensorsControl_1() {
        return itsSensorsControl_1;
    }
    
    //## auto_generated 
    public void __setItsSensorsControl_1(SensorsControl p_SensorsControl) {
        itsSensorsControl_1 = p_SensorsControl;
    }
    
    //## auto_generated 
    public void _setItsSensorsControl_1(SensorsControl p_SensorsControl) {
        if(itsSensorsControl_1 != null)
            {
                itsSensorsControl_1.__setItsEngine(null);
            }
        __setItsSensorsControl_1(p_SensorsControl);
    }
    
    //## auto_generated 
    public void setItsSensorsControl_1(SensorsControl p_SensorsControl) {
        if(p_SensorsControl != null)
            {
                p_SensorsControl._setItsEngine(this);
            }
        _setItsSensorsControl_1(p_SensorsControl);
    }
    
    //## auto_generated 
    public void _clearItsSensorsControl_1() {
        itsSensorsControl_1 = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/Engine.java
*********************************************************************/

