
package abstractFactoryPattern;

public abstract class ES {
    private String name;
    ESWeapon weapon;
    ESEngine engine;
    
    public String getName() {return name;}
    public void setName( String newName) { name = newName;}
    
    abstract void makeShip();
    
    public void followHeroShip(){
        System.out.println(getName() + " is following the hero at " + engine);
    }
    
    public void displayES(){
            System.out.println(getName() + " is on the screen.");
    }
    
    public void eSShoots(){
        System.out.println(getName() + " attacks and does " + weapon);
    }
    
    @Override
    public String toString(){
        String infoOnShip = "The " + name + " has a tip speed of " 
                + engine + " and an attack power of " + weapon;
        return infoOnShip;
    }
}
