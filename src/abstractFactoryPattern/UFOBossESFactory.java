
package abstractFactoryPattern;

public class UFOBossESFactory implements ESFactory{
    
    @Override
    public ESWeapon addESGun(){
        return new ESUFOBossGun();
    }
    
    @Override
    public ESEngine addESEngine(){
        return new ESUFOBossEngine();
    }
}
