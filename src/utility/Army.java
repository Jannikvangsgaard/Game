package utility;

/**
 *
 * @author Jannik
 */
public class Army {
    
    private boolean onlyCav = false;
    private int[] army;
    private String owner;
    private int arrival;
    private int turn;
    
    public Army(int[] army, String owner){
        this.army = army;
        this.owner = owner;
        arrival = 2;
        turn = 0;
    }
    
    public boolean ifOnlyCav(int[] army){
        if (army[0]==0&&army[1]==0){
            boolean onlyCav = true;
            arrival = 1;
            return true;
        }
        return false;
    }
    
    public boolean isOnlyCav() {
        return onlyCav;
    }

    public void setOnlyCav(boolean onlyCav) {
        this.onlyCav = onlyCav;
    }

    public int[] getArmy() {
        return army;
    }

    public void setArmy(int[] army) {
        this.army = army;
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

    public void setArrival(int arrival) {
        this.arrival = arrival;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
    
    public void takeTurn(){
        turn++;
    }
}
