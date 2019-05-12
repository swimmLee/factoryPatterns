
package abstractFactoryPattern;

public class UFOESFactory implements ESFactory {
    
    @Override
    public ESWeapon addESGun(){
        return new ESUFOGun();
    }
    
    @Override
    public ESEngine addESEngine(){
        return new ESUFOEngine();
    }
}