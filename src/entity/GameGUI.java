/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import control.Control;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import utility.Player;

/**
 *
 * @author computer
 */
public class GameGUI extends javax.swing.JFrame {

    private Control control = new Control();
    private static String player1name, player2name;
    //  private String[] labels = {"Soldiers: " , "Amount: "},soldiersNames = {"Light Infantry", "Heavy Infantry", "Light Cavalry", "Heavy Cavalry"};
    //   private SpinnerListModel soldierModel = null;
    private int turn = 0;
    private Player player1, player2, currentPlayer;

    /**
     * Creates new form GameGUI
     */
    public GameGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCurrentPlayer = new javax.swing.JLabel();
        jLabelGold = new javax.swing.JLabel();
        jLabelLightInf = new javax.swing.JLabel();
        jLabelHinf = new javax.swing.JLabel();
        jLabelLCav = new javax.swing.JLabel();
        jLabelHCav = new javax.swing.JLabel();
        jButtonStart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldBuyLInf = new javax.swing.JTextField();
        jTextFieldBuyHInf = new javax.swing.JTextField();
        jTextFieldBuyLCav = new javax.swing.JTextField();
        jTextFieldBuyHCav = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonTrain = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldConvert = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabelCivilians = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaStatus = new javax.swing.JTextArea();
        jRadioButtonBarrack = new javax.swing.JRadioButton();
        jRadioButtonStable = new javax.swing.JRadioButton();
        jRadioButtonWall = new javax.swing.JRadioButton();
        jRadioButtonGreatWall = new javax.swing.JRadioButton();
        jRadioButtonMarket = new javax.swing.JRadioButton();
        jRadioButtonSpecial = new javax.swing.JRadioButton();
        jRadioButtonSiege = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCurrentPlayer.setText("PlayerName");

        jLabelGold.setText("Gold");

        jLabelLightInf.setText("L.Inf");

        jLabelHinf.setText("H.Inf");

        jLabelLCav.setText("L.Cav");

        jLabelHCav.setText("H.Cav");

        jButtonStart.setText("Start");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        jLabel1.setText("L.Inf");

        jLabel2.setText("H.Inf");

        jLabel3.setText("L.Cav");

        jLabel4.setText("H.Cav");

        jLabel5.setText("Gold");

        jTextFieldBuyLInf.setText("0");
        jTextFieldBuyLInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuyLInfActionPerformed(evt);
            }
        });
        jTextFieldBuyLInf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuyLInfKeyReleased(evt);
            }
        });

        jTextFieldBuyHInf.setText("0");
        jTextFieldBuyHInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuyHInfActionPerformed(evt);
            }
        });
        jTextFieldBuyHInf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuyHInfKeyReleased(evt);
            }
        });

        jTextFieldBuyLCav.setText("0");
        jTextFieldBuyLCav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuyLCavActionPerformed(evt);
            }
        });
        jTextFieldBuyLCav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuyLCavKeyReleased(evt);
            }
        });

        jTextFieldBuyHCav.setText("0");
        jTextFieldBuyHCav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuyHCavKeyReleased(evt);
            }
        });

        jLabel6.setText("Train Light Infantry");

        jLabel7.setText("Train Heavy Infantry");

        jLabel8.setText("Train Light Cavalry");

        jLabel9.setText("Train Heavy Cavalry");

        jButtonTrain.setText("Train");
        jButtonTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrainActionPerformed(evt);
            }
        });

        jLabel10.setText("Convert Soldier");

        jTextFieldConvert.setText("0");
        jTextFieldConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConvertActionPerformed(evt);
            }
        });
        jTextFieldConvert.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldConvertKeyReleased(evt);
            }
        });

        jLabel11.setText("Civilians");

        jLabelCivilians.setText("Civilians");

        jTextAreaStatus.setColumns(20);
        jTextAreaStatus.setRows(5);
        jScrollPane1.setViewportView(jTextAreaStatus);

        jRadioButtonBarrack.setText("Barrack");
        jRadioButtonBarrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBarrackActionPerformed(evt);
            }
        });

        jRadioButtonStable.setText("Stable");
        jRadioButtonStable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonStableActionPerformed(evt);
            }
        });

        jRadioButtonWall.setText("Wall");
        jRadioButtonWall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonWallActionPerformed(evt);
            }
        });

        jRadioButtonGreatWall.setText("Great Wall");
        jRadioButtonGreatWall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGreatWallActionPerformed(evt);
            }
        });

        jRadioButtonMarket.setText("Market");
        jRadioButtonMarket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMarketActionPerformed(evt);
            }
        });

        jRadioButtonSpecial.setText("Special Weapon Smith");
        jRadioButtonSpecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSpecialActionPerformed(evt);
            }
        });

        jRadioButtonSiege.setText("Siege Engine House");
        jRadioButtonSiege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSiegeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCurrentPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelHCav)
                                .addComponent(jLabelLCav)
                                .addComponent(jLabelHinf)
                                .addComponent(jLabelLightInf)
                                .addComponent(jLabelGold))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldBuyHCav, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldBuyLCav, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldBuyHInf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldBuyLInf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCivilians, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldConvert, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonWall)
                                    .addComponent(jRadioButtonGreatWall)
                                    .addComponent(jRadioButtonMarket)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonBarrack)
                                            .addComponent(jRadioButtonStable))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonSiege)
                                            .addComponent(jRadioButtonSpecial))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonTrain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonStart)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCurrentPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabelCivilians))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGold)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLightInf)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHinf)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLCav)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHCav)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuyLInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButtonBarrack)
                    .addComponent(jRadioButtonSpecial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuyHInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButtonStable)
                    .addComponent(jRadioButtonSiege))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuyLCav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButtonWall))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuyHCav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jRadioButtonGreatWall))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 206, Short.MAX_VALUE)
                        .addComponent(jButtonStart))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldConvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jRadioButtonMarket))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButtonTrain)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        if (turn == 0) {
            player1 = control.createPlayer(player1name);
            player2 = (Player) control.createPlayer(player2name);
            jButtonStart.setText("Next");
            turn++;            
        }
        if (turn == 1) {
            currentPlayer = player1;
            jLabelCurrentPlayer.setText("" + player1.getName());
            jLabelGold.setText("" + player1.getGold());
            jLabelLightInf.setText("" + currentPlayer.getLInf());
            jLabelHinf.setText("" + currentPlayer.getHInf());
            jLabelLCav.setText("" + currentPlayer.getLCav());
            jLabelHCav.setText("" + currentPlayer.getHCav());
            jLabelCivilians.setText("" + currentPlayer.getCivilian());
            turn++;
        } else if (turn == 2) {
            currentPlayer = player2;
            jLabelCurrentPlayer.setText("" + player2.getName());
            jLabelGold.setText("" + player2.getGold());
            jLabelLightInf.setText("" + currentPlayer.getLInf());
            jLabelHinf.setText("" + currentPlayer.getHInf());
            jLabelLCav.setText("" + currentPlayer.getLCav());
            jLabelHCav.setText("" + currentPlayer.getHCav());
            jLabelCivilians.setText("" + currentPlayer.getCivilian());
            turn = 1;
            player1.counter();
            player2.counter();
        }
       jTextAreaStatus.setText(currentPlayer.getName() + " It's your turn.");

    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jTextFieldBuyLInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuyLInfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuyLInfActionPerformed

    private void jTextFieldBuyLCavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuyLCavActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuyLCavActionPerformed

    private void jTextFieldConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConvertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConvertActionPerformed

    private void jButtonTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrainActionPerformed
        int soldier1 = 0, soldier2 = 0, soldier3 = 0, soldier4 = 0, amount=0;
        if (jTextFieldBuyLInf.getText() != null && !"".equals(jTextFieldBuyLInf.getText())) {
            soldier1 = Integer.parseInt(jTextFieldBuyLInf.getText());
        }
        if (jTextFieldBuyHInf.getText() != null && !"".equals(jTextFieldBuyHInf.getText())) {
            soldier2 = Integer.parseInt(jTextFieldBuyHInf.getText());
        }
        if (jTextFieldBuyLCav.getText() != null && !"".equals(jTextFieldBuyLCav.getText())) {
            soldier3 = Integer.parseInt(jTextFieldBuyLCav.getText());
        }
        if (jTextFieldBuyHCav.getText() != null && !"".equals(jTextFieldBuyHCav.getText())) {
            soldier4 = Integer.parseInt(jTextFieldBuyHCav.getText());
        }
        currentPlayer.train(soldier1, soldier2, soldier3, soldier4);
       if (jTextFieldConvert.getText() != null && !"".equals(jTextFieldConvert.getText())){
        amount = Integer.parseInt(jTextFieldConvert.getText()); soldier1 = Integer.parseInt(jLabelLightInf.getText()); soldier2 = Integer.parseInt(jLabelHinf.getText()); soldier3 = Integer.parseInt(jLabelLCav.getText()); soldier4 = Integer.parseInt(jLabelHCav.getText());
        control.convert(soldier1, soldier2, soldier3, soldier4,amount);
       }
    }//GEN-LAST:event_jButtonTrainActionPerformed

    private void jTextFieldBuyHInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuyHInfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuyHInfActionPerformed

    private void jTextFieldBuyLInfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuyLInfKeyReleased
        try {
            Integer.parseInt(jTextFieldBuyLInf.getText());
        } catch (NumberFormatException ex) {
            if (jTextFieldBuyLInf.getText().length() == 0) {
                jTextFieldBuyLInf.setText(null);
            } else {
                boolean tryOut = false;
                while (!tryOut) {
                    try {
                        if (jTextFieldBuyLInf.getText().length() == 0) {
                            tryOut = true;
                        } else {
                            Integer.parseInt(jTextFieldBuyLInf.getText());
                            tryOut = true;
                        }
                    } catch (NumberFormatException nu) {
                        jTextFieldBuyLInf.setText(jTextFieldBuyLInf.getText().substring(0, jTextFieldBuyLInf.getText().length() - 1));
                    }
                }
            }
        }
    }//GEN-LAST:event_jTextFieldBuyLInfKeyReleased

    private void jTextFieldBuyHInfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuyHInfKeyReleased
        try {
            Integer.parseInt(jTextFieldBuyHInf.getText());
        } catch (NumberFormatException ex) {
            if (jTextFieldBuyHInf.getText().length() == 0) {
                jTextFieldBuyHInf.setText(null);
            } else {
                boolean tryOut = false;
                while (!tryOut) {
                    try {
                        if (jTextFieldBuyHInf.getText().length() == 0) {
                            tryOut = true;
                        } else {
                            Integer.parseInt(jTextFieldBuyHInf.getText());
                            tryOut = true;
                        }
                    } catch (NumberFormatException nu) {
                        jTextFieldBuyHInf.setText(jTextFieldBuyHInf.getText().substring(0, jTextFieldBuyHInf.getText().length() - 1));
                    }
                }
            }
        }
    }//GEN-LAST:event_jTextFieldBuyHInfKeyReleased

    private void jTextFieldBuyLCavKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuyLCavKeyReleased
        try {
            Integer.parseInt(jTextFieldBuyLCav.getText());
        } catch (NumberFormatException ex) {
            if (jTextFieldBuyLCav.getText().length() == 0) {
                jTextFieldBuyLCav.setText(null);
            } else {
                boolean tryOut = false;
                while (!tryOut) {
                    try {
                        if (jTextFieldBuyLCav.getText().length() == 0) {
                            tryOut = true;
                        } else {
                            Integer.parseInt(jTextFieldBuyLCav.getText());
                            tryOut = true;
                        }
                    } catch (NumberFormatException nu) {
                        jTextFieldBuyLCav.setText(jTextFieldBuyLCav.getText().substring(0, jTextFieldBuyLCav.getText().length() - 1));
                    }
                }
            }
        }
    }//GEN-LAST:event_jTextFieldBuyLCavKeyReleased

    private void jTextFieldBuyHCavKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuyHCavKeyReleased
        try {
            Integer.parseInt(jTextFieldBuyHCav.getText());
        } catch (NumberFormatException ex) {
            if (jTextFieldBuyHCav.getText().length() == 0) {
                jTextFieldBuyHCav.setText(null);
            } else {
                boolean tryOut = false;
                while (!tryOut) {
                    try {
                        if (jTextFieldBuyHCav.getText().length() == 0) {
                            tryOut = true;
                        } else {
                            Integer.parseInt(jTextFieldBuyHCav.getText());
                            tryOut = true;
                        }
                    } catch (NumberFormatException nu) {
                        jTextFieldBuyHCav.setText(jTextFieldBuyHCav.getText().substring(0, jTextFieldBuyHCav.getText().length() - 1));
                    }
                }
            }
        }
    }//GEN-LAST:event_jTextFieldBuyHCavKeyReleased

    private void jTextFieldConvertKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldConvertKeyReleased
        try {
            Integer.parseInt(jTextFieldConvert.getText());
        } catch (NumberFormatException ex) {
            if (jTextFieldConvert.getText().length() == 0) {
                jTextFieldConvert.setText(null);
            } else {
                boolean tryOut = false;
                while (!tryOut) {
                    try {
                        if (jTextFieldConvert.getText().length() == 0) {
                            tryOut = true;
                        } else {
                            Integer.parseInt(jTextFieldConvert.getText());
                            tryOut = true;
                        }
                    } catch (NumberFormatException nu) {
                        jTextFieldConvert.setText(jTextFieldConvert.getText().substring(0, jTextFieldConvert.getText().length() - 1));
                    }
                }
            }
        }
    }//GEN-LAST:event_jTextFieldConvertKeyReleased

    private void jRadioButtonWallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonWallActionPerformed
        currentPlayer.build(3);
    }//GEN-LAST:event_jRadioButtonWallActionPerformed

    private void jRadioButtonSiegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSiegeActionPerformed
        currentPlayer.build(7);
    }//GEN-LAST:event_jRadioButtonSiegeActionPerformed

    private void jRadioButtonBarrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBarrackActionPerformed
       currentPlayer.build(1);
    }//GEN-LAST:event_jRadioButtonBarrackActionPerformed

    private void jRadioButtonStableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonStableActionPerformed
        currentPlayer.build(2);
    }//GEN-LAST:event_jRadioButtonStableActionPerformed

    private void jRadioButtonGreatWallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGreatWallActionPerformed
       currentPlayer.build(4);
    }//GEN-LAST:event_jRadioButtonGreatWallActionPerformed

    private void jRadioButtonMarketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMarketActionPerformed
        currentPlayer.build(5);
    }//GEN-LAST:event_jRadioButtonMarketActionPerformed

    private void jRadioButtonSpecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSpecialActionPerformed
      currentPlayer.build(6);
    }//GEN-LAST:event_jRadioButtonSpecialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
                player1name = JOptionPane.showInputDialog(null, "Player 1 write your name");
                player2name = JOptionPane.showInputDialog(null, "Player 2 write your name");

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonStart;
    private javax.swing.JButton jButtonTrain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCivilians;
    private javax.swing.JLabel jLabelCurrentPlayer;
    private javax.swing.JLabel jLabelGold;
    private javax.swing.JLabel jLabelHCav;
    private javax.swing.JLabel jLabelHinf;
    private javax.swing.JLabel jLabelLCav;
    private javax.swing.JLabel jLabelLightInf;
    private javax.swing.JRadioButton jRadioButtonBarrack;
    private javax.swing.JRadioButton jRadioButtonGreatWall;
    private javax.swing.JRadioButton jRadioButtonMarket;
    private javax.swing.JRadioButton jRadioButtonSiege;
    private javax.swing.JRadioButton jRadioButtonSpecial;
    private javax.swing.JRadioButton jRadioButtonStable;
    private javax.swing.JRadioButton jRadioButtonWall;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaStatus;
    private javax.swing.JTextField jTextFieldBuyHCav;
    private javax.swing.JTextField jTextFieldBuyHInf;
    private javax.swing.JTextField jTextFieldBuyLCav;
    private javax.swing.JTextField jTextFieldBuyLInf;
    private javax.swing.JTextField jTextFieldConvert;
    // End of variables declaration//GEN-END:variables
}
