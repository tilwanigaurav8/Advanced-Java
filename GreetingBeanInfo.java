import java.beans.*;

public class GreetingBeanInfo extends SimpleBeanInfo {
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor width = new PropertyDescriptor("width", GreetingBeanInfo.class);
            PropertyDescriptor height = new PropertyDescriptor("height", GreetingBeanInfo.class);
            PropertyDescriptor greeting = new PropertyDescriptor("greeting", GreetingBeanInfo.class);
            PropertyDescriptor backgroundColor = new PropertyDescriptor("backgroundColor", GreetingBeanInfo.class);
            PropertyDescriptor foregroundColor = new PropertyDescriptor("foregroundColor", GreetingBeanInfo.class);
            PropertyDescriptor pd[] = { width, height, greeting, backgroundColor, foregroundColor };
            return pd;
        } catch (Exception e) {

        }
        return null;
    }
}
