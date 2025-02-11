/**
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* FILE: BuildChar.java
* DATE: Dec 5, 2022 
* AUTHOR: TNHo
* VERSION: 1.0
* PURPOSE: Build the character based off the DNA data obtained.
*
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* NOTES: This is where the fun begins...
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package Main;

public class BuildChar {
    public BuildChar() {
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
        sizeVal = 0;
        hatVal = 0;
        hairVal = 0;
        bodyVal = 0;
        armVal = 0;
        shoesVal = 0;
        eyesVal = 0;
        mouthVal = 0;
        itemsVal = 0;
        accessoriesVal = 0;
        backVal = 0;
        effectsVal = 0;
        headImg1Path = "";
        headImg2Path = "";
        bodyImgPath = "";
        hair1Path = "";
        hair2Path = "";
        hatPath = "";
        shoePath = "";
        mouthPath = "";
        eyePath = "";
        backPath = "";
        itemPath = "";
        accessoryPath = "";
        armPath = "";
        xHairPos = 0;
        yHairPos = 0;
        xHair2Pos = 0;
        yHair2Pos = 0;
    }

    /**
     * Sets those variables to their corresponding values,
     * based on what was present in the DNA value.
     *
     * @param DNA    The DNA String.
     */
    public BuildChar(String DNA) {
        try {
        //Allow access to AssembleChar class
        SplitChar chara = new SplitChar();
        //Send our preset DNA to be split
        chara.splitDNA(DNA);
        //Retrieve individual DNA values
        createType = chara.getCreateType();
        charName = chara.getName();
        charSize = chara.getCharSize();
        hat = chara.getHat();
        hair = chara.getHair();
        body = chara.getBody();
        arm = chara.getArm();
        shoes = chara.getShoes();
        eyes = chara.getEyes();
        mouth = chara.getMouth();
        items = chara.getItems();
        accessories = chara.getAccessories();
        back = chara.getBack();
        hairCol = chara.getHairCol();
        skinCol = chara.getSkinCol();
        effects = chara.getEffects();
        //Convert the DNA num strings into integers
        sizeVal = Integer.parseInt(charSize);
        hatVal = Integer.parseInt(hat);
        hairVal = Integer.parseInt(hair);
        bodyVal = Integer.parseInt(body);
        armVal = Integer.parseInt(arm);
        shoesVal = Integer.parseInt(shoes);
        eyesVal = Integer.parseInt(eyes);
        mouthVal = Integer.parseInt(mouth);
        itemsVal = Integer.parseInt(items);
        accessoriesVal = Integer.parseInt(accessories);
        backVal = Integer.parseInt(back);
        effectsVal = Integer.parseInt(effects);

        } catch (Exception e) {
            System.out.println("OH NO!!!");
            System.out.println(e);
        }
    }

    /**
     * Checking which Walfas DNA types is being used.
     * Must maintain compatibility between the original
     * Walfas and the createX version.
     */
    public void checkDNAVer() {
        try {
            double createVer = Double.parseDouble(createType);
            if (createVer == 3.4) {
                create339(); //Call the original first
                create34(); //Call the addons
            } 
            if (createVer == 3.39) {
                create339(); //Only call the original
            }
        } catch (Exception e) {
            System.out.println(e); //OH, NO!
        }
    }

    /**
     * Fields for original KirbyM DNA type.
     * Assembles the file paths for the .SVG images,
     * based on the values set.
     */
    public void create339() {
        SVGData svgPath = new SVGData();
        ImgPos lePos = new ImgPos();
        // System.out.println(bodyVal + " MOVED!"); // Debug print
        try {
            //Set head path
            headImg1Path = "Main/SVGImages/Basichead/0.svg";
            headImg2Path = "Main/SVGImages/Basichead/1.svg";
            //Set body path
            bodyImgPath = "Main/SVGImages/body/"+svgPath.getBody(bodyVal)+".svg";
            if (bodyImgPath.compareTo("Main/SVGImages/body/-1.svg") == 0) {//case for -1
                bodyImgPath = "Main/SVGImages/Empty/0.svg";
            }
            //Set hair paths
            hair1Path = "Main/SVGImages/Hair/"+svgPath.getHair(hairVal)+".svg";
            hair2Path = "Main/SVGImages/Hair2/"+svgPath.getHair2(hairVal)+".svg";
            //Set hat path
            hatPath = "Main/SVGImages/Hats/"+svgPath.getHat(hatVal)+".svg";
            if (hatPath.compareTo("Main/SVGImages/Hats/-1.svg") == 0) {//case for -1
                hatPath = "Main/SVGImages/Empty/0.svg";
            }
            //Set hair and hair2 x and y pos
            xHairPos = lePos.getHair1X(hairVal);
            xHair2Pos = lePos.getHair2X(hairVal);
            yHairPos = lePos.getHair1Y(hairVal);
            yHair2Pos = lePos.getHair2Y(hairVal);

            //Set shoe path
            shoePath = "Main/SVGImages/Shoes/"+svgPath.getShoe(shoesVal)+".svg";
            //Set mouth path
            mouthPath = "Main/SVGImages/Mouth/"+svgPath.getMouth(mouthVal)+".svg";
            if (mouthPath.compareTo("Main/SVGImages/Mouth/-1.svg") == 0) {//case for -1
                mouthPath = "Main/SVGImages/Empty/0.svg";
            }
            //Set eyes path
            eyePath = "Main/SVGImages/Eyes/"+svgPath.getEye(eyesVal)+".svg";
            //Set accessories path
            accessoryPath = "Main/SVGImages/Accessories/"+svgPath.getAccesories(accessoriesVal)+".svg";
            if (accessoryPath.compareTo("Main/SVGImages/Accessories/-1.svg") == 0) {//case for -1
                accessoryPath = "Main/SVGImages/Empty/0.svg";
            }
            //Set item path
            itemPath = "Main/SVGImages/Items/"+svgPath.getItems(itemsVal)+".svg";
            if (itemPath.compareTo("Main/SVGImages/Items/-1.svg") == 0) {//case for -1
                itemPath = "Main/SVGImages/Empty/0.svg";
            }
            //Set back path
            backPath = "Main/SVGImages/Wings/"+svgPath.getBack(backVal)+".svg";
            if (backPath.compareTo("Main/SVGImages/Wings/-1.svg") == 0) {//case for -1
                backPath = "Main/SVGImages/Empty/0.svg";
            }
            //Set arm path
            armPath = "Main/SVGImages/Arms/"+svgPath.getArm(armVal)+".svg";
            if (armPath.compareTo("Main/SVGImages/Arms/-1.svg") == 0) {//case for -1
                armPath = "Main/SVGImages/Empty/0.svg";
            }
        } catch (Exception e) {
            System.out.println("OH NO!");
            System.out.println(e);
        }
    }

    /**
     * Extra fields for create.X DNA types.
     * Not yet implemented...
     */
    public void create34() {
        
    }
    
    //Return all the paths back to walfasGUI
    public int getHairX1Pos() {
        return xHairPos;
    }
    public int getHairY1Pos() {
        return yHairPos;
    }
    public int getHairX2Pos() {
        return xHair2Pos;
    }
    public int getHairY2Pos() {
        return yHair2Pos;
    }
    public String getBackPath() {
        return backPath;
    }
    public String getItemPath() {
        return itemPath;
    }
    public String accessoriPath() {
        return accessoryPath;
    }
    public String getEyePath() {
        return eyePath;
    }
    public String getMouthPath() {
        return mouthPath;
    }
    public String getShoePath() {
        return shoePath;
    }
    public String getHatPath() {
        return hatPath;
    }
    public String getHair1Path() {
        return hair1Path;
    }
    public String getHair2Path() {
        return hair2Path;
    }
    public String getHead1Path() {
        return headImg1Path;
    }
    public String getHead2Path() {
        return headImg2Path;
    }
    public String getBodyPath() {
        return bodyImgPath;
    }
    public String getArmPath() {
        return armPath;
    }
    
    //Declare globals
    private int xHairPos;
    private int yHairPos;
    private int xHair2Pos;
    private int yHair2Pos;
    private String armPath;
    private String backPath;
    private String itemPath;
    private String accessoryPath;
    private String eyePath;
    private String mouthPath;
    private String shoePath;
    private String hatPath;
    private String hair2Path;
    private String hair1Path;
    private String bodyImgPath;
    private String headImg2Path;
    private String headImg1Path;
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
    private int sizeVal;
    private int hatVal;
    private int hairVal;
    private int bodyVal;
    private int armVal;
    private int shoesVal;
    private int eyesVal;
    private int mouthVal;
    private int itemsVal;
    private int accessoriesVal;
    private int backVal;
    private int effectsVal;
}
