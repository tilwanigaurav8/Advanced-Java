import java.awt.*;
import java.awt.event.*;

import javax.swing.event.ChangeEvent;

public class Colors extends Canvas{
    private Color color;
    private Boolean rectangular;
    public void Colors(){
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me){
                change();
            }
        });
        rectangular=false;
        setSize(100,100);
        change();
    }
}
