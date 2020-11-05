package imageviewer;

import UtilsPractica5.UtilsPractica5;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Chgv99
 * @author PabloOQ
 */

public class ImagePanel extends JPanel {
    
    private BufferedImage image;
    private BufferedImage vanilla_image;
    
    private BufferedImage watermark;
    
    private Corner corner = Corner.BOTTOM_RIGHT;
    
    public enum Corner {
        TOP_LEFT, TOP_RIGHT ,BOTTOM_LEFT ,BOTTOM_RIGHT;
    }
    
    
    public ImagePanel() {
        try {
            vanilla_image = ImageIO.read(new URL("https://i.imgur.com/b29ZxpT.png"));
            watermark = ImageIO.read(new URL("https://i.imgur.com/0VRQas2.png"));
        } catch (MalformedURLException ex) {
            Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo cargar una imagen.");
            return;
        } catch (IOException ex) {
            Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo cargar una imagen.");
            return;
        }
        image = UtilsPractica5.clonarImagen(vanilla_image);
    }

    public void setCorner(Corner corner) {
        this.corner = corner;
        this.repaint();
    }
    
    private void drawWatermark(Graphics g) {
        // calculates the coordinate where the image is painted
        int x, y;
        
        switch (this.corner) {
            case TOP_LEFT:
                x = 0;
                y = 0;
                break;
            case TOP_RIGHT:
                x = vanilla_image.getWidth() - watermark.getWidth();
                y = 0;
                break;
            case BOTTOM_LEFT:
                x = 0;
                y = vanilla_image.getHeight() - watermark.getHeight();
                break;
            case BOTTOM_RIGHT:
                x = vanilla_image.getWidth() - watermark.getWidth();
                y = vanilla_image.getHeight() - watermark.getHeight();
                break;
            default:
                throw new AssertionError();
        }
        
        g.drawImage(watermark, x, y, null);
    }
    
    public void setColorChannels(boolean c_red, boolean c_green, boolean c_blue) {
        this.image = UtilsPractica5.seleccionarComponentes(vanilla_image, c_red, c_green, c_blue);
        this.repaint();
    }
    
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
        drawWatermark(g);
    }
}
