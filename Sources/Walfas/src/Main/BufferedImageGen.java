/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * FILE: BufferedImageGen.java
 * DATE: Dec 21, 2022
 * AUTHOR: TNHo
 * VERSION: 1.0
 * PURPOSE: Take in an SVG file path and converts it into a PNG. Send the PNG
 * to some classes where they are needed.
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package Main;

import org.apache.batik.dom.svg.BufferedImageGraphics2D;
import org.apache.batik.transcoder.TranscoderInput;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URI;
import java.net.URL;

public class BufferedImageGen {
    public BufferedImageGen() {
        leImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
    }

    /**
     * The getter for leImage
     * 
     * @return leImage      The result of letting Java Batik do its magic.
     * 
     */
    public BufferedImage getImage() {
        return leImage;
    }

    /**
     * Sends the .SVG image path and sets leImage to an actual image...
     * 
     * @param svgPath   The path of the .SVG image, which gets passed
     *                  into transcodeSVGImage() and creates some BufferedImage,
     *                  the thing we want...
     */
    public void setBufferedImg(String svgPath) {
        leImage = transcodeSVGImage(svgPath);
    }

    /**
     * Where Java Batik does stuff and gets us our image.
     * 
     * @param svgPath   The file path, without it we fall flat on our faces...
     * @return image    The resulting image...
     */
    public BufferedImage transcodeSVGImage(String svgPath) {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            URL fileURL = classLoader.getResource(svgPath);
            URI fileURI = fileURL.toURI();
            String filePath = fileURI.getPath();
            File file = new File(filePath);
            // Get the absolute path of the file
            filePath = file.getAbsolutePath();

            // Print the file path to the console for debug reasons
            // System.out.println(filePath);

            // Create a TranscoderInput object from the SVG file
            String svgURI = file.toURI().toString();

            TranscoderInput input = new TranscoderInput(svgURI);
            // Transcode the SVG image to a BufferedImage
            BufferedImage image = BufferedImageGraphics2D.transcodeSVGImage(input);
            //System.out.println(image);
            return image;
        } catch (Exception e) {
            //Prints the stack trace to help with debugging
            System.out.println(e);
            // Return a default image if an exception is thrown
            return new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        }
    }

    //Globals
    private BufferedImage leImage;
}
