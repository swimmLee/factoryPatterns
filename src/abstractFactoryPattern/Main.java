
package abstractFactoryPattern;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
    }
    
    public Main(){
        ESBuilding Try = new UFOESBuilding();
        
        //MakeUFOs
        
        ES theGrunt = Try.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");
        
        ES theBoss = Try.orderTheShip("UFO Boss");
        System.out.println(theBoss + "\n");
    }
    
}
