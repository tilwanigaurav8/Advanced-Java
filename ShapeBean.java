import java.awt.Color;
import java.awt.Graphics;

public class ShapeBean {
    private Color backgroundColor;
    private Color foregroundColor;
    private int size;

    public ShapeBean() {
        backgroundColor = Color.WHITE;
        foregroundColor = Color.BLACK;
        size = 50;
    }

    public void drawShape(Graphics g, int x, int y) {
        g.setColor(backgroundColor);
        g.fillRect(x, y, size, size);
        g.setColor(foregroundColor);
        g.drawRect(x, y, size, size);
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
