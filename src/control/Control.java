package control;

import java.io.Serializable;
import java.util.ArrayList;
import utility.Army;
import utility.Player;

/**
 *
 * @author Jannik
 */
public class Control implements Serializable {

    private Player player1, player2, currentPlayer;
    private int turn = 0;

    public void changePlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public void createArmy(int sol1, int sol2, int sol3, int sol4) {
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
    
    public boolean hasLost(Player play){
        if (play.getCivilian() <= 0 && play.getLCav() <= 0 && play.getHCav() <= 0 && play.getLInf() <= 0 && play.getHInf() <= 0){
            return true;
        }
        return false;
    }

    public void counter() {
        ArrayList<Army> armies = player1.getArmy();
        if (armies != null) {
            for (int i = 0; i < armies.size(); i++) {
                if (armies.get(i).getArrival() == 0) {
                    if (armies.get(i).getDamage() > player2.getDefense()) {
                        int a = (int) armies.get(i).getDamage() - (int) player2.getDefense();
                        player2.lost(a);
                        armies.get(i).winner(a);
                        armies.get(i).setArrival(-1);
                    } else if (armies.get(i).getDamage() < player2.getDefense()) {
                        int lost = 2 / ((int) player2.getDefense() - (int) armies.get(i).getDamage());
                        int[] soldiers = armies.get(i).getArmy();
                        //prøv for lokke
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
                                    } else if (lost > soldiers[3]) {
                                        armies.remove(i);
                                        i--;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        player1.setArmies(armies);
        armies = player2.getArmy();
        if (armies != null) {
            for (int i = 0; i < armies.size(); i++) {
                if (armies.get(i).getArrival() == 0) {
                    if (armies.get(i).getDamage() > player1.getDefense()) {
                        player1.lost((int) player1.getDefense() - (int) armies.get(i).getDamage());
                        armies.get(i).winner((int) player1.getDefense() - (int) armies.get(i).getDamage());
                    } else if (armies.get(i).getDamage() < player1.getDefense()) {
                        int lost = 2 / ((int) player1.getDefense() - (int) armies.get(i).getDamage());
                        int[] soldiers = armies.get(i).getArmy();
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
                                    } else if (lost > soldiers[3]) {
                                        armies.remove(i);
                                        i--;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        player2.setArmies(armies);
        player1.counter();
        player2.counter();
    }

    public String armyinfo(int i) {
        if (i == 0) {
            return player1.armyInfo();
        } else {
            return player2.armyInfo();
        }

    }

    public void createPlayer(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        currentPlayer = player2;
    }

    public int getGold() {
        return currentPlayer.getGold();
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void train(int sol, int sol2, int sol3, int sol4) {
        currentPlayer.train(sol, sol2, sol3, sol4);
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

    public String getPlayerName1() {
        return player1.getName();
    }

    public String getPlayerName2() {
        return player2.getName();
    }

    public int getPlayer1Civilian() {
        return player1.getCivilian();
    }

    public int getPlayer2Civilian() {
        return player2.getCivilian();
    }

    public int getPlayer1Gold() {
        return player1.getGold();
    }

    public int getPlayer2Gold() {
        return player2.getGold();
    }
}
