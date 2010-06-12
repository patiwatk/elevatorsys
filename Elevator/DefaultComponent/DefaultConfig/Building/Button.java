/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: Mateusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Button
//!	Generated Date	: Thu, 3, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/Button.java
*********************************************************************/

package Building;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Building/Button.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class Button 
public class Button {
    
    protected ButtonControl itsButtonControl;		//## link itsButtonControl 
    
    
    // Constructors
    
    //## auto_generated 
    public  Button() {
    }
    
    //## auto_generated 
    public ButtonControl getItsButtonControl() {
        return itsButtonControl;
    }
    
    //## auto_generated 
    public void __setItsButtonControl(ButtonControl p_ButtonControl) {
        itsButtonControl = p_ButtonControl;
    }
    
    //## auto_generated 
    public void _setItsButtonControl(ButtonControl p_ButtonControl) {
        if(itsButtonControl != null)
            {
                itsButtonControl.__setItsButton(null);
            }
        __setItsButtonControl(p_ButtonControl);
    }
    
    //## auto_generated 
    public void setItsButtonControl(ButtonControl p_ButtonControl) {
        if(p_ButtonControl != null)
            {
                p_ButtonControl._setItsButton(this);
            }
        _setItsButtonControl(p_ButtonControl);
    }
    
    //## auto_generated 
    public void _clearItsButtonControl() {
        itsButtonControl = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/Button.java
*********************************************************************/

