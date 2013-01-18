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

    public void save(Control con) {
        try {
            FileOutputStream writer = new FileOutputStream(new File("saveData.ser"));
            ObjectOutputStream out = new ObjectOutputStream(writer);
            out.writeObject(con);
            out.flush();
            out.close();
            writer.flush();
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Control load() {
        Control con= null;
        try {
            FileInputStream fileIn =
                    new FileInputStream("saveData.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            con = (Control) in.readObject();
            in.close();
            fileIn.close();
        } catch (Exception ex) {
        }
        return con;
    }
}
