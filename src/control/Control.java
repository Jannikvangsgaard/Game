package control;

import java.io.Serializable;
import utility.Player;

/**
 *
 * @author Jannik
 */
public class Control implements Serializable {
    
    private Player player1, player2, currentPlayer;
    private int turn = 0;
    
    public void changePlayer(){
        if (currentPlayer == player1){
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }
    public void createArmy(int sol1, int sol2, int sol3, int sol4){
        int[] army = new int[4];
        army[0] = sol1;
        army[1] = sol2;
        army[2] = sol3;
        army[3] = sol4;
        currentPlayer.createArmy(army);
    }
    
    public boolean convert(int amount) {
        return currentPlayer.convert(amount);
    }
    
    public void counter(){
        player1.counter();
        player2.counter();
    }
    public String armyinfo(int i){
        
        if (i==0)
        return player1.armyInfo();
        else
        return player2.armyInfo();
        
    }
    public void createPlayer(String name1, String name2){
        player1 = new Player(name1);
        player2 = new Player(name2);
        currentPlayer = player2;
    }
    public int getGold(){
       return currentPlayer.getGold();
    } 
    public void train(int sol, int sol2, int sol3, int sol4){
        currentPlayer.train(sol,sol2,sol3,sol4);
    }

    public void build(int i) {
        currentPlayer.build(i);
    }

    public boolean isBarrack() {
        return currentPlayer.isBarrack();
    }

    public boolean isStable() {
        return currentPlayer.isStable();
    }

    public boolean isWall() {
        return currentPlayer.isWall();
    }

    public boolean isGreatWall() {
        return currentPlayer.isGreatWall();
    }

    public boolean isMarket() {
        return currentPlayer.isMarket();
    }

    public boolean isSpecialWeaponSmith() {
        return currentPlayer.isSpecialWeaponSmith();
    }

    public boolean isSeigeEngineHouse() {
        return currentPlayer.isSeigeEngineHouse();
    }

    public int getLInf() {
        return currentPlayer.getLInf();
    }

    public int getHInf() {
        return currentPlayer.getHInf();
    }

    public int getLCav() {
        return currentPlayer.getLCav();
    }

    public int getHCav() {
        return currentPlayer.getHCav();
    }

    public String getName() {
        return currentPlayer.getName();
    }

    public int getCivilian() {
        return currentPlayer.getCivilian();
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
