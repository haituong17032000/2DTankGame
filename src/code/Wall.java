package code;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Wall extends GameObject {

    private boolean is_background;
    private static BufferedImage background_img;
    private static BufferedImage unbreakable_wall_img; //32x32


    public static void set_unbreakable_wall_img(BufferedImage image) {
        unbreakable_wall_img = image;
    }


    public static void setBackground_img(BufferedImage image) {
        background_img = image;
    }

    public Wall() {

    }

    public Wall(int x, int y, boolean is_background) {
        this.x = x;
        this.y = y;
        this.is_background = is_background;
        this.my_rectangle = new Rectangle(x, y, 32, 32);

    }

    public void update() {

    }

    public void collision() {

    }

    public void drawImage(Graphics2D g2d) {

        if (this.is_background) {

            g2d.drawImage(background_img, x, y, null);

        } else {              //unbreakable wall
            g2d.drawImage(unbreakable_wall_img, x, y, null);
        }

    }
}
