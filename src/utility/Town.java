package utility;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jannik
 */
public class Town implements Serializable {

    private int civilian;
    private ArrayList<Army> armies = new ArrayList<Army>();
    private int[] soldiers = new int[4];
    private int totalGold;
    private Building building;

    public Town() {

        civilian = 10;
        totalGold = 10;
        building = new Building();
    }

    public boolean lost(int lost) {
        if (lost <= civilian) {
            civilian -= lost;
        } else if (lost > civilian) {
            lost -= civilian;
            civilian = 0;
            if (lost <= soldiers[0]) {
                soldiers[0] -= lost;
            } else if (lost > soldiers[0]) {
                soldiers[0] = 0;
                if (lost <= soldiers[1]) {
                    soldiers[1] -= lost;
                } else if (lost > soldiers[1]) {
                    soldiers[1] = 0;
                    if (lost <= soldiers[2]) {
                        soldiers[2] -= lost;
                    } else if (lost > soldiers[2]) {
                        soldiers[2] = 0;
                        if (lost <= soldiers[3]) {
                            soldiers[3] -= lost;
                        } else if (lost > soldiers[2]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void counter() {
        for (int i = 0; i < armies.size(); i++) {
            if (armies != null) {
                armies.get(i).move();
            }
            if (armies != null && armies.get(i).isHome()) {
                int[] sol = armies.get(i).getArmy();
                soldiers[0] += sol[0];
                soldiers[1] += sol[1];
                soldiers[2] += sol[2];
                soldiers[3] += sol[3];
            }
        }
        int num = civilian / 2;
        if (num > 50) {
            num = 50;
        }
        totalGold += civilian;
        civilian += num;

    }

    public String armyInfo() {
        String res = null;
        for (int i = 0; i < armies.size(); i++) {
            res += armies.get(i).toString();
        }
        return res;
    }

    public void sendArmy(int sol[], String name) {
        soldiers[0] = soldiers[0] - sol[0];
        soldiers[1] = soldiers[1] - sol[1];
        soldiers[2] = soldiers[2] - sol[2];
        soldiers[3] = soldiers[3] - sol[3];
        armies.add(new Army(sol));
    }

    public double defense() {
        double defense;
        defense = soldiers[0];
        defense += soldiers[1] * 1.5;
        defense += soldiers[2] * 1.5;
        defense += soldiers[30] * 2.5;
        if (building.isWall()) {
            defense += 10;
        }
        if (building.isGreatWall()) {
            defense += 20;
        }
        return defense;

    }

    public boolean isBarrack() {
        return building.isBarrack();
    }

    public boolean isStable() {
        return building.isStable();
    }

    public boolean isWall() {
        return building.isWall();
    }

    public boolean isGreatWall() {
        return building.isGreatWall();
    }

    public boolean isMarket() {
        return building.isMarket();
    }

    public boolean isSpecialWeaponSmith() {
        return building.isSpecialWeaponSmith();
    }

    public boolean isSeigeEngineHouse() {
        return building.isSiegeEngineHouse();
    }

    public int getCivilian() {
        return civilian;
    }

    public int getGold() {
        return totalGold;
    }

    public int getLInf() {
        return soldiers[0];
    }

    public int getHInf() {
        return soldiers[1];
    }

    public int getLCav() {
        return soldiers[2];
    }

    public int getHCav() {
        return soldiers[3];
    }

    public ArrayList<Army> getArmies() {
        return armies;
    }

    public void setArmies(ArrayList<Army> armies) {
        this.armies = armies;
    }

    public Boolean convertSoldiers(int amount) {
        int rest;
        int tot = 0;
        for (int i = 0; i < 4; i++) {
            tot += soldiers[i];
        }
        if (amount <= tot) {
            if (amount <= soldiers[0]) {
                soldiers[0] -= amount;
                return true;
            } else if (amount > soldiers[0]) {
                rest = amount - soldiers[0];
                soldiers[0] = 0;
                if (rest > soldiers[2]) {
                    rest = rest - soldiers[1];
                    if (rest > soldiers[2]) {
                        rest = rest - soldiers[2];
                        if (rest > soldiers[3]) {

                            return false;
                        } else if (soldiers[3] >= rest) {
                            soldiers[3] -= rest;
                            return true;
                        }
                    } else if (soldiers[2] >= rest) {
                        soldiers[2] -= rest;
                        return true;
                    }
                } else if (soldiers[1] >= rest) {
                    soldiers[1] -= rest;
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean trainSoldiers(int[] civ) {
        int tot = 0;
        boolean check = false;
        for (int i = 0; i < 4; i++) {
            tot = tot + civ[i];
        }
        if (civilian - tot > 1) {
            civilian = civilian - tot;
            for (int i = 0; i < 4; i++) {
                if (civ[i] == civ[0]) {
                    soldiers[0] += civ[i];
                    totalGold -= civ[i];
                    check = true;
                }
                if (civ[i] == civ[1]) {
                    if (building.isBarrack()) {
                        soldiers[1] += civ[i];
                        totalGold -= (civ[i] * 1.5);
                        check = true;
                    } else {
                        check = false;
                    }
                }
                if (civ[i] == civ[2]) {
                    if (building.isStable()) {
                        soldiers[2] += civ[i];
                        totalGold -= (civ[i] * 1.5);
                        check = true;
                    } else {
                        check = false;
                    }
                }
                if (civ[i] == civ[3]) {
                    if (building.isStable()) {
                        soldiers[3] += civ[i];
                        totalGold -= (civ[i] * 3.5);
                        check = true;
                    } else {
                        check = false;
                    }
                }
            }
        }
        return check;
    }

    public void build(int building) {
        switch (building) {
            case 1:
                if (totalGold >= 10) {
                    if (!this.building.isBarrack()) {
                        this.building.setBarrack(true);
                        totalGold -= 10;
                    }
                }
                break;
            case 2:
                if (totalGold >= 50) {
                    if (!this.building.isStable()) {
                        this.building.setStable(true);
                        totalGold -= 50;
                    }
                }
                break;
            case 3:
                if (totalGold >= 80) {
                    if (!this.building.isWall()) {
                        this.building.setWall(true);
                        totalGold -= 80;
                    }
                }
                break;
            case 4:
                if (totalGold >= 250) {
                    if (this.building.isGreatWall()) {
                        this.building.setGreatWall(true);
                        totalGold -= 250;
                    }
                }
                break;
            case 5:
                if (totalGold >= 80) {
                    if (this.building.isMarket()) {
                        this.building.setMarkte(true);
                        totalGold -= 80;
                    }
                    break;
                }
            case 6:
                if (totalGold >= 130) {
                    if (this.building.isSpecialWeaponSmith()) {
                        this.building.setSpecialWeaponSmith(true);
                        totalGold -= 130;
                    }
                }
                break;
            case 7:
                if (totalGold >= 300) {
                    if (this.building.isSiegeEngineHouse()) {
                        this.building.setSiegeEngineHouse(true);
                        totalGold -= 300;
                    }
                }
                break;
        }
    }
}
