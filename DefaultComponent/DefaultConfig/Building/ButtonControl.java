/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: Mateusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ButtonControl
//!	Generated Date	: Thu, 3, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/ButtonControl.java
*********************************************************************/

package Building;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Building/ButtonControl.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class ButtonControl 
public class ButtonControl {
    
    protected Button itsButton;		//## link itsButton 
    
    
    // Constructors
    
    //## auto_generated 
    public  ButtonControl() {
    }
    
    //## auto_generated 
    public Button getItsButton() {
        return itsButton;
    }
    
    //## auto_generated 
    public void __setItsButton(Button p_Button) {
        itsButton = p_Button;
    }
    
    //## auto_generated 
    public void _setItsButton(Button p_Button) {
        if(itsButton != null)
            {
                itsButton.__setItsButtonControl(null);
            }
        __setItsButton(p_Button);
    }
    
    //## auto_generated 
    public void setItsButton(Button p_Button) {
        if(p_Button != null)
            {
                p_Button._setItsButtonControl(this);
            }
        _setItsButton(p_Button);
    }
    
    //## auto_generated 
    public void _clearItsButton() {
        itsButton = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/ButtonControl.java
*********************************************************************/

