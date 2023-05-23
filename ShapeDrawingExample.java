import java.awt.*;
import javax.swing.*;

public class ShapeDrawingExample extends JFrame {
    private JButton enableButton;
    private JButton disableButton;
    private JPanel shapePanel;

    public ShapeDrawingExample() {
        setTitle("Shape Drawing Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create buttons
        enableButton = new JButton("Enable");
        disableButton = new JButton("Disable");
        
        // Create panel for shapes
        shapePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                // Draw circle
                g.setColor(Color.RED);
                g.fillOval(50, 50, 100, 100);
                
                // Draw waveform
                g.setColor(Color.BLUE);
                int x = 50;
                int y = 200;
                int amplitude = 50;
                int wavelength = 20;
                for (int i = 0; i < getWidth() - 50; i++) {
                    int height = (int) (Math.sin(i / (double) wavelength) * amplitude);
                    g.drawLine(x + i, y, x + i, y + height);
                }
            }
        };
        
        // Set layout and add components
        setLayout(new BorderLayout());
        add(enableButton, BorderLayout.NORTH);
        add(disableButton, BorderLayout.SOUTH);
        add(shapePanel, BorderLayout.CENTER);
        
        // Add button action listeners
        enableButton.addActionListener(e -> {
            shapePanel.setEnabled(true);
            shapePanel.repaint();
        });
        
        disableButton.addActionListener(e -> {
            shapePanel.setEnabled(false);
            shapePanel.repaint();
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ShapeDrawingExample example = new ShapeDrawingExample();
            example.setVisible(true);
        });
    }
}
