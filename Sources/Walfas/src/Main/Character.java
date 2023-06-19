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



    // Instance vars
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
