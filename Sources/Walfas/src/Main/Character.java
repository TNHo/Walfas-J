/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * FILE: Character.java
 * DATE: June 19, 2023
 * AUTHOR: TNHo
 * VERSION: 1.0
 * PURPOSE: Character info
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Notes:
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package Main;

import java.awt.image.BufferedImage;

public class Character {
    // Constructor
    public Character() {
        imgShoe = new BufferedImageGen();
        imgHead1 = new BufferedImageGen();
        imgHead2 = new BufferedImageGen();
        imgHair1 = new BufferedImageGen();
        imgHair2 = new BufferedImageGen();
        imgArm = new BufferedImageGen();
        imgBody = new BufferedImageGen();
        imgHat = new BufferedImageGen();
        imgEyes = new BufferedImageGen();
        imgMouth = new BufferedImageGen();
        characterArray = new BufferedImageGen[10];
        xPositions = new int[10];
        yPositions = new int[10];
        speedVal = 2;
        shoeXPos = 0; // 0
        shoeYPos = 0;
        headX1Pos = 0; // 1
        headY1Pos = 0;
        headX2Pos = 0; // 2
        headY2Pos = 0;
        hairX1Pos = 0; // 3
        hairY1Pos = 0;
        hairX2Pos = 0; // 4
        hairY2Pos = 0;
        armXPos = 0; // 5
        armYPos = 0;
        bodyXPos = 0; // 6
        bodyYPos = 0;
        hatXPos = 0; // 7
        hatYPos = 0;
        eyeXPos = 0; // 8
        eyeYPos = 0;
        mouthXPos = 0; // 9
        mouthYPos = 0;
    }

    /**
     * Grab the image required from the array.
     *
     * @param sel   The selection of whatever character part.
     * @return      A specific entry in characterArray.
     */
    public BufferedImageGen getCharaImg(int sel) {
        return characterArray[sel];
    }

    /**
     * Grab the appropriate position from the array.
     *
     * @param sel   The selection of whatever character part.
     * @return      A specific position based on choice.
     */
    public int getXPositions(int sel) {
        return xPositions[sel];
    }

    /**
     * Grab the appropriate position from the array.
     *
     * @param sel   The selection of whatever character part.
     * @return      A specific position based on choice.
     */
    public int getYPositions(int sel) {
        return yPositions[sel];
    }

    /**
     * Build the Walfas character.
     * 
     * @param DNA   Literally what it says on the tin. It gets
     *              passed into an instance of BuildChar
     */
    public void buildCharacter(String DNA) {
        BuildChar charaPath = new BuildChar(DNA);
        charaPath.checkDNAVer();
        charaIndex.splitDNA(DNA);
        // Set bufferedimages
        imgShoe.setBufferedImg(charaPath.getShoePath());
        imgHead1.setBufferedImg(charaPath.getHead1Path());
        imgHead2.setBufferedImg(charaPath.getHead2Path());
        imgHair1.setBufferedImg(charaPath.getHair1Path());
        imgHair2.setBufferedImg(charaPath.getHair2Path());
        imgArm.setBufferedImg(charaPath.getArmPath());
        imgBody.setBufferedImg(charaPath.getBodyPath());
        imgHat.setBufferedImg(charaPath.getHatPath());
        imgMouth.setBufferedImg(charaPath.getMouthPath());
        imgEyes.setBufferedImg(charaPath.getEyePath());
        // Set X and Y pos
        shoeXPos = charaPos.getShoeX(Integer.parseInt(charaIndex.getShoes()));
        shoeYPos = charaPos.getShoeY(Integer.parseInt(charaIndex.getShoes()));
        headX1Pos = charaPos.getHeadX(0);
        headY1Pos = charaPos.getHeadY(0);
        headX2Pos = charaPos.getHeadX(1);
        headY2Pos = charaPos.getHeadY(1);
        hairX1Pos = charaPos.getHair1X(Integer.parseInt(charaIndex.getHair()));
        hairY1Pos = charaPos.getHair1Y(Integer.parseInt(charaIndex.getHair()));
        hairX2Pos = charaPos.getHair2X(Integer.parseInt(charaIndex.getHair()));
        hairY2Pos = charaPos.getHair2Y(Integer.parseInt(charaIndex.getHair()));
        armXPos = charaPos.getArmX(Integer.parseInt(charaIndex.getArm()));
        armYPos = charaPos.getArmY(Integer.parseInt(charaIndex.getArm()));
        bodyXPos = charaPos.getBodyX(Integer.parseInt(charaIndex.getBody()));
        bodyYPos = charaPos.getBodyY(Integer.parseInt(charaIndex.getBody()));
        hatXPos = charaPos.getHatX(Integer.parseInt(charaIndex.getHat()));
        hatYPos = charaPos.getHatY(Integer.parseInt(charaIndex.getHat()));
        eyeXPos = charaPos.getEyesX(Integer.parseInt(charaIndex.getEyes()));
        eyeYPos = charaPos.getEyesY(Integer.parseInt(charaIndex.getEyes()));
        mouthXPos = charaPos.getMouthX(Integer.parseInt(charaIndex.getMouth()));
        mouthYPos = charaPos.getMouthY(Integer.parseInt(charaIndex.getMouth()));
        assignIndex();
    }

    /**
     * Sends the x and y params to an instance of ImgPos
     * to change the position of the body, which in turn,
     * changes the character's location since all the parts
     * are linked to it.
     *
     * @param x     The 'x' position
     * @param y     The 'y' position
     */
    public void changePos(int x, int y) {
        charaPos.changeBodyX(x);
        charaPos.changeBodyY(y);
    }

    public void assignIndex() {
        // Set bufferedimage array indexes
        characterArray[0] = imgShoe;
        characterArray[1] = imgHead1;
        characterArray[2] = imgHead2;
        characterArray[3] = imgHair1;
        characterArray[4] = imgHair2;
        characterArray[5] = imgArm;
        characterArray[6] = imgBody;
        characterArray[7] = imgHat;
        characterArray[8] = imgEyes;
        characterArray[9] = imgMouth;
        // X pos
        xPositions[0] = shoeXPos;
        xPositions[1] = headX1Pos;
        xPositions[2] = headX2Pos;
        xPositions[3] = hairX1Pos;
        xPositions[4] = hairX2Pos;
        xPositions[5] = armXPos;
        xPositions[6] = bodyXPos;
        xPositions[7] = hatXPos;
        xPositions[8] = eyeXPos;
        xPositions[9] = mouthXPos;
        // Y pos
        yPositions[0] = shoeYPos;
        yPositions[1] = headY1Pos;
        yPositions[2] = headY2Pos;
        yPositions[3] = hairY1Pos;
        yPositions[4] = hairY2Pos;
        yPositions[5] = armYPos;
        yPositions[6] = bodyYPos;
        yPositions[7] = hatYPos;
        yPositions[8] = eyeYPos;
        yPositions[9] = mouthYPos;
    }

    // Instance vars
    private SplitChar charaIndex = new SplitChar();
    private ImgPos charaPos = new ImgPos();
    private BufferedImage leImage;
    private String DNAString;
    private boolean isFlipped;
    private BufferedImageGen imgShoe;
    private BufferedImageGen imgHead1;
    private BufferedImageGen imgHead2;
    private BufferedImageGen imgHair1;
    private BufferedImageGen imgHair2;
    private BufferedImageGen imgArm;
    private BufferedImageGen imgBody;
    private BufferedImageGen imgHat;
    private BufferedImageGen imgEyes;
    private BufferedImageGen imgMouth;
    private BufferedImageGen[] characterArray;
    private int[] xPositions;
    private int[] yPositions;
    private int speedVal;
    private int shoeXPos;
    private int shoeYPos;
    private int headX1Pos;
    private int headY1Pos;
    private int headX2Pos;
    private int headY2Pos;
    private int hairX1Pos;
    private int hairY1Pos;
    private int hairX2Pos;
    private int hairY2Pos;
    private int armXPos;
    private int armYPos;
    private int bodyXPos;
    private int bodyYPos;
    private int hatXPos;
    private int hatYPos;
    private int eyeXPos;
    private int eyeYPos;
    private int mouthXPos;
    private int mouthYPos;
}
