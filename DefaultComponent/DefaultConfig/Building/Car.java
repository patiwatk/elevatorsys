/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: Mateusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Car
//!	Generated Date	: Thu, 3, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/Car.java
*********************************************************************/

package Building;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Building/Car.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class Car 
public class Car {
    
    protected int itsNumber;		//## attribute itsNumber 
    
    protected CarButton itsCarButton;		//## link itsCarButton 
    
    protected LinkedList<CarButton> itsCarButton_1;		//## link itsCarButton_1 
    
    protected CarPositionControl itsCarPositionControl;		//## link itsCarPositionControl 
    
    protected CarPositionControl itsCarPositionControl_1;		//## link itsCarPositionControl_1 
    
    protected Dispatcher itsDispatcher;		//## link itsDispatcher 
    
    protected Door itsDoor;		//## link itsDoor 
    
    protected Door itsDoor_1;		//## link itsDoor_1 
    
    protected Engine itsEngine;		//## link itsEngine 
    
    protected LinkedList<SensorsControl> itsSensorsControl;		//## link itsSensorsControl 
    
    
    // Constructors
    
    //## auto_generated 
    public  Car() {
        {
            itsCarButton_1 = new LinkedList<CarButton>();
        }
        {
            itsSensorsControl = new LinkedList<SensorsControl>();
        }
    }
    
    //## auto_generated 
    public int getItsNumber() {
        return itsNumber;
    }
    
    //## auto_generated 
    public void setItsNumber(int p_itsNumber) {
        itsNumber = p_itsNumber;
    }
    
    //## auto_generated 
    public CarButton getItsCarButton() {
        return itsCarButton;
    }
    
    //## auto_generated 
    public void __setItsCarButton(CarButton p_CarButton) {
        itsCarButton = p_CarButton;
    }
    
    //## auto_generated 
    public void _setItsCarButton(CarButton p_CarButton) {
        if(itsCarButton != null)
            {
                itsCarButton.__setItsCar(null);
            }
        __setItsCarButton(p_CarButton);
    }
    
    //## auto_generated 
    public void setItsCarButton(CarButton p_CarButton) {
        if(p_CarButton != null)
            {
                p_CarButton._setItsCar(this);
            }
        _setItsCarButton(p_CarButton);
    }
    
    //## auto_generated 
    public void _clearItsCarButton() {
        itsCarButton = null;
    }
    
    //## auto_generated 
    public ListIterator<CarButton> getItsCarButton_1() {
        ListIterator<CarButton> iter = itsCarButton_1.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsCarButton_1(CarButton p_CarButton) {
        itsCarButton_1.add(p_CarButton);
    }
    
    //## auto_generated 
    public void addItsCarButton_1(CarButton p_CarButton) {
        if(p_CarButton != null)
            {
                p_CarButton._setItsCar_1(this);
            }
        _addItsCarButton_1(p_CarButton);
    }
    
    //## auto_generated 
    public void _removeItsCarButton_1(CarButton p_CarButton) {
        itsCarButton_1.remove(p_CarButton);
    }
    
    //## auto_generated 
    public void removeItsCarButton_1(CarButton p_CarButton) {
        if(p_CarButton != null)
            {
                p_CarButton.__setItsCar_1(null);
            }
        _removeItsCarButton_1(p_CarButton);
    }
    
    //## auto_generated 
    public void _clearItsCarButton_1() {
        itsCarButton_1.clear();
    }
    
    //## auto_generated 
    public void clearItsCarButton_1() {
        ListIterator<CarButton> iter = itsCarButton_1.listIterator();
        while (iter.hasNext()){
            (itsCarButton_1.get(iter.nextIndex()))._clearItsCar_1();
            iter.next();
        }
        _clearItsCarButton_1();
    }
    
    //## auto_generated 
    public CarPositionControl getItsCarPositionControl() {
        return itsCarPositionControl;
    }
    
    //## auto_generated 
    public void __setItsCarPositionControl(CarPositionControl p_CarPositionControl) {
        itsCarPositionControl = p_CarPositionControl;
    }
    
    //## auto_generated 
    public void _setItsCarPositionControl(CarPositionControl p_CarPositionControl) {
        if(itsCarPositionControl != null)
            {
                itsCarPositionControl.__setItsCar(null);
            }
        __setItsCarPositionControl(p_CarPositionControl);
    }
    
    //## auto_generated 
    public void setItsCarPositionControl(CarPositionControl p_CarPositionControl) {
        if(p_CarPositionControl != null)
            {
                p_CarPositionControl._setItsCar(this);
            }
        _setItsCarPositionControl(p_CarPositionControl);
    }
    
    //## auto_generated 
    public void _clearItsCarPositionControl() {
        itsCarPositionControl = null;
    }
    
    //## auto_generated 
    public CarPositionControl getItsCarPositionControl_1() {
        return itsCarPositionControl_1;
    }
    
    //## auto_generated 
    public void __setItsCarPositionControl_1(CarPositionControl p_CarPositionControl) {
        itsCarPositionControl_1 = p_CarPositionControl;
    }
    
    //## auto_generated 
    public void _setItsCarPositionControl_1(CarPositionControl p_CarPositionControl) {
        if(itsCarPositionControl_1 != null)
            {
                itsCarPositionControl_1.__setItsCar_1(null);
            }
        __setItsCarPositionControl_1(p_CarPositionControl);
    }
    
    //## auto_generated 
    public void setItsCarPositionControl_1(CarPositionControl p_CarPositionControl) {
        if(p_CarPositionControl != null)
            {
                p_CarPositionControl._setItsCar_1(this);
            }
        _setItsCarPositionControl_1(p_CarPositionControl);
    }
    
    //## auto_generated 
    public void _clearItsCarPositionControl_1() {
        itsCarPositionControl_1 = null;
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
                itsDispatcher._removeItsCar(this);
            }
        __setItsDispatcher(p_Dispatcher);
    }
    
    //## auto_generated 
    public void setItsDispatcher(Dispatcher p_Dispatcher) {
        if(p_Dispatcher != null)
            {
                p_Dispatcher._addItsCar(this);
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
                itsDoor.__setItsCar(null);
            }
        __setItsDoor(p_Door);
    }
    
    //## auto_generated 
    public void setItsDoor(Door p_Door) {
        if(p_Door != null)
            {
                p_Door._setItsCar(this);
            }
        _setItsDoor(p_Door);
    }
    
    //## auto_generated 
    public void _clearItsDoor() {
        itsDoor = null;
    }
    
    //## auto_generated 
    public Door getItsDoor_1() {
        return itsDoor_1;
    }
    
    //## auto_generated 
    public void __setItsDoor_1(Door p_Door) {
        itsDoor_1 = p_Door;
    }
    
    //## auto_generated 
    public void _setItsDoor_1(Door p_Door) {
        if(itsDoor_1 != null)
            {
                itsDoor_1.__setItsCar_1(null);
            }
        __setItsDoor_1(p_Door);
    }
    
    //## auto_generated 
    public void setItsDoor_1(Door p_Door) {
        if(p_Door != null)
            {
                p_Door._setItsCar_1(this);
            }
        _setItsDoor_1(p_Door);
    }
    
    //## auto_generated 
    public void _clearItsDoor_1() {
        itsDoor_1 = null;
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
                itsEngine.__setItsCar(null);
            }
        __setItsEngine(p_Engine);
    }
    
    //## auto_generated 
    public void setItsEngine(Engine p_Engine) {
        if(p_Engine != null)
            {
                p_Engine._setItsCar(this);
            }
        _setItsEngine(p_Engine);
    }
    
    //## auto_generated 
    public void _clearItsEngine() {
        itsEngine = null;
    }
    
    //## auto_generated 
    public ListIterator<SensorsControl> getItsSensorsControl() {
        ListIterator<SensorsControl> iter = itsSensorsControl.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsSensorsControl(SensorsControl p_SensorsControl) {
        itsSensorsControl.add(p_SensorsControl);
    }
    
    //## auto_generated 
    public void addItsSensorsControl(SensorsControl p_SensorsControl) {
        if(p_SensorsControl != null)
            {
                p_SensorsControl._setItsCar(this);
            }
        _addItsSensorsControl(p_SensorsControl);
    }
    
    //## auto_generated 
    public void _removeItsSensorsControl(SensorsControl p_SensorsControl) {
        itsSensorsControl.remove(p_SensorsControl);
    }
    
    //## auto_generated 
    public void removeItsSensorsControl(SensorsControl p_SensorsControl) {
        if(p_SensorsControl != null)
            {
                p_SensorsControl.__setItsCar(null);
            }
        _removeItsSensorsControl(p_SensorsControl);
    }
    
    //## auto_generated 
    public void _clearItsSensorsControl() {
        itsSensorsControl.clear();
    }
    
    //## auto_generated 
    public void clearItsSensorsControl() {
        ListIterator<SensorsControl> iter = itsSensorsControl.listIterator();
        while (iter.hasNext()){
            (itsSensorsControl.get(iter.nextIndex()))._clearItsCar();
            iter.next();
        }
        _clearItsSensorsControl();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/Car.java
*********************************************************************/

