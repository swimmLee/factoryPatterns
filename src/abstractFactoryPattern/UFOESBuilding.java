
package abstractFactoryPattern;

public class UFOESBuilding extends ESBuilding{
    
    protected ES makeES(String typeOfShip){
        ES theES = null;
        if(typeOfShip.equalsIgnoreCase("UFO")){
            ESFactory shipPartsFactory = new UFOESFactory();
            theES = new UFOES(shipPartsFactory);
            theES.setName("UFO Grunt Ship");
        } else if (typeOfShip.equalsIgnoreCase("UFO Boss")){
            ESFactory shipPartsFactory = new UFOBossESFactory();
            theES = new UFOBossES(shipPartsFactory);
            theES.setName("UFO Boss Ship");
        }
        return theES;
    }
}
