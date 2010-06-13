/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: tzadlo
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Engine
//!	Generated Date	: Sat, 12, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/Engine.java
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
// Building/Engine.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class Engine 
public class Engine implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected int line;		//## attribute line 
    
    protected int speed;		//## attribute speed 
    
    protected Car itsCar;		//## link itsCar 
    
    protected Car itsCar_1;		//## link itsCar_1 
    
    protected Dispatcher itsDispatcher;		//## link itsDispatcher 
    
    protected SafetyControl itsSafetyControl;		//## link itsSafetyControl 
    
    protected SafetyControl itsSafetyControl_1;		//## link itsSafetyControl_1 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Stopped=1;
    public static final int Running=2;
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
    public  Engine(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
    }
    
    //## operation start() 
    public void start() {
        //#[ operation start() 
        //#]
    }
    
    //## operation stop() 
    public void stop() {
        //#[ operation stop() 
        //#]
    }
    
    //## auto_generated 
    public int getLine() {
        return line;
    }
    
    //## auto_generated 
    public void setLine(int p_line) {
        line = p_line;
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
                itsCar_1.__setItsEngine_1(null);
            }
        __setItsCar_1(p_Car);
    }
    
    //## auto_generated 
    public void setItsCar_1(Car p_Car) {
        if(p_Car != null)
            {
                p_Car._setItsEngine_1(this);
            }
        _setItsCar_1(p_Car);
    }
    
    //## auto_generated 
    public void _clearItsCar_1() {
        itsCar_1 = null;
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
                itsDispatcher.__setItsEngine(null);
            }
        __setItsDispatcher(p_Dispatcher);
    }
    
    //## auto_generated 
    public void setItsDispatcher(Dispatcher p_Dispatcher) {
        if(p_Dispatcher != null)
            {
                p_Dispatcher._setItsEngine(this);
            }
        _setItsDispatcher(p_Dispatcher);
    }
    
    //## auto_generated 
    public void _clearItsDispatcher() {
        itsDispatcher = null;
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
                itsSafetyControl.__setItsEngine_1(null);
            }
        __setItsSafetyControl(p_SafetyControl);
    }
    
    //## auto_generated 
    public void setItsSafetyControl(SafetyControl p_SafetyControl) {
        if(p_SafetyControl != null)
            {
                p_SafetyControl._setItsEngine_1(this);
            }
        _setItsSafetyControl(p_SafetyControl);
    }
    
    //## auto_generated 
    public void _clearItsSafetyControl() {
        itsSafetyControl = null;
    }
    
    //## auto_generated 
    public SafetyControl getItsSafetyControl_1() {
        return itsSafetyControl_1;
    }
    
    //## auto_generated 
    public void __setItsSafetyControl_1(SafetyControl p_SafetyControl) {
        itsSafetyControl_1 = p_SafetyControl;
    }
    
    //## auto_generated 
    public void _setItsSafetyControl_1(SafetyControl p_SafetyControl) {
        if(itsSafetyControl_1 != null)
            {
                itsSafetyControl_1.__setItsEngine(null);
            }
        __setItsSafetyControl_1(p_SafetyControl);
    }
    
    //## auto_generated 
    public void setItsSafetyControl_1(SafetyControl p_SafetyControl) {
        if(p_SafetyControl != null)
            {
                p_SafetyControl._setItsEngine(this);
            }
        _setItsSafetyControl_1(p_SafetyControl);
    }
    
    //## auto_generated 
    public void _clearItsSafetyControl_1() {
        itsSafetyControl_1 = null;
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
                case Stopped:
                {
                    res = Stopped_takeEvent(id);
                }
                break;
                case Running:
                {
                    res = Running_takeEvent(id);
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
        public int Running_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = RunningTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void StoppedEnter() {
        }
        
        //## statechart_method 
        public void RunningExit() {
        }
        
        //## statechart_method 
        public void Running_entDef() {
            Running_enter();
        }
        
        //## statechart_method 
        public void RunningEnter() {
        }
        
        //## statechart_method 
        public void Stopped_exit() {
            popNullConfig();
            StoppedExit();
        }
        
        //## statechart_method 
        public void Stopped_enter() {
            pushNullConfig();
            rootState_subState = Stopped;
            rootState_active = Stopped;
            StoppedEnter();
        }
        
        //## statechart_method 
        public void Stopped_entDef() {
            Stopped_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Running_exit() {
            popNullConfig();
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
        public void rootState_exit() {
            switch (rootState_subState) {
                case Stopped:
                {
                    Stopped_exit();
                }
                break;
                case Running:
                {
                    Running_exit();
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
            Stopped_entDef();
        }
        
        //## statechart_method 
        public int RunningTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Running_exit();
            //#[ transition 2 
            stop();
            //#]
            Stopped_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void StoppedExit() {
        }
        
        //## statechart_method 
        public void Running_enter() {
            pushNullConfig();
            rootState_subState = Running;
            rootState_active = Running;
            RunningEnter();
        }
        
        //## statechart_method 
        public int StoppedTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Stopped_exit();
            //#[ transition 1 
            start();
            //#]
            Running_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int Stopped_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = StoppedTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/Engine.java
*********************************************************************/

