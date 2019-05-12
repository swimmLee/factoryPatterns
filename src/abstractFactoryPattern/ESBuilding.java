
package abstractFactoryPattern;

public abstract class ESBuilding {
    
    protected abstract ES makeES(String typeOfShip);
    
    public ES orderTheShip(String typeOfShip){
        ES theES = makeES(typeOfShip);
        
        theES.makeShip();
        theES.displayES();
        theES.followHeroShip();
        theES.eSShoots();
        
        return theES;
    }
    
}
