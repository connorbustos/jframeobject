package main;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/* Basic class used to create a JFrame object, paint method paints a rectangle in the jframe
 * @author Connor Bustos 
 */

public class NewFrame extends JFrame {

    public NewFrame(int width, int height, boolean resizable, String title) {
        setSize(width, height);
        setTitle(title);
        setResizable(resizable);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void showFrame(boolean showFrame) {
        setVisible(showFrame);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        //random values used to display a rectangle, not centered or anything like that. 
        g.fillRect(200, 200, 500, 250);
    }

}
