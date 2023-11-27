/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * FILE: SVGData.java
 * DATE: Dec 5, 2022
 * AUTHOR: TNHo
 * VERSION: 1.5
 * PURPOSE: Database of SVGs
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * NOTE: The arrays were initially initialized with some String data in it,
 * but however it resulted in very long arrays taking up too many lines of
 * code. They now are initialized empty and a for loop is used to add the
 * String variables to the arrays.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package Main;

public class SVGData {
    public SVGData() {

    }
    //Store SVG file nums in an array, then send it to BuildChar
    public String getBody(int sel) {
        int rayNum = -1;
        String[] filePathNum = new String[401];
        for (int i = 0; i < 401; i++) {
            String rayStringNum = Integer.toString(rayNum);
            filePathNum[i] = rayStringNum;
            rayNum = rayNum + 1;
        }
        return filePathNum[sel];
    }

    public String getHair(int sel) {
        int rayNum = 0;
        String[] filePathNum = new String[400];
        for (int i = 0; i < 400; i++) {
            String rayStringNum = Integer.toString(rayNum);
            filePathNum[i] = rayStringNum;
            rayNum = rayNum + 1;
        }
        return filePathNum[sel];
    }

    public String getHair2(int sel) {
        int rayNum = 0;
        String[] filePathNum = new String[400];
        for (int i = 0; i < 400; i++) {
            String rayStringNum = Integer.toString(rayNum);
            filePathNum[i] = rayStringNum;
            rayNum = rayNum + 1;
        }
        return filePathNum[sel];
    }

    public String getHat(int sel) {
        int rayNum = -1;
        String[] filePathNum = new String[401];
        for (int i = 0; i < 401; i++) {
            String rayStringNum = Integer.toString(rayNum);
            filePathNum[i] = rayStringNum;
            rayNum = rayNum + 1;
        }
        return filePathNum[sel];
    }

    public String getShoe(int sel) {
        int rayNum = -1;
        String[] filePathNum = new String[401];
        for (int i = 0; i < 401; i++) {
            String rayStringNum = Integer.toString(rayNum);
            filePathNum[i] = rayStringNum;
            rayNum = rayNum + 1;
        }
        return filePathNum[sel];
    }

    public String getMouth(int sel) {
        int rayNum = -1;
        String[] filePathNum = new String[160];
        for (int i = 0; i < 160; i++) {
            String rayStringNum = Integer.toString(rayNum);
            filePathNum[i] = rayStringNum;
            rayNum = rayNum + 1;
        }
        return filePathNum[sel];
    }

    public String getEye(int sel) {
        int rayNum = 0;
        String[] filePathNum = new String[160];
        for (int i = 0; i < 160; i++) {
            String rayStringNum = Integer.toString(rayNum);
            filePathNum[i] = rayStringNum;
            rayNum = rayNum + 1;
        }
        return filePathNum[sel];
    }

    public String getBack(int sel) {
        int rayNum = -1;
        String[] filePathNum = new String[140];
        for (int i = 0; i < 140; i++) {
            String rayStringNum = Integer.toString(rayNum);
            filePathNum[i] = rayStringNum;
            rayNum = rayNum + 1;
        }
        return filePathNum[sel];
    }

    public String getAccesories(int sel) {
        int rayNum = -1;
        String[] filePathNum = new String[160];
        for (int i = 0; i < 160; i++) {
            String rayStringNum = Integer.toString(rayNum);
            filePathNum[i] = rayStringNum;
            rayNum = rayNum + 1;
        }
        return filePathNum[sel];
    }

    public String getItems(int sel) {
        int rayNum = -1;
        String[] filePathNum = new String[160];
        for (int i = 0; i < 160; i++) {
            String rayStringNum = Integer.toString(rayNum);
            filePathNum[i] = rayStringNum;
            rayNum = rayNum + 1;
        }
        return filePathNum[sel];
    }

    public String getArm(int sel) {
        int rayNum = -1;
        String[] filePathNum = new String[401];
        for (int i = 0; i < 401; i++) {
            String rayStringNum = Integer.toString(rayNum);
            filePathNum[i] = rayStringNum;
            rayNum = rayNum + 1;
        }
        return filePathNum[sel];
    }
}