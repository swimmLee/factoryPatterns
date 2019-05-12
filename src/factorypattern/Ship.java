package factorypattern;

public class Ship {
    
    private String name;
    private double amtDamage;

    public String getName() { return name;    }

    public void setName(String name) {
        this.name = name;    }

    public double getAmtDamage() { return amtDamage;    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;    }
    
    public void followHeroShip(){
        System.out.println(getName() + " is following the hero.");
    }
    
    public void displayEShip(){
        System.out.println(getName() + " is on the screen.");
    }
    
    public void eShipShoots(){
        System.out.println(getName() + 
                " attacks and inflicts damage level  " + getAmtDamage());
    }
}
