/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: tzadlo
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Door
//!	Generated Date	: Sat, 12, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/Door.java
*********************************************************************/

package Building;

//## auto_generated
import java.util.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.timeouts.*;

//----------------------------------------------------------------------------
// Building/Door.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class Door 
public class Door implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected int isClosed;		//## attribute isClosed 
    
    protected int isOpened;		//## attribute isOpened 
    
    protected int itsNumber;		//## attribute itsNumber 
    
    protected Car itsCar;		//## link itsCar 
    
    protected Car itsCar_1;		//## link itsCar_1 
    
    protected Floor itsFloor;		//## link itsFloor 
    
    protected SafetyControl itsSafetyControl;		//## link itsSafetyControl 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Opened=1;
    public static final int Closed=2;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  Door(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
    }
    
    //## operation closeDoor() 
    public void closeDoor() {
        //#[ operation closeDoor() 
        //#]
    }
    
    //## operation openDoor() 
    public void openDoor() {
        //#[ operation openDoor() 
        //#]
    }
    
    //## auto_generated 
    public int getIsClosed() {
        return isClosed;
    }
    
    //## auto_generated 
    public void setIsClosed(int p_isClosed) {
        isClosed = p_isClosed;
    }
    
    //## auto_generated 
    public int getIsOpened() {
        return isOpened;
    }
    
    //## auto_generated 
    public void setIsOpened(int p_isOpened) {
        isOpened = p_isOpened;
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
                itsFloor._removeItsDoor(this);
            }
        __setItsFloor(p_Floor);
    }
    
    //## auto_generated 
    public void setItsFloor(Floor p_Floor) {
        if(p_Floor != null)
            {
                p_Floor._addItsDoor(this);
            }
        _setItsFloor(p_Floor);
    }
    
    //## auto_generated 
    public void _clearItsFloor() {
        itsFloor = null;
    }
    
    //## auto_generated 
    public SafetyControl getItsSafetyControl() {
        return itsSafetyControl;
    }
    
    //## auto_generated 
    public void __setItsSafetyControl(SafetyControl p_SafetyControl) {
        itsSafetyControl = p_SafetyControl;
    }
    
    //## auto_generated 
    public void _setItsSafetyControl(SafetyControl p_SafetyControl) {
        if(itsSafetyControl != null)
            {
                itsSafetyControl.__setItsDoor(null);
            }
        __setItsSafetyControl(p_SafetyControl);
    }
    
    //## auto_generated 
    public void setItsSafetyControl(SafetyControl p_SafetyControl) {
        if(p_SafetyControl != null)
            {
                p_SafetyControl._setItsDoor(this);
            }
        _setItsSafetyControl(p_SafetyControl);
    }
    
    //## auto_generated 
    public void _clearItsSafetyControl() {
        itsSafetyControl = null;
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case Opened:
                {
                    res = Opened_takeEvent(id);
                }
                break;
                case Closed:
                {
                    res = Closed_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void Closed_exit() {
            popNullConfig();
            ClosedExit();
        }
        
        //## statechart_method 
        public int Closed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = ClosedTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int OpenedTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Opened_exit();
            //#[ transition 2 
            tm(doorTimer)
             or closeDoor();
            //#]
            Closed_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void OpenedEnter() {
        }
        
        //## statechart_method 
        public void Opened_entDef() {
            Opened_enter();
        }
        
        //## statechart_method 
        public int ClosedTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Closed_exit();
            //#[ transition 1 
            openDoor();
            //#]
            Opened_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void Closed_entDef() {
            Closed_enter();
        }
        
        //## statechart_method 
        public void Opened_exit() {
            popNullConfig();
            OpenedExit();
        }
        
        //## statechart_method 
        public void OpenedExit() {
        }
        
        //## statechart_method 
        public void ClosedExit() {
        }
        
        //## statechart_method 
        public void rootState_exit() {
            switch (rootState_subState) {
                case Opened:
                {
                    Opened_exit();
                }
                break;
                case Closed:
                {
                    Closed_exit();
                }
                break;
                default:
                    break;
            }
            rootState_subState = RiJNonState;
            rootStateExit();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            Closed_entDef();
        }
        
        //## statechart_method 
        public void Closed_enter() {
            pushNullConfig();
            rootState_subState = Closed;
            rootState_active = Closed;
            ClosedEnter();
        }
        
        //## statechart_method 
        public int Opened_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = OpenedTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void ClosedEnter() {
        }
        
        //## statechart_method 
        public void Opened_enter() {
            pushNullConfig();
            rootState_subState = Opened;
            rootState_active = Opened;
            OpenedEnter();
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/Door.java
*********************************************************************/

