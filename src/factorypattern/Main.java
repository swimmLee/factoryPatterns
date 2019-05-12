
package factorypattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
    }
    
    public Main(){
        Scanner kb = new Scanner(System.in);
        
            //Static
        System.out.println("\tThe Static approach.");
        Ship ufo = new UFOShip();
        doStuff(ufo);
        System.out.println("");
            /*Ship rock = new RocketShip();
            doStuff(rock);
            System.out.println("");
            Ship big = new BigShip();
            doStuff(big);
            System.out.println(""); */
        
            //dynamic but not encapsulated.
        System.out.println("\n\tDynamic but not encapsulated approach.");
        Ship newShip = null;
        System.out.println("What type of ship? (U/ R/ B)");
        String shipOption = null;
        if(kb.hasNextLine()){
            shipOption = kb.nextLine();
        }
            //All this code is moved to abs ShipFactory Class.
        if(shipOption.equals("U")){
            newShip = new UFOShip();
        }
        else if(shipOption.equals("R")){
            newShip = new RocketShip();
        }
        else if(shipOption.equals("B")){
            newShip = new BigShip();
        }
        doStuff(newShip);
        
        
            //The Factory Method
            //Completely encapsulate the ship creation methods.
            //Move all the decision making out to abstract method.
            //close the code for modification
        System.out.println("\n\tThe Factory Method");
        ShipFactory shipFactory = new ShipFactory();
        Ship theEnemy = null;
        System.out.println("What type of ship? (U/ R/ B)");
        if(kb.hasNextLine()){
            String typeOfShip = kb.nextLine();
            theEnemy = shipFactory.makeShip(typeOfShip);
        }
        if(theEnemy != null){
            doStuff(theEnemy);
        }
        else System.out.println("Please enter U, R, B next time.");
    }
    
    public static void doStuff(Ship aShip){
        aShip.displayEShip();
        aShip.followHeroShip();
        aShip.eShipShoots();
    }
}
