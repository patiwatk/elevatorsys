/*********************************************************************
	Rhapsody	: 7.5.1
	Login		: Mateusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Dispatcher
//!	Generated Date	: Thu, 3, Jun 2010 
	File Path	: DefaultComponent/DefaultConfig/Building/Dispatcher.java
*********************************************************************/

package Building;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Building/Dispatcher.java                                                                  
//----------------------------------------------------------------------------

//## package Building 


//## class Dispatcher 
public class Dispatcher {
    
    protected ArrayList<Car> itsCar;		//## link itsCar 
    
    protected ArrayList<Engine> itsEngine;		//## link itsEngine 
    
    protected ArrayList<Floor> itsFloor;		//## link itsFloor 
    
    
    // Constructors
    
    //## auto_generated 
    public  Dispatcher() {
        {
            itsCar = new ArrayList<Car>();
        }
        {
            itsEngine = new ArrayList<Engine>();
        }
        {
            itsFloor = new ArrayList<Floor>();
        }
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
    public ListIterator<Engine> getItsEngine() {
        ListIterator<Engine> iter = itsEngine.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsEngine(Engine p_Engine) {
        itsEngine.add(0, p_Engine);
    }
    
    //## auto_generated 
    public void addItsEngine(Engine p_Engine) {
        if(p_Engine != null)
            {
                p_Engine._setItsDispatcher(this);
            }
        _addItsEngine(p_Engine);
    }
    
    //## auto_generated 
    public void _removeItsEngine(Engine p_Engine) {
        itsEngine.remove(p_Engine);
    }
    
    //## auto_generated 
    public void removeItsEngine(Engine p_Engine) {
        if(p_Engine != null)
            {
                p_Engine.__setItsDispatcher(null);
            }
        _removeItsEngine(p_Engine);
    }
    
    //## auto_generated 
    public void _clearItsEngine() {
        itsEngine.clear();
    }
    
    //## auto_generated 
    public void clearItsEngine() {
        ListIterator<Engine> iter = itsEngine.listIterator();
        while (iter.hasNext()){
            (itsEngine.get(iter.nextIndex()))._clearItsDispatcher();
            iter.next();
        }
        _clearItsEngine();
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
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Building/Dispatcher.java
*********************************************************************/

