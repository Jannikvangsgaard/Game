package utility;

/**
 *
 * @author Jannik
 */
public class Building {
    
    private boolean barrack;
    private boolean stable;
    private boolean wall;
    private boolean greatWall;
    private boolean specialWeaponSmith;
    private boolean siegeEngineHouse;
    
    public Building(){
        barrack = false;
        stable = false;
        wall = false;
        wall = false;
        greatWall = false;
        specialWeaponSmith = false;
        siegeEngineHouse = false;
        
    }

    public void setBarrack(boolean barrack) {
        this.barrack = barrack;
    }

    public void setStable(boolean stable) {
        this.stable = stable;
    }

    public void setWall(boolean wall) {
        this.wall = wall;
    }

    public void setGreatWall(boolean greatWall) {
        this.greatWall = greatWall;
    }

    public void setSpecialWeaponSmith(boolean specialWeaponSmith) {
        this.specialWeaponSmith = specialWeaponSmith;
    }

    public void setSiegeEngineHouse(boolean siegeEngineHouse) {
        this.siegeEngineHouse = siegeEngineHouse;
    }
    

    public boolean isBarrack() {
        return barrack;
    }

    public boolean isStable() {
        return stable;
    }

    public boolean isWall() {
        return wall;
    }

    public boolean isGreatWall() {
        return greatWall;
    }

    public boolean isSpecialWeaponSmith() {
        return specialWeaponSmith;
    }

    public boolean isSiegeEngineHouse() {
        return siegeEngineHouse;
    }
    
    
    
    
    
    
}
