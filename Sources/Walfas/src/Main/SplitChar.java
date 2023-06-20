/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * FILE: SplitChar.java
 * DATE: June 20, 2023
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
        DNAParts = new String[16];
    }

    public String getCreateType() {
        return DNAParts[0];
    }
    public String getName() {
        return DNAParts[1];
    }
    public String getCharSize() {
        return DNAParts[2];
    }
    public String getHat() {
        return DNAParts[3];
    }
    public String getHair() {
        return DNAParts[4];
    }
    public String getBody() {
        return DNAParts[5];
    }
    public String getArm() {
        return DNAParts[6];
    }
    public String getShoes() {
        return DNAParts[7];
    }
    public String getEyes() {
        return DNAParts[8];
    }
    public String getMouth() {
        return DNAParts[9];
    }
    public String getItems() {
        return DNAParts[10];
    }
    public String getAccessories() {
        return DNAParts[11];
    }
    public String getBack() {
        return DNAParts[12];
    }
    public String getHairCol() {
        return DNAParts[13];
    }
    public String getSkinCol() {
        return DNAParts[14];
    }
    public String getEffects() {
        return DNAParts[15];
    }

//          1:    2:    3:   4:    5:    6:   7:     8:    9:    10:   11:          12:   13:        14:        15:      16:
//Create type: Name: Size: Hat: Hair: Body: Arm: Shoes: Eyes: Mouth: Item: Accessories: Back: HairColor: SkinColor: Effects. 3-4
//Create type: Name: Size: Hat: Hair: Body: Arm: Shoes: Eyes: Mouth: Item: Accessories: Back: HairColor 3-39
    public void splitDNA(String dna) {
        DNAParts = dna.split(":");

        // Process to split the string by the : delimiter
        System.out.println(dna);
        for(int i = 0; i < DNAParts.length; i++) {
            System.out.println(DNAParts[i]);
        }
    }

    //Declare globals
    private String[] DNAParts;
}