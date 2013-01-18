/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import utility.*;

/**
 *
 * @author DragønEye
 */
public class IO {
    int count = 0;

    public void save(Player pla) {
        String file;
        if (count == 0){
            file = "save1.ser";
            count ++;
        } else {
            file = "save2.ser";
        }
        try {
            FileOutputStream writer = new FileOutputStream(new File(file));
            ObjectOutputStream out = new ObjectOutputStream(writer);
            out.writeObject(pla);
            out.flush();
            out.close();
            writer.flush();
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Player load() {
        String file;
        if (count == 1){
            file = "save1.ser";
            count ++;
        } else {
            file = "save2.ser";
        }
        Player pla= null;
        try {
            FileInputStream fileIn =
                    new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            pla = (Player) in.readObject();
            in.close();
            fileIn.close();
        } catch (Exception ex) {
        }
        return pla;
    }
}
