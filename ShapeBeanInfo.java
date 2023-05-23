import java.beans.*;;

public class ShapeBeanInfo extends SimpleBeanInfo {
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor width = new PropertyDescriptor("width", ShapeBeanInfo.class);
            PropertyDescriptor height = new PropertyDescriptor("height", ShapeBeanInfo.class);
            PropertyDescriptor backgroundColor = new PropertyDescriptor("backgroundColor", ShapeBeanInfo.class);
            PropertyDescriptor foregroundColor = new PropertyDescriptor("foregroundColor", ShapeBeanInfo.class);
            PropertyDescriptor pd[] = { width, height, backgroundColor, foregroundColor };
            return pd;
        } catch (Exception e) {

        }
        return null;
    }
}