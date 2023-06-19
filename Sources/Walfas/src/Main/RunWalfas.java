/**
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* FILE: RunWalfas.java
* DATE: June 13, 2023 
* AUTHOR: TNHo
* VERSION: 1.0
* PURPOSE: Displays the window, this is where the main method is.
*
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* Notes: A version of Walfas completely rebuilt from the ground up using
* the java programming language. 
* This is just a project I'm doing for fun.
*
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* TO DO LIST:
* -Get key inputs working (Space to hide, hotkeys to manipulate characters, etc)
* -DNA Implementation
* -Add BGs
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/

package Main;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class RunWalfas {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Create.jar");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(true);
        jf.setSize(1000, 800);
        Container c = jf.getContentPane();
        JButton nextPix = new JButton("");
        WalfasJPanel flp = new WalfasJPanel(nextPix);
        jf.add(flp);
        jf.setVisible(true);
        jf.setLayout(null);
        Thread t = new Thread(flp);
        t.start();
    }
}
