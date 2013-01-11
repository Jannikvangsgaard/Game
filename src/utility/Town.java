package utility;

/**
 *
 * @author Jannik
 */
public class Town {

    private int civilian;
    private int[] soldiers = new int[4];
    private int totalGold;
    private Building building;

    public Town() {
        civilian = 10;
        totalGold = 10;
        building = new Building();
    }
    public void counter(){
        int num = civilian/2;
        totalGold+=civilian;
        civilian+=num;
        
    }
    public int getGold(){
        return totalGold;
    }
    public int getLInf(){
        return soldiers[0];
    }
    public int getHInf(){
        return soldiers[1];
    }
    public int getLCav(){
        return soldiers[2];
    }
    public int getHCav(){
        return soldiers[3];
    }

    public Boolean convertSoldiers(int[] sol) {
        int tot = 0;
        for (int i = 0; i < 4; i++) {
            tot = tot + sol[i];
        }
        if (soldiers[0] - sol[0] > 0 && soldiers[1] - sol[1] > 0 && soldiers[2] - sol[2] > 0 && soldiers[3] - sol[3] > 0) {
            civilian = civilian + tot;
            return true;
        }
        return false;
    }

    public Boolean trainSoldiers(int[] civ) {
        int tot = 0;
        for (int i = 0; i < 4; i++) {
            tot = tot + civ[i];
        }
        if (civilian - tot > 1) {
            civilian = civilian - tot;
            for (int i = 0; i < 4; i++) {
                if (civ[i] == civ[0]) {
                        soldiers[0] += civ[i];
                }
                if (civ[i] == civ[1]) {
                    if (building.isBarrack()) {
                        soldiers[1] += civ[i];
                    }
                }
                if (civ[i] == civ[2]) {
                    if (building.isStable()) {
                        soldiers[2] += civ[i];
                    }
                }
                if (civ[i] == civ[3]) {
                    if (building.isStable()) {
                        soldiers[3] += civ[i];
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void build(int building){
        switch (building){
            case 1:
                if (totalGold>=10){
                this.building.setBarrack(true);
                totalGold-=10;
                }
                break;
            case 2:
                if (totalGold>=50){
                this.building.setStable(true);
                totalGold-=50;
                }
                break;
            case 3:
                if (totalGold>=80){
                this.building.setWall(true);
                totalGold-=80;
                }
                break;
            case 4:
                if (totalGold>=250){
                this.building.setGreatWall(true);
                totalGold-=250;
                }
                break;
            case 5:
                if (totalGold>=80){
                    this.building.setMarkte(true);
                    totalGold-=80;
                   break;
                }
            case 6:
                if (totalGold>=130){
                this.building.setSpecialWeaponSmith(true);
                totalGold-=130;
                }
                break;
            case 7:
                if (totalGold>=300){
                this.building.setSiegeEngineHouse(true);
                totalGold-=300;
                }
                break;
        }
    }
    
}

