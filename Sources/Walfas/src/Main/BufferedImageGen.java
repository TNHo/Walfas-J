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

    // Accessors
    public BufferedImage getImage() {
        return leImage;
    }

    // Mutators
    public void setBufferedImg(String svgPath) {
        leImage = transcodeSVGImage(svgPath);
    }

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
