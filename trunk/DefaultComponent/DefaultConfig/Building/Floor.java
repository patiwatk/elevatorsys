/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: lisher
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Floor
//!	Generated Date	: Sun, 13, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/Floor.java
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
// Building/Floor.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class Floor 
public class Floor implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected int itsNumber;		//## attribute itsNumber 
    
    protected Dispatcher itsDispatcher;		//## link itsDispatcher 
    
    protected ArrayList<Door> itsDoor;		//## link itsDoor 
    
    protected FloorButtonsControl itsFloorButtonsControl;		//## link itsFloorButtonsControl 
    
    protected FloorButtonsControl itsFloorButtonsControl_1;		//## link itsFloorButtonsControl_1 
    
    protected FloorButtonsControl itsFloorButtonsControl_2;		//## link itsFloorButtonsControl_2 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Opening_door=1;
    public static final int Idle=2;
    public static final int Closing_door=3;
    public static final int Awaits_Car_Arrival=4;
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
    public  Floor(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
        {
            itsDoor = new ArrayList<Door>();
        }
    }
    
    //## operation callCar() 
    public void callCar() {
        //#[ operation callCar() 
        //#]
    }
    
    //## operation floorVisited() 
    public void floorVisited() {
        //#[ operation floorVisited() 
        //#]
    }
    
    //## operation isPassanger() 
    public boolean isPassanger() {
        //#[ operation isPassanger() 
        //#]
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
    public ListIterator<Door> getItsDoor() {
        ListIterator<Door> iter = itsDoor.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsDoor(Door p_Door) {
        itsDoor.add(0, p_Door);
    }
    
    //## auto_generated 
    public void addItsDoor(Door p_Door) {
        if(p_Door != null)
            {
                p_Door._setItsFloor(this);
            }
        _addItsDoor(p_Door);
    }
    
    //## auto_generated 
    public void _removeItsDoor(Door p_Door) {
        itsDoor.remove(p_Door);
    }
    
    //## auto_generated 
    public void removeItsDoor(Door p_Door) {
        if(p_Door != null)
            {
                p_Door.__setItsFloor(null);
            }
        _removeItsDoor(p_Door);
    }
    
    //## auto_generated 
    public void _clearItsDoor() {
        itsDoor.clear();
    }
    
    //## auto_generated 
    public void clearItsDoor() {
        ListIterator<Door> iter = itsDoor.listIterator();
        while (iter.hasNext()){
            (itsDoor.get(iter.nextIndex()))._clearItsFloor();
            iter.next();
        }
        _clearItsDoor();
    }
    
    //## auto_generated 
    public FloorButtonsControl getItsFloorButtonsControl() {
        return itsFloorButtonsControl;
    }
    
    //## auto_generated 
    public void setItsFloorButtonsControl(FloorButtonsControl p_FloorButtonsControl) {
        itsFloorButtonsControl = p_FloorButtonsControl;
    }
    
    //## auto_generated 
    public FloorButtonsControl getItsFloorButtonsControl_1() {
        return itsFloorButtonsControl_1;
    }
    
    //## auto_generated 
    public void setItsFloorButtonsControl_1(FloorButtonsControl p_FloorButtonsControl) {
        itsFloorButtonsControl_1 = p_FloorButtonsControl;
    }
    
    //## auto_generated 
    public FloorButtonsControl getItsFloorButtonsControl_2() {
        return itsFloorButtonsControl_2;
    }
    
    //## auto_generated 
    public void __setItsFloorButtonsControl_2(FloorButtonsControl p_FloorButtonsControl) {
        itsFloorButtonsControl_2 = p_FloorButtonsControl;
    }
    
    //## auto_generated 
    public void _setItsFloorButtonsControl_2(FloorButtonsControl p_FloorButtonsControl) {
        if(itsFloorButtonsControl_2 != null)
            {
                itsFloorButtonsControl_2.__setItsFloor(null);
            }
        __setItsFloorButtonsControl_2(p_FloorButtonsControl);
    }
    
    //## auto_generated 
    public void setItsFloorButtonsControl_2(FloorButtonsControl p_FloorButtonsControl) {
        if(p_FloorButtonsControl != null)
            {
                p_FloorButtonsControl._setItsFloor(this);
            }
        _setItsFloorButtonsControl_2(p_FloorButtonsControl);
    }
    
    //## auto_generated 
    public void _clearItsFloorButtonsControl_2() {
        itsFloorButtonsControl_2 = null;
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
                case Idle:
                {
                    res = Idle_takeEvent(id);
                }
                break;
                case Awaits_Car_Arrival:
                {
                    res = Awaits_Car_Arrival_takeEvent(id);
                }
                break;
                case Opening_door:
                {
                    res = Opening_door_takeEvent(id);
                }
                break;
                case Closing_door:
                {
                    res = Closing_door_takeEvent(id);
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
        public int Awaits_Car_ArrivalTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Awaits_Car_Arrival_exit();
            //#[ transition 4 
            carArrival();
            //#]
            Opening_door_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Closing_door_entDef() {
            Closing_door_enter();
        }
        
        //## statechart_method 
        public void Opening_door_exit() {
            popNullConfig();
            Opening_doorExit();
        }
        
        //## statechart_method 
        public int Closing_door_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Closing_doorTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Closing_door_exit() {
            popNullConfig();
            Closing_doorExit();
        }
        
        //## statechart_method 
        public int Opening_door_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Opening_doorTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Closing_doorExit() {
        }
        
        //## statechart_method 
        public int Opening_doorTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Opening_door_exit();
            //#[ transition 5 
            tm(doorTimer);
            //#]
            Closing_door_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Awaits_Car_Arrival_enter() {
            pushNullConfig();
            rootState_subState = Awaits_Car_Arrival;
            rootState_active = Awaits_Car_Arrival;
            Awaits_Car_ArrivalEnter();
        }
        
        //## statechart_method 
        public int IdleTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(TRUE)
                {
                    Idle_exit();
                    //#[ transition 1 
                    keyPressed();
                    //#]
                    //#[ transition 3 
                    else;
                    //#]
                    Awaits_Car_Arrival_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int Awaits_Car_Arrival_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Awaits_Car_ArrivalTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Awaits_Car_ArrivalExit() {
        }
        
        //## statechart_method 
        public int Idle_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = IdleTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Idle_enter() {
            pushNullConfig();
            rootState_subState = Idle;
            rootState_active = Idle;
            IdleEnter();
        }
        
        //## statechart_method 
        public void Opening_door_entDef() {
            Opening_door_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Awaits_Car_ArrivalEnter() {
        }
        
        //## statechart_method 
        public void IdleExit() {
        }
        
        //## statechart_method 
        public void Idle_entDef() {
            Idle_enter();
        }
        
        //## statechart_method 
        public void Closing_door_enter() {
            pushNullConfig();
            rootState_subState = Closing_door;
            rootState_active = Closing_door;
            Closing_doorEnter();
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void Awaits_Car_Arrival_exit() {
            popNullConfig();
            Awaits_Car_ArrivalExit();
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public void Opening_door_enter() {
            pushNullConfig();
            rootState_subState = Opening_door;
            rootState_active = Opening_door;
            Opening_doorEnter();
        }
        
        //## statechart_method 
        public int Closing_doorTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Closing_door_exit();
            Idle_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootState_exit() {
            switch (rootState_subState) {
                case Idle:
                {
                    Idle_exit();
                }
                break;
                case Awaits_Car_Arrival:
                {
                    Awaits_Car_Arrival_exit();
                }
                break;
                case Opening_door:
                {
                    Opening_door_exit();
                }
                break;
                case Closing_door:
                {
                    Closing_door_exit();
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
            Idle_entDef();
        }
        
        //## statechart_method 
        public void Idle_exit() {
            popNullConfig();
            IdleExit();
        }
        
        //## statechart_method 
        public void Awaits_Car_Arrival_entDef() {
            Awaits_Car_Arrival_enter();
        }
        
        //## statechart_method 
        public void Opening_doorExit() {
        }
        
        //## statechart_method 
        public void Opening_doorEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Closing_doorEnter() {
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/Floor.java
*********************************************************************/

