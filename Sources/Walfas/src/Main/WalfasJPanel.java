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

public class WalfasJPanel extends JPanel implements ActionListener, Runnable {

    public WalfasJPanel(JButton button) {
        button.addActionListener(this);
    }

    public void run() {
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
        //repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //unitTest(g);
        runGame(g);
    }

    public void runGame(Graphics g) {

    }

    public void test(Graphics g) {

    }

}
