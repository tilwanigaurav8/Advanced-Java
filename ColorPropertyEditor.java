import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

public class ColorPropertyEditor extends PropertyEditorSupport {
    private Color value;

    @Override
    public String getAsText() {
        return value.toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        value = Color.decode(text);
    }

    @Override
    public void paintValue(Graphics gfx, Rectangle box) {
        gfx.setColor(value);
        gfx.fillRect(box.x, box.y, box.width, box.height);
    }

    @Override
    public Component getCustomEditor() {
        return null; // Use default editor
    }

    @Override
    public boolean supportsCustomEditor() {
        return false;
    }
}
