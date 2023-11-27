/**
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* FILE: BufferedImageGraphics2D.java
* DATE: Dec 17, 2022
* AUTHOR: ChatGPT
* VERSION: 1.0
* PURPOSE: This class is used to transcode SVG images.
*
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* Note: I'm surprised I even managed to get ChatGPT to generate something
*       that works...
*       Now I'm borrowing that code, permanently. Basically committing a 
*       Marisa Kirisame move, LOL!!!
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/

package org.apache.batik.dom.svg;

import java.awt.image.BufferedImage;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.ImageTranscoder;

public class BufferedImageGraphics2D extends ImageTranscoder {
    BufferedImage img;

    @Override
    public BufferedImage createImage(int w, int h) {
        img = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        return img;
    }

    @Override
    public void writeImage(BufferedImage image, TranscoderOutput out) {
        // Do nothing, since the image is already stored in the 'img' field.
    }

    public static BufferedImage transcodeSVGImage(TranscoderInput input) {
        BufferedImageGraphics2D transcoder = new BufferedImageGraphics2D();
        try {
            transcoder.transcode(input, null);
        } catch (Exception e) {
            System.out.println(e);
        }
        return transcoder.img;
    }
}
