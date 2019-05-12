
package abstractFactoryPattern;

public class UFOBossES extends ES{
    
    ESFactory shipFactory;
    
    public UFOBossES(ESFactory shipFactory){
        this.shipFactory = shipFactory;
    }
    
    @Override
    public void makeShip(){
        System.out.println("Making enemy ship " + getName());
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}
