
package factorypattern;

class ShipFactory {
    //stuff - move the decision if else out of main.
    //move decisions to this class.
    
    public Ship makeShip(String newShipType){
        Ship newShip = null;
        if(newShipType.equals("U")){
            //completely encapsulates ship creatrion.
            //later modification done in one place.
            return new UFOShip();
        }
        else if(newShipType.equals("R")){
            return new RocketShip();
        }
        else if(newShipType.equals("B")){
            return new BigShip();
        }
        else return null;
    }
}
