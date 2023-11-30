/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * FILE: ImgPos.java
 * DATE: Dec 24, 2022
 * AUTHOR: TNHo
 * VERSION: 1.0
 * PURPOSE: Storage of hardcoded svg image positions
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * NOTE: This is a monstrosity...
 * We should probably dump these values onto a text file and read off of that...
 * It would definitely make the code below more... clean.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package Main;

public class ImgPos {
    public ImgPos() {
        xPosHair1 = 0;
        yPosHair1 = 0;
        xPosHair2 = 0;
        yPosHair2 = 0;
        xPosBack = 0;
        yPosBack = 0;
        xPosItem = 0;
        yPosItem = 0;
        xPosHat = 0;
        yPosHat = 0;
        xPosShoes = 0;
        yPosShoes = 0;
        xPosHead = 0;
        yPosHead = 0;
        xPosBody = 150;
        yPosBody = 200;
        xPosEyes = 0;
        yPosEyes = 0;
        xPosArm = 0;
        yPosArm = 0;
        xPosMouth = 0;
        yPosMouth = 0;
    }

    public int getHair1X(int sel) {
        try {
            int[] hair2XStore = {
                    17,
                    19,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10
            };
            xPosHair1 = hair2XStore[sel];
            return xPosHair1;
        } catch(Exception e) {
            //System.out.println(e);
            xPosHair1 = -2;
            return xPosHair1;
        }
    }
    public int getHair1Y(int sel) {
        try {
            int[] hair2YStore = {
                    60,
                    68,
                    50,
                    50,
                    50,
                    50,
                    50,
                    50,
                    50,
                    50,
                    50,
                    50
            };
            yPosHair1 = hair2YStore[sel];
            return yPosHair1;
        } catch(Exception e) {
            //System.out.println(e);
            yPosHair1 = 42; //Set default
            return yPosHair1; //Return default
        }
    }
    public int getHair2X(int sel) {
        try {
            int[] hair2XStore = {
                    10,
                    10,
                    10,
                    10,
                    10,
                    10,
                    10,
                    10,
                    10,
                    10,
                    10,
                    10,
                    10,
                    10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10,
                    -10
            };
            xPosHair2 = hair2XStore[sel];
            return xPosHair2;
        } catch(Exception e) {
            //System.out.println(e);
            xPosHair2 = -10;
            return xPosHair2;
        }
    }
    public int getHair2Y(int sel) {
        try {
            int[] hair2YStore = {
                    63,
                    75,
                    50,
                    50,
                    50,
                    50,
                    50,
                    50,
                    50,
                    50,
                    50
            };
            yPosHair2 = hair2YStore[sel];
            return yPosHair2;
        } catch(Exception e) {
            //System.out.println(e);
            yPosHair2 = 50; //Set default
            return yPosHair2; //Return default
        }
    }
    public int getBackX(int sel) {
        return xPosBack;
    }
    public int getBackY(int sel) {
        return yPosBack;
    }
    public int getItemX(int sel) {
        return xPosItem;
    }
    public int getItemY(int sel) {
        return yPosItem;
    }
    public int getHatX(int sel) {
        xPosHat = -90;
        return xPosHat;
    }
    public int getHatY(int sel) {
        yPosHat = 170;
        return yPosHat;
    }
    public int getShoeX(int sel) {
        xPosShoes = -37;
        return xPosShoes;
    }
    public int getShoeY(int sel) {
        yPosShoes = -248;
        return yPosShoes;
    }
    public int getHeadX(int sel) {
        if (sel == 0) {
            xPosHead = 40;
        } else {
            xPosHead = 58;
        }
        return xPosHead;
    }
    public int getHeadY(int sel) {
        if (sel == 0) {
            yPosHead = 16;
        } else {
            yPosHead = -40;
        }
        return yPosHead;
    }
    public int getBodyX(int sel) {
        return xPosBody;
    }
    public int getBodyY(int sel) {
        return yPosBody;
    }
    public void changeBodyX(int change) {
        xPosBody = change;
    }
    public void changeBodyY(int change) {
        yPosBody = change;
    }

    public int getEyesX(int sel) {
        xPosEyes = -3;
        return xPosEyes;
    }
    public int getEyesY(int sel) {
        yPosEyes = -14;
        return yPosEyes;
    }
    public int getArmX(int sel) {
        xPosArm = -13;
        return xPosArm;
    }
    public int getArmY(int sel) {
        yPosArm = -51;
        return yPosArm;
    }
    public int getMouthX(int sel) {
        xPosMouth = 0;
        return xPosMouth;
    }
    public int getMouthY(int sel) {
        yPosMouth = 0;
        return yPosMouth;
    }

    private int xPosHair1;
    private int yPosHair1;
    private int xPosHair2;
    private int yPosHair2;
    private int xPosBack;
    private int yPosBack;
    private int xPosItem;
    private int yPosItem;
    private int xPosHat;
    private int yPosHat;
    private int xPosShoes;
    private int yPosShoes;
    private int xPosHead;
    private int yPosHead;
    private int xPosBody;
    private int yPosBody;
    private int xPosEyes;
    private int yPosEyes;
    private int xPosArm;
    private int yPosArm;
    private int xPosMouth;
    private int yPosMouth;
}
