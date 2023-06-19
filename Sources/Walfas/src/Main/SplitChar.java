/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * FILE: SplitChar.java
 * DATE: Dec 4, 2022
 * AUTHOR: TNHo
 * VERSION: 1.0
 * PURPOSE: Assembles characters based off their DNA
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * NOTE - I'm cooking lots of spaghetti (which is bad) - TNHo
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
/*
 * Walfas DNA (3.4) is usually broken up as:
 * Create type: Name: Size: Hat: Hair: Body: Arm: Shoes: Eyes: Mouth: Item: Accessories:
 * Back: HairColor: SkinColor: Effects.
 * Walfas DNA (3.39) is usually broken up as:
 * Create type: Name: Size: Hat: Hair: Body: Arm: Shoes: Eyes: Mouth: Items: Accessories:
 * Back: HairColor
 */
package Main;

public class SplitChar {

    public SplitChar() {
        DNAdata = "";
        createType = "";
        charName = "";
        charSize = "";
        hat = "";
        hair = "";
        body = "";
        arm = "";
        shoes = "";
        eyes = "";
        mouth = "";
        items = "";
        accessories = "";
        back = "";
        hairCol = "";
        skinCol = "";
        effects = "";
    }

    public String getCreateType() {
        return createType;
    }
    public String getName() {
        return charName;
    }
    public String getCharSize() {
        return charSize;
    }
    public String getHat() {
        return hat;
    }
    public String getHair() {
        return hair;
    }
    public String getBody() {
        System.out.println(body + " RETURNED!");
        return body;
    }
    public String getArm() {
        return arm;
    }
    public String getShoes() {
        return shoes;
    }
    public String getEyes() {
        return eyes;
    }
    public String getMouth() {
        return mouth;
    }
    public String getItems() {
        return items;
    }
    public String getAccessories() {
        return accessories;
    }
    public String getBack() {
        return back;
    }
    public String getHairCol() {
        return hairCol;
    }
    public String getSkinCol() {
        return skinCol;
    }
    public String getEffects() {
        return effects;
    }

//          1:    2:    3:   4:    5:    6:   7:     8:    9:    10:   11:          12:   13:        14:        15:      16:
//Create type: Name: Size: Hat: Hair: Body: Arm: Shoes: Eyes: Mouth: Item: Accessories: Back: HairColor: SkinColor: Effects. 3-4
//Create type: Name: Size: Hat: Hair: Body: Arm: Shoes: Eyes: Mouth: Item: Accessories: Back: HairColor 3-39
    public void splitDNA(String dna) {
        // Process to split the string by the : delimiter
        //Print out these values to test, effects don't seem to work :/
        System.out.println(dna);
        System.out.println(createType);
        System.out.println(charName);
        System.out.println(charSize);
        System.out.println(hat);
        System.out.println(hair);
        System.out.println(body);
        System.out.println(arm);
        System.out.println(shoes);
        System.out.println(eyes);
        System.out.println(mouth);
        System.out.println(items);
        System.out.println(accessories);
        System.out.println(back);
        System.out.println(hairCol);
        System.out.println(skinCol);
        System.out.println(effects);
    }

    //Declare globals
    private String DNAdata;
    private String createType;
    private String charName;
    private String charSize;
    private String hat;
    private String hair;
    private String body;
    private String arm;
    private String shoes;
    private String eyes;
    private String mouth;
    private String items;
    private String accessories;
    private String back;
    private String hairCol;
    private String skinCol;
    private String effects;
}