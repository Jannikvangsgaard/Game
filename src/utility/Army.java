package utility;

import java.io.Serializable;

/**
 *
 * @author Jannik
 */
public class Army implements Serializable {
    
    
    private boolean onlyCav = false;
    private int[] army;
    private String owner;
    private int arrival, home=2;
    private double damage;
    
    public Army(int[] army, String owner){
       double amount = army[0];
        damage = amount;
        amount = army[1];
        damage += 1.5 * amount;
        amount = army[2];
        damage += 1.5 * amount;
        amount = army[3];
        damage += 2.5 * amount;
        this.owner = owner;
        if (ifOnlyCav(army)){
            arrival =1;
        }else{
        arrival = 2;
        }
        System.out.println(damage);
        
    }
    public double getDamage(){
        return damage;
    }
    
    public boolean ifOnlyCav(int[] army){
        if (army[0]==0&&army[1]==0){
            boolean onlyCav = true;
            arrival = 1;
            return true;
        }
        return false;
    }
    public boolean isHome(){
        if (home==2||home==1){
            if (arrival ==0 ){
                home--;
            }else if(home==0)
            {
            return true;
        }
        }
        
        return false;
    }
    
    public boolean isOnlyCav() {
        return onlyCav;
    }


    public int[] getArmy() {
        return army;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getArrival() {
        return arrival;
    }

    public void move() {
     if (arrival>0){
         arrival--;
     }
    }

    
}
