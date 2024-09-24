import java.awt.*;
import java.util.*;

public class RandomGraphics {
    private int x;
    private int y;
    private int width;
    private int height;

    public RandomGraphics(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    // Draws the 2x2 grid
    public void drawGrid(Graphics g){
        g.drawRect(x, y, width, height);
        g.drawLine(x + width / 2, y, x + width / 2, y + height); // Vertical line
        g.drawLine(x, y + height / 2, x + width, y + height / 2); // Horizontal line
    }


}