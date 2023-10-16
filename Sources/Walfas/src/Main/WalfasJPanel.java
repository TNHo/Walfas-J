/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * FILE: WalfasJPanel.java
 * DATE: June 19, 2023
 * AUTHOR: TNHo
 * VERSION: 1.0
 * PURPOSE: Load SVG images
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Notes:
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;
import javax.swing.JPanel.*;
import java.util.ArrayList;
import java.util.Random;

public class WalfasJPanel extends JPanel implements ActionListener, Runnable, MouseMotionListener{
    private int x;
    private int y;
    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        // Debug prints
        //System.out.println("X pos is "+x);
        //System.out.println("Y pos is "+y+"\n");
        c1.changePos(x, y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
    public WalfasJPanel(JButton button) {
        button.addActionListener(this);
    }

    public void run() {
        try {
            this.addMouseMotionListener(this); // Allows us to have mouse inputs
        } catch(Exception err) {
            System.out.println(err);
        }
        while (true) {
            try {
                Thread.sleep(33); // adjust this value as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    public void actionPerformed(ActionEvent ae) {
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //unitTest(g);
        runGame(g);
    }

    public void runGame(Graphics g) {
        c1.buildCharacter("3.4:Kanako (2):100:163:163:168:158:44:0:0:0:0:73:6767E4:FFF1DD:0");
        //c1.buildCharacter("3.4:Kanako (2):100:163:163:168:158:44:0:1:0:0:73:6767E4:FFF1DD:0"); // with mouth test
        // Why, just why?! WHY DID I DO THIS?! THIS IS SO HARD TO F#CKING READ AND DEBUG!!! But it works, we just have to find another way later...
        // Every position of each part will be based on the position of 'Body' or index 6
        g.drawImage(c1.getCharaImg(0).getImage(), c1.getXPositions(0)+c1.getXPositions(6), c1.getYPositions(6)-c1.getYPositions(0), this); // Shoes
        g.drawImage(c1.getCharaImg(1).getImage(), c1.getXPositions(1)+c1.getXPositions(6), c1.getYPositions(6)-c1.getYPositions(1), this); // Head 1
        g.drawImage(c1.getCharaImg(2).getImage(), c1.getXPositions(2)+c1.getXPositions(6), c1.getYPositions(6)-c1.getYPositions(2), this); // Head 2
        g.drawImage(c1.getCharaImg(3).getImage(), c1.getXPositions(3)+c1.getXPositions(6), c1.getYPositions(6)-c1.getYPositions(3), this); // Hair 1
        g.drawImage(c1.getCharaImg(4).getImage(), c1.getXPositions(4)+c1.getXPositions(6), c1.getYPositions(6)-c1.getYPositions(4), this); // Hair 2
        g.drawImage(c1.getCharaImg(5).getImage(), c1.getXPositions(5)+c1.getXPositions(6), c1.getYPositions(6)-c1.getYPositions(5), this); // Arm
        g.drawImage(c1.getCharaImg(6).getImage(), c1.getXPositions(6), c1.getYPositions(6), this);                                                       // Body, aka the part everything is linked to
        g.drawImage(c1.getCharaImg(7).getImage(), c1.getXPositions(7)+c1.getXPositions(6), c1.getYPositions(6)-c1.getYPositions(7), this); // Hat
        g.drawImage(c1.getCharaImg(8).getImage(), c1.getXPositions(8)+c1.getXPositions(6), c1.getYPositions(6)-c1.getYPositions(8), this); // Eyes
        g.drawImage(c1.getCharaImg(9).getImage(), c1.getXPositions(9)+c1.getXPositions(6), c1.getYPositions(6)-c1.getYPositions(9), this); // Mouth
        // System.out.println(c1.getXPositions(6)); print position of body for debugging
    }

    public void unitTest(Graphics g) {

    }

    private Character c1 = new Character();
}
