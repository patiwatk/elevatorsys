/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: lisher
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Button
//!	Generated Date	: Sun, 13, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/Button.java
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
// Building/Button.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class Button 
public class Button implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected int ID;		//## attribute ID 
    
    protected CarButtonsControl itsCarButtonsControl;		//## link itsCarButtonsControl 
    
    protected FloorButtonsControl itsFloorButtonsControl;		//## link itsFloorButtonsControl 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Unpressed=1;
    public static final int Pressed=2;
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
    public  Button(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
    }
    
    //## TriggeredOperation onPress() 
    public void onPress() {
        onPress_Button_Event triggerEvent = new onPress_Button_Event();
        reactive.takeTrigger(triggerEvent);
    }
    
    //## auto_generated 
    public int getID() {
        return ID;
    }
    
    //## auto_generated 
    public void setID(int p_ID) {
        ID = p_ID;
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
                itsCarButtonsControl._removeItsButton(this);
            }
        __setItsCarButtonsControl(p_CarButtonsControl);
    }
    
    //## auto_generated 
    public void setItsCarButtonsControl(CarButtonsControl p_CarButtonsControl) {
        if(p_CarButtonsControl != null)
            {
                p_CarButtonsControl._addItsButton(this);
            }
        _setItsCarButtonsControl(p_CarButtonsControl);
    }
    
    //## auto_generated 
    public void _clearItsCarButtonsControl() {
        itsCarButtonsControl = null;
    }
    
    //## auto_generated 
    public FloorButtonsControl getItsFloorButtonsControl() {
        return itsFloorButtonsControl;
    }
    
    //## auto_generated 
    public void __setItsFloorButtonsControl(FloorButtonsControl p_FloorButtonsControl) {
        itsFloorButtonsControl = p_FloorButtonsControl;
    }
    
    //## auto_generated 
    public void _setItsFloorButtonsControl(FloorButtonsControl p_FloorButtonsControl) {
        if(itsFloorButtonsControl != null)
            {
                itsFloorButtonsControl._removeItsButton(this);
            }
        __setItsFloorButtonsControl(p_FloorButtonsControl);
    }
    
    //## auto_generated 
    public void setItsFloorButtonsControl(FloorButtonsControl p_FloorButtonsControl) {
        if(p_FloorButtonsControl != null)
            {
                p_FloorButtonsControl._addItsButton(this);
            }
        _setItsFloorButtonsControl(p_FloorButtonsControl);
    }
    
    //## auto_generated 
    public void _clearItsFloorButtonsControl() {
        itsFloorButtonsControl = null;
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
                case Pressed:
                {
                    res = Pressed_takeEvent(id);
                }
                break;
                case Unpressed:
                {
                    res = Unpressed_takeEvent(id);
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
        public void UnpressedEnter() {
        }
        
        //## statechart_method 
        public int UnpressedTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Unpressed_exit();
            //#[ transition 0 
            pressbutton();
            //#]
            Pressed_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Pressed_enter() {
            pushNullConfig();
            rootState_subState = Pressed;
            rootState_active = Pressed;
            PressedEnter();
        }
        
        //## statechart_method 
        public void PressedExit() {
        }
        
        //## statechart_method 
        public void Unpressed_exit() {
            popNullConfig();
            UnpressedExit();
        }
        
        //## statechart_method 
        public void PressedEnter() {
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int Unpressed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = UnpressedTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void UnpressedExit() {
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public int Pressed_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = PressedTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Pressed_exit() {
            popNullConfig();
            PressedExit();
        }
        
        //## statechart_method 
        public void Pressed_entDef() {
            Pressed_enter();
        }
        
        //## statechart_method 
        public void rootState_exit() {
            switch (rootState_subState) {
                case Pressed:
                {
                    Pressed_exit();
                }
                break;
                case Unpressed:
                {
                    Unpressed_exit();
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
            Unpressed_entDef();
        }
        
        //## statechart_method 
        public int PressedTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            Pressed_exit();
            //#[ transition 2 
            actionfinished();
            //#]
            Unpressed_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Unpressed_enter() {
            pushNullConfig();
            rootState_subState = Unpressed;
            rootState_active = Unpressed;
            UnpressedEnter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Unpressed_entDef() {
            Unpressed_enter();
        }
        
    }
}
//## ignore 
class onPress_Button_Event extends RiJEvent {
    
    public static final int onPress_Button_Event_id = 31000;
    
    // Constructors
    
    public  onPress_Button_Event() {
        lId = onPress_Button_Event_id;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/Button.java
*********************************************************************/

