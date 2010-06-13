/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: lisher
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Dispatcher
//!	Generated Date	: Sun, 13, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/Dispatcher.java
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
// Building/Dispatcher.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class Dispatcher 
public class Dispatcher implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected Call itsCall;		//## link itsCall 
    
    protected ArrayList<Call> itsCall_1;		//## link itsCall_1 
    
    protected ArrayList<Car> itsCar;		//## link itsCar 
    
    protected Engine itsEngine;		//## link itsEngine 
    
    protected ArrayList<Floor> itsFloor;		//## link itsFloor 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Running=1;
    public static final int Managing_Cars=2;
    public static final int Dispatching_Car=3;
    public static final int Awaiting_Cars_Update=4;
    public static final int Idle=5;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    protected int Running_subState;		//## ignore 
    
    
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
    public  Dispatcher(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
        {
            itsCall_1 = new ArrayList<Call>();
        }
        {
            itsCar = new ArrayList<Car>();
        }
        {
            itsFloor = new ArrayList<Floor>();
        }
    }
    
    //## operation callUpdate() 
    public void callUpdate() {
        //#[ operation callUpdate() 
        //#]
    }
    
    //## operation carUpdate() 
    public void carUpdate() {
        //#[ operation carUpdate() 
        //#]
    }
    
    //## operation insideButtonPress() 
    public void insideButtonPress() {
        //#[ operation insideButtonPress() 
        //#]
    }
    
    //## TriggeredOperation sendCar() 
    public void sendCar() {
        sendCar_Dispatcher_Event triggerEvent = new sendCar_Dispatcher_Event();
        reactive.takeTrigger(triggerEvent);
    }
    
    //## auto_generated 
    public Call getItsCall() {
        return itsCall;
    }
    
    //## auto_generated 
    public void __setItsCall(Call p_Call) {
        itsCall = p_Call;
    }
    
    //## auto_generated 
    public void _setItsCall(Call p_Call) {
        if(itsCall != null)
            {
                itsCall.__setItsDispatcher(null);
            }
        __setItsCall(p_Call);
    }
    
    //## auto_generated 
    public void setItsCall(Call p_Call) {
        if(p_Call != null)
            {
                p_Call._setItsDispatcher(this);
            }
        _setItsCall(p_Call);
    }
    
    //## auto_generated 
    public void _clearItsCall() {
        itsCall = null;
    }
    
    //## auto_generated 
    public ListIterator<Call> getItsCall_1() {
        ListIterator<Call> iter = itsCall_1.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsCall_1(Call p_Call) {
        itsCall_1.add(0, p_Call);
    }
    
    //## auto_generated 
    public void addItsCall_1(Call p_Call) {
        if(p_Call != null)
            {
                p_Call._setItsDispatcher_1(this);
            }
        _addItsCall_1(p_Call);
    }
    
    //## auto_generated 
    public void _removeItsCall_1(Call p_Call) {
        itsCall_1.remove(p_Call);
    }
    
    //## auto_generated 
    public void removeItsCall_1(Call p_Call) {
        if(p_Call != null)
            {
                p_Call.__setItsDispatcher_1(null);
            }
        _removeItsCall_1(p_Call);
    }
    
    //## auto_generated 
    public void _clearItsCall_1() {
        itsCall_1.clear();
    }
    
    //## auto_generated 
    public void clearItsCall_1() {
        ListIterator<Call> iter = itsCall_1.listIterator();
        while (iter.hasNext()){
            (itsCall_1.get(iter.nextIndex()))._clearItsDispatcher_1();
            iter.next();
        }
        _clearItsCall_1();
    }
    
    //## auto_generated 
    public ListIterator<Car> getItsCar() {
        ListIterator<Car> iter = itsCar.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsCar(Car p_Car) {
        itsCar.add(0, p_Car);
    }
    
    //## auto_generated 
    public void addItsCar(Car p_Car) {
        if(p_Car != null)
            {
                p_Car._setItsDispatcher(this);
            }
        _addItsCar(p_Car);
    }
    
    //## auto_generated 
    public void _removeItsCar(Car p_Car) {
        itsCar.remove(p_Car);
    }
    
    //## auto_generated 
    public void removeItsCar(Car p_Car) {
        if(p_Car != null)
            {
                p_Car.__setItsDispatcher(null);
            }
        _removeItsCar(p_Car);
    }
    
    //## auto_generated 
    public void _clearItsCar() {
        itsCar.clear();
    }
    
    //## auto_generated 
    public void clearItsCar() {
        ListIterator<Car> iter = itsCar.listIterator();
        while (iter.hasNext()){
            (itsCar.get(iter.nextIndex()))._clearItsDispatcher();
            iter.next();
        }
        _clearItsCar();
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
                itsEngine.__setItsDispatcher(null);
            }
        __setItsEngine(p_Engine);
    }
    
    //## auto_generated 
    public void setItsEngine(Engine p_Engine) {
        if(p_Engine != null)
            {
                p_Engine._setItsDispatcher(this);
            }
        _setItsEngine(p_Engine);
    }
    
    //## auto_generated 
    public void _clearItsEngine() {
        itsEngine = null;
    }
    
    //## auto_generated 
    public ListIterator<Floor> getItsFloor() {
        ListIterator<Floor> iter = itsFloor.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsFloor(Floor p_Floor) {
        itsFloor.add(0, p_Floor);
    }
    
    //## auto_generated 
    public void addItsFloor(Floor p_Floor) {
        if(p_Floor != null)
            {
                p_Floor._setItsDispatcher(this);
            }
        _addItsFloor(p_Floor);
    }
    
    //## auto_generated 
    public void _removeItsFloor(Floor p_Floor) {
        itsFloor.remove(p_Floor);
    }
    
    //## auto_generated 
    public void removeItsFloor(Floor p_Floor) {
        if(p_Floor != null)
            {
                p_Floor.__setItsDispatcher(null);
            }
        _removeItsFloor(p_Floor);
    }
    
    //## auto_generated 
    public void _clearItsFloor() {
        itsFloor.clear();
    }
    
    //## auto_generated 
    public void clearItsFloor() {
        ListIterator<Floor> iter = itsFloor.listIterator();
        while (iter.hasNext()){
            (itsFloor.get(iter.nextIndex()))._clearItsDispatcher();
            iter.next();
        }
        _clearItsFloor();
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
            if(Running_subState == state)
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
                case Awaiting_Cars_Update:
                {
                    res = Awaiting_Cars_Update_takeEvent(id);
                }
                break;
                case Dispatching_Car:
                {
                    res = Dispatching_Car_takeEvent(id);
                }
                break;
                case Managing_Cars:
                {
                    res = Managing_Cars_takeEvent(id);
                }
                break;
                case Idle:
                {
                    res = Idle_takeEvent(id);
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
            Running_subState = RiJNonState;
        }
        
        //## statechart_method 
        public int Managing_Cars_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Managing_CarsTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Running_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void Managing_Cars_exit() {
            popNullConfig();
            Managing_CarsExit();
        }
        
        //## statechart_method 
        public int Running_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int Managing_CarsTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(TRUE)
                {
                    Managing_Cars_exit();
                    //#[ transition 2 
                    chooseCar();
                    //#]
                    //#[ transition 4 
                    if optimal car id = -1;
                    //#]
                    Awaiting_Cars_Update_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Managing_Cars_entDef() {
            Managing_Cars_enter();
        }
        
        //## statechart_method 
        public void Awaiting_Cars_UpdateExit() {
        }
        
        //## statechart_method 
        public void RunningExit() {
        }
        
        //## statechart_method 
        public void Running_entDef() {
            Running_enter();
            
            Managing_Cars_entDef();
        }
        
        //## statechart_method 
        public int IdleTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Idle_exit();
            //#[ transition 0 
            callCar();
            //#]
            Running_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int Awaiting_Cars_Update_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Awaiting_Cars_UpdateTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Running_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void Managing_Cars_enter() {
            pushNullConfig();
            Running_subState = Managing_Cars;
            rootState_active = Managing_Cars;
            Managing_CarsEnter();
        }
        
        //## statechart_method 
        public void RunningEnter() {
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
        public void Awaiting_Cars_Update_entDef() {
            Awaiting_Cars_Update_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void IdleExit() {
        }
        
        //## statechart_method 
        public void Idle_entDef() {
            Idle_enter();
        }
        
        //## statechart_method 
        public void Running_exit() {
            switch (Running_subState) {
                case Awaiting_Cars_Update:
                {
                    Awaiting_Cars_Update_exit();
                }
                break;
                case Dispatching_Car:
                {
                    Dispatching_Car_exit();
                }
                break;
                case Managing_Cars:
                {
                    Managing_Cars_exit();
                }
                break;
                default:
                    break;
            }
            Running_subState = RiJNonState;
            RunningExit();
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public int Awaiting_Cars_UpdateTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Awaiting_Cars_Update_exit();
            //#[ transition 5 
            carUpdate();
            //#]
            Managing_Cars_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Awaiting_Cars_UpdateEnter() {
        }
        
        //## statechart_method 
        public void IdleEnter() {
        }
        
        //## statechart_method 
        public void Dispatching_CarExit() {
        }
        
        //## statechart_method 
        public void Dispatching_Car_entDef() {
            Dispatching_Car_enter();
        }
        
        //## statechart_method 
        public void rootState_exit() {
            switch (rootState_subState) {
                case Running:
                {
                    Running_exit();
                }
                break;
                case Idle:
                {
                    Idle_exit();
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
        public void Awaiting_Cars_Update_exit() {
            popNullConfig();
            Awaiting_Cars_UpdateExit();
        }
        
        //## statechart_method 
        public void Dispatching_CarEnter() {
        }
        
        //## statechart_method 
        public void Idle_exit() {
            popNullConfig();
            IdleExit();
        }
        
        //## statechart_method 
        public int Dispatching_Car_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = Dispatching_CarTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Running_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int Dispatching_CarTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Running_exit();
            //#[ transition 6 
            sendCar();
            //#]
            Idle_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Managing_CarsExit() {
        }
        
        //## statechart_method 
        public void Running_enter() {
            rootState_subState = Running;
            RunningEnter();
        }
        
        //## statechart_method 
        public void Awaiting_Cars_Update_enter() {
            pushNullConfig();
            Running_subState = Awaiting_Cars_Update;
            rootState_active = Awaiting_Cars_Update;
            Awaiting_Cars_UpdateEnter();
        }
        
        //## statechart_method 
        public void Managing_CarsEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Dispatching_Car_exit() {
            popNullConfig();
            Dispatching_CarExit();
        }
        
        //## statechart_method 
        public void Dispatching_Car_enter() {
            pushNullConfig();
            Running_subState = Dispatching_Car;
            rootState_active = Dispatching_Car;
            Dispatching_CarEnter();
        }
        
    }
}
//## ignore 
class sendCar_Dispatcher_Event extends RiJEvent {
    
    public static final int sendCar_Dispatcher_Event_id = 31000;
    
    // Constructors
    
    public  sendCar_Dispatcher_Event() {
        lId = sendCar_Dispatcher_Event_id;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/Dispatcher.java
*********************************************************************/

