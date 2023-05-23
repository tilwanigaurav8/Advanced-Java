import java.io.Serializable;
import java.beans.*;
import java.awt.*;

public class Shape extends Canvas implements Serializable {
    private int width;
    private int height;
    private Color backgroundColor;
    private Color foregroundColor;

    public Shape() {
        // addMouseListener(new MouseAdapter() {
        // public void mousePressed(MouseEvent me) {
        // changeSize();
        // }
        // });
        setSize(100, 100);
        width = 100;
        height = 100;
        backgroundColor = Color.WHITE;
        foregroundColor = Color.BLACK;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    private void changeSize() {
        setSize(width, height);
    }

    private void changeColor() {
        setBackground(backgroundColor);
        setForeground(foregroundColor);
    }

    public void paint(Graphics g) {
        g.fillOval(0, 0, width - 1, height - 1);
        changeSize();
        changeColor();
    }
}
