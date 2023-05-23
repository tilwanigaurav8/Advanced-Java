import java.io.Serializable;
import java.beans.*;
import java.awt.*;
import java.awt.event.*;

public class Greeting extends Canvas implements Serializable {
    private int width;
    private int height;
    private String greeting;
    private Color backgroundColor;
    private Color foregroundColor;

    public Greeting() {
        // addMouseListener(new MouseAdapter() {
        // public void mousePressed(MouseEvent me) {
        // changeSize();
        // changeColor();
        // }
        // });
        greeting = "Hi";
        width = 100;
        height = 100;
        foregroundColor = Color.BLACK;
        backgroundColor = Color.WHITE;
        // changeSize();
        // changeColor();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getGreeting() {
        return greeting;
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

    public void setGreeting(String greeting) {
        this.greeting = greeting;
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
        g.drawString(greeting, 10, 10);
        changeSize();
        changeColor();
    }
}