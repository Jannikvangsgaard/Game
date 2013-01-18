package utility;

import java.io.Serializable;

/**
 *
 * @author Jannik
 */
public class Player implements Serializable {

    private String name;
    private Town town;
    private int[] sol = new int[4];
    private int[] civ = new int[4];
    private int rest;

    public Player(String name) {
        this.name = name;
        town = new Town();
    }
    public void createArmy(int[] army){
        town.sendArmy(army, name);
    }

    public void counter() {
        town.counter();
    }

    public void build(int i) {
        town.build(i);
    }

    public boolean isBarrack() {
        return town.isBarrack();
    }

    public boolean isStable() {
        return town.isStable();
    }

    public boolean isWall() {
        return town.isWall();
    }

    public boolean isGreatWall() {
        return town.isGreatWall();
    }

    public boolean isMarket() {
        return town.isMarket();
    }

    public boolean isSpecialWeaponSmith() {
        return town.isSpecialWeaponSmith();
    }

    public boolean isSeigeEngineHouse() {
        return town.isSeigeEngineHouse();
    }

    public int getGold() {
        return town.getGold();
    }

    public int getLInf() {
        return town.getLInf();
    }

    public int getHInf() {
        return town.getHInf();
    }

    public int getLCav() {
        return town.getLCav();
    }

    public int getHCav() {
        return town.getHCav();
    }

    public String getName() {
        return name;
    }

    public int getCivilian() {
        return town.getCivilian();
    }

    public void train(int sol1, int sol2, int sol3, int sol4) {
        sol[0] = sol1;
        sol[1] = sol2;
        sol[2] = sol3;
        sol[3] = sol4;
        town.trainSoldiers(sol);
    }

    public boolean convert(int amount) {
        return town.convertSoldiers(amount);
    }
}
