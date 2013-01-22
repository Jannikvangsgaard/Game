package utility;

import java.io.Serializable;

/**
 *
 * @author Jannik
 */
public class Army implements Serializable {

    private boolean onlyCav = false;
    private int[] army;
    private int arrival, home = 2;
    private double damage;
    private int win;

    public Army(int[] army) {
        double amount = army[0];
        this.army = army;
        damage = amount;
        amount = army[1];
        damage += 1.5 * amount;
        amount = army[2];
        damage += 1.5 * amount;
        amount = army[3];
        damage += 2.5 * amount;
        if (ifOnlyCav(army)) {
            arrival = 1;
        } else {
            arrival = 2;
        }

    }

    public int win() {
        return win;
    }

    public void winner(int win) {
        this.win = win;
    }

    public double getDamage() {
        return damage;
    }

    public boolean ifOnlyCav(int[] army) {
        if (army[0] == 0 && army[1] == 0) {
            boolean onlyCav = true;
            arrival = 1;
            return true;
        }
        return false;
    }

    public boolean isHome() {
        if (home == 0) {
            return true;
        }
        return false;

    }

    public boolean isOnlyCav() {
        return onlyCav;
    }

    public int[] getArmy() {
        return army;
    }

    public int getArrival() {
        return arrival;
    }

    public void setArrival(int arrival) {
        this.arrival = arrival;
    }

    public void move() {
        if (arrival > 0) {
            arrival--;
        } else if (arrival < 0 && home != 0) {
            home--;
        }
    }
    @Override
    public String toString(){
        return "Arrival: " + arrival + " your army is home in " + home + " turn(s)\n";
    }
}
