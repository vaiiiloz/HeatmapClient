package utils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Renderer {

    public static BufferedImage insertHeatmap(BufferedImage background, BufferedImage heatmap ){
        addImage(background, heatmap, 0.4f);
        return background;
    }

    private static void addImage(BufferedImage buff1, BufferedImage buff2, final float opaque){

        Graphics2D g2d = buff1.createGraphics();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,opaque));

        g2d.drawImage(buff2,0,0,null);
        g2d.dispose();
    }
}
