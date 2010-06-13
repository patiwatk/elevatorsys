/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: lisher
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Car
//!	Generated Date	: Sun, 13, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/Car.java
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
// Building/Car.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class Car 
public class Car implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected int itsNumber;		//## attribute itsNumber 
    
    protected CarButtonsControl itsCarButtonsControl;		//## link itsCarButtonsControl 
    
    protected CarButtonsControl itsCarButtonsControl_1;		//## link itsCarButtonsControl_1 
    
    protected CarPositionControl itsCarPositionControl;		//## link itsCarPositionControl 
    
    protected CarPositionControl itsCarPositionControl_1;		//## link itsCarPositionControl_1 
    
    protected Dispatcher itsDispatcher;		//## link itsDispatcher 
    
    protected Door itsDoor;		//## link itsDoor 
    
    protected Door itsDoor_1;		//## link itsDoor_1 
    
    protected Engine itsEngine;		//## link itsEngine 
    
    protected Engine itsEngine_1;		//## link itsEngine_1 
    
    protected LinkedList<SafetyControl> itsSafetyControl;		//## link itsSafetyControl 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Opening_Door=1;
    public static final int Idle=2;
    public static final int Driving=3;
    public static final int Stopping_Car=4;
    public static final int Drive_Up=5;
    public static final int Drive_Down=6;
    public static final int Check_Direction=7;
    public static final int Closing_Door=8;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    protected int Driving_subState;		//## ignore 
    
    
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
    public  Car(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
        {
            itsSafetyControl = new LinkedList<SafetyControl>();
        }
    }
    
    //## operation checkSafety() 
    public void checkSafety() {
        //#[ operation checkSafety() 
        //#]
    }
    
    //## operation driveToFloor() 
    public void driveToFloor() {
        //#[ operation driveToFloor() 
        //#]
    }
    
    //## operation lockElevator() 
    public void lockElevator() {
        //#[ operation lockElevator() 
        //#]
    }
    
    //## operation stopAtFloor(int) 
    public void stopAtFloor(int floor) {
        //#[ operation stopAtFloor(int) 
        //#]
    }
    
    //## operation unlockElevator() 
    public void unlockElevator() {
        //#[ operation unlockElevator() 
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
    public CarButtonsControl getItsCarButtonsControl() {
        return itsCarButtonsControl;
    }
    
    //## auto_generated 
    public void __setItsCarButtonsControl(CarButtonsControl p_CarButtonsControl) {
        itsCarButtonsControl = p_CarButtonsControl;
    }
    
    //## auto_generated 
    public void _setItsCarButtonsControl(CarButtonsControl p_CarButtonsControl) {
        if(itsCarButtonsControl != null)
            {
                itsCarButtonsControl.__setItsCar(null);
            }
        __setItsCarButtonsControl(p_CarButtonsControl);
    }
    
    //## auto_generated 
    public void setItsCarButtonsControl(CarButtonsControl p_CarButtonsControl) {
        if(p_CarButtonsControl != null)
            {
                p_CarButtonsControl._setItsCar(this);
            }
        _setItsCarButtonsControl(p_CarButtonsControl);
    }
    
    //## auto_generated 
    public void _clearItsCarButtonsControl() {
        itsCarButtonsControl = null;
    }
    
    //## auto_generated 
    public CarButtonsControl getItsCarButtonsControl_1() {
        return itsCarButtonsControl_1;
    }
    
    //## auto_generated 
    public void __setItsCarButtonsControl_1(CarButtonsControl p_CarButtonsControl) {
        itsCarButtonsControl_1 = p_CarButtonsControl;
    }
    
    //## auto_generated 
    public void _setItsCarButtonsControl_1(CarButtonsControl p_CarButtonsControl) {
        if(itsCarButtonsControl_1 != null)
            {
                itsCarButtonsControl_1.__setItsCar_1(null);
            }
        __setItsCarButtonsControl_1(p_CarButtonsControl);
    }
    
    //## auto_generated 
    public void setItsCarButtonsControl_1(CarButtonsControl p_CarButtonsControl) {
        if(p_CarButtonsControl != null)
            {
                p_CarButtonsControl._setItsCar_1(this);
            }
        _setItsCarButtonsControl_1(p_CarButtonsControl);
    }
    
    //## auto_generated 
    public void _clearItsCarButtonsControl_1() {
        itsCarButtonsControl_1 = null;
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
                itsEngine_1.__setItsCar_1(null);
            }
        __setItsEngine_1(p_Engine);
    }
    
    //## auto_generated 
    public void setItsEngine_1(Engine p_Engine) {
        if(p_Engine != null)
            {
                p_Engine._setItsCar_1(this);
            }
        _setItsEngine_1(p_Engine);
    }
    
    //## auto_generated 
    public void _clearItsEngine_1() {
        itsEngine_1 = null;
    }
    
    //## auto_generated 
    public ListIterator<SafetyControl> getItsSafetyControl() {
        ListIterator<SafetyControl> iter = itsSafetyControl.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsSafetyControl(SafetyControl p_SafetyControl) {
        itsSafetyControl.add(p_SafetyControl);
    }
    
    //## auto_generated 
    public void addItsSafetyControl(SafetyControl p_SafetyControl) {
        if(p_SafetyControl != null)
            {
                p_SafetyControl._setItsCar(this);
            }
        _addItsSafetyControl(p_SafetyControl);
    }
    
    //## auto_generated 
    public void _removeItsSafetyControl(SafetyControl p_SafetyControl) {
        itsSafetyControl.remove(p_SafetyControl);
    }
    
    //## auto_generated 
    public void removeItsSafetyControl(SafetyControl p_SafetyControl) {
        if(p_SafetyControl != null)
            {
                p_SafetyControl.__setItsCar(null);
            }
        _removeItsSafetyControl(p_SafetyControl);
    }
    
    //## auto_generated 
    public void _clearItsSafetyControl() {
        itsSafetyControl.clear();
    }
    
    //## auto_generated 
    public void clearItsSafetyControl() {
        ListIterator<SafetyControl> iter = itsSafetyControl.listIterator();
        while (iter.hasNext()){
            (itsSafetyControl.get(iter.nextIndex()))._clearItsCar();
            iter.next();
        }
        _clearItsSafetyControl();
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
            if(Driving_subState == state)
                {
                    return true;
                }
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
                case Check_Direction:
                {
                    res = Check_Direction_takeEvent(id);
                }
                break;
                case Drive_Up:
                {
                    res = Drive_Up_takeEvent(id);
                }
                break;
                case Drive_Down:
                {
                    res = Drive_Down_takeEvent(id);
                }
                break;
                case Stopping_Car:
                {
                    res = Stopping_Car_takeEvent(id);
                }
                break;
                case Opening_Door:
                {
                    res = Opening_Door_takeEvent(id);
                }
                break;
                case Closing_Door:
                {
                    res = Closing_Door_takeEvent(id);
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
            Driving_subState = RiJNonState;
        }
        
        //## statechart_method 
        public void Drive_UpEnter() {
        }
        
        //## statechart_method 
        public int Check_DirectionTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(TRUE)
                {
                    Check_Direction_exit();
                    //#[ transition 2 
                    startCar() - tm(accCarTimer);
                    //#]
                    //#[ transition 4 
                    else;
                    //#]
                    Drive_Down_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Closing_Door_enter() {
            pushNullConfig();
            rootState_subState = Closing_Door;
            rootState_active = Closing_Door;
            Closing_DoorEnter();
        }
        
        //## statechart_method 
        public void Drive_Down_entDef() {
            Drive_Down_enter();
        }
        
        //## statechart_method 
        public void Stopping_CarExit() {
        }
        
        //## statechart_method 
        public int Opening_DoorTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(TRUE)
                {
                    Opening_Door_exit();
                    //#[ transition 12 
                    tm(doorTimer);
                    //#]
                    //#[ transition 14 
                    else;
                    //#]
                    Opening_Door_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Check_DirectionExit() {
        }
        
        //## statechart_method 
        public void Check_DirectionEnter() {
        }
        
        //## statechart_method 
        public int Drive_Up_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Drive_UpTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Driving_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void Drive_Up_exit() {
            popNullConfig();
            Drive_UpExit();
        }
        
        //## statechart_method 
        public void Stopping_CarEnter() {
        }
        
        //## statechart_method 
        public void Driving_enter() {
            rootState_subState = Driving;
            DrivingEnter();
        }
        
        //## statechart_method 
        public void DrivingEnter() {
        }
        
        //## statechart_method 
        public void Opening_Door_enter() {
            pushNullConfig();
            rootState_subState = Opening_Door;
            rootState_active = Opening_Door;
            Opening_DoorEnter();
        }
        
        //## statechart_method 
        public void Drive_UpExit() {
        }
        
        //## statechart_method 
        public int IdleTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(TRUE)
                {
                    Idle_exit();
                    //#[ transition 20 
                    newAction();
                    //#]
                    //#[ transition 22 
                    else;
                    //#]
                    Opening_Door_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
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
        public void Opening_DoorEnter() {
        }
        
        //## statechart_method 
        public void Check_Direction_exit() {
            popNullConfig();
            Check_DirectionExit();
        }
        
        //## statechart_method 
        public int Drive_DownTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(TRUE)
                {
                    Drive_Down_exit();
                    //#[ transition 6 
                    checkFloor();
                    //#]
                    //#[ transition 10 
                    else 
                    tm(oneFloorTimer);
                    //#]
                    Drive_Down_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Drive_Up_enter() {
            pushNullConfig();
            Driving_subState = Drive_Up;
            rootState_active = Drive_Up;
            Drive_UpEnter();
        }
        
        //## statechart_method 
        public void Stopping_Car_exit() {
            popNullConfig();
            Stopping_CarExit();
        }
        
        //## statechart_method 
        public void Driving_exit() {
            switch (Driving_subState) {
                case Check_Direction:
                {
                    Check_Direction_exit();
                }
                break;
                case Drive_Up:
                {
                    Drive_Up_exit();
                }
                break;
                case Drive_Down:
                {
                    Drive_Down_exit();
                }
                break;
                case Stopping_Car:
                {
                    Stopping_Car_exit();
                }
                break;
                default:
                    break;
            }
            Driving_subState = RiJNonState;
            DrivingExit();
        }
        
        //## statechart_method 
        public void Opening_DoorExit() {
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Closing_Door_entDef() {
            Closing_Door_enter();
        }
        
        //## statechart_method 
        public void Check_Direction_enter() {
            pushNullConfig();
            Driving_subState = Check_Direction;
            rootState_active = Check_Direction;
            Check_DirectionEnter();
        }
        
        //## statechart_method 
        public void IdleExit() {
        }
        
        //## statechart_method 
        public void Idle_entDef() {
            Idle_enter();
        }
        
        //## statechart_method 
        public void Closing_DoorEnter() {
        }
        
        //## statechart_method 
        public void Stopping_Car_entDef() {
            Stopping_Car_enter();
        }
        
        //## statechart_method 
        public void Opening_Door_exit() {
            popNullConfig();
            Opening_DoorExit();
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public int Check_Direction_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Check_DirectionTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Driving_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void Driving_entDef() {
            Driving_enter();
            
            Check_Direction_entDef();
        }
        
        //## statechart_method 
        public int Closing_Door_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Closing_DoorTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Closing_DoorTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(TRUE)
                {
                    if(TRUE)
                        {
                            Closing_Door_exit();
                            //#[ transition 15 
                            tm(doorClosingTimer);
                            //#]
                            //#[ transition 17 
                            else;
                            //#]
                            //#[ transition 19 
                            else;
                            //#]
                            Idle_entDef();
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void Drive_DownEnter() {
        }
        
        //## statechart_method 
        public void Drive_Up_entDef() {
            Drive_Up_enter();
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public void Closing_Door_exit() {
            popNullConfig();
            Closing_DoorExit();
        }
        
        //## statechart_method 
        public int Drive_Down_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Drive_DownTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Driving_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int Stopping_Car_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Stopping_CarTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Driving_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int Opening_Door_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Opening_DoorTakeNull();
                }
            
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
                case Driving:
                {
                    Driving_exit();
                }
                break;
                case Opening_Door:
                {
                    Opening_Door_exit();
                }
                break;
                case Closing_Door:
                {
                    Closing_Door_exit();
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
        public void Drive_Down_enter() {
            pushNullConfig();
            Driving_subState = Drive_Down;
            rootState_active = Drive_Down;
            Drive_DownEnter();
        }
        
        //## statechart_method 
        public void DrivingExit() {
        }
        
        //## statechart_method 
        public void Closing_DoorExit() {
        }
        
        //## statechart_method 
        public void Drive_Down_exit() {
            popNullConfig();
            Drive_DownExit();
        }
        
        //## statechart_method 
        public int Stopping_CarTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Driving_exit();
            //#[ transition 11 
            carAtFloor()
            tm(slowingDownTimer);
            //#]
            Opening_Door_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Stopping_Car_enter() {
            pushNullConfig();
            Driving_subState = Stopping_Car;
            rootState_active = Stopping_Car;
            Stopping_CarEnter();
        }
        
        //## statechart_method 
        public void Idle_exit() {
            popNullConfig();
            IdleExit();
        }
        
        //## statechart_method 
        public void Opening_Door_entDef() {
            Opening_Door_enter();
        }
        
        //## statechart_method 
        public void Check_Direction_entDef() {
            Check_Direction_enter();
        }
        
        //## statechart_method 
        public int Driving_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Drive_DownExit() {
        }
        
        //## statechart_method 
        public int Drive_UpTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(TRUE)
                {
                    Drive_Up_exit();
                    //#[ transition 5 
                    checkFloor();
                    //#]
                    //#[ transition 9 
                    else - tm(oneFloorTimer);
                    //#]
                    Drive_Up_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/Car.java
*********************************************************************/

