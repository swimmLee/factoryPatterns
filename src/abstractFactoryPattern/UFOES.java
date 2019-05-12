
package abstractFactoryPattern;

public class UFOES extends ES {
    
    ESFactory shipFactory;
    
    public UFOES(ESFactory shipFactory){
        this.shipFactory = shipFactory;
    }
    
    @Override
    public void makeShip(){
        System.out.println("Making enemy ship " + getName());
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}
