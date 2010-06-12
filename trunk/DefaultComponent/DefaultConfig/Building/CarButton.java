/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: Mateusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: CarButton
//!	Generated Date	: Thu, 3, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/CarButton.java
*********************************************************************/

package Building;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Building/CarButton.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


/**
Extended class of the class Button , which defines all kind of inside car buttons like for selection floor.
*/
//## class CarButton 
public class CarButton extends Button {
    
    protected Car itsCar;		//## link itsCar 
    
    protected Car itsCar_1;		//## link itsCar_1 
    
    
    // Constructors
    
    //## auto_generated 
    public  CarButton() {
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
                itsCar.__setItsCarButton(null);
            }
        __setItsCar(p_Car);
    }
    
    //## auto_generated 
    public void setItsCar(Car p_Car) {
        if(p_Car != null)
            {
                p_Car._setItsCarButton(this);
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
                itsCar_1._removeItsCarButton_1(this);
            }
        __setItsCar_1(p_Car);
    }
    
    //## auto_generated 
    public void setItsCar_1(Car p_Car) {
        if(p_Car != null)
            {
                p_Car._addItsCarButton_1(this);
            }
        _setItsCar_1(p_Car);
    }
    
    //## auto_generated 
    public void _clearItsCar_1() {
        itsCar_1 = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/CarButton.java
*********************************************************************/

