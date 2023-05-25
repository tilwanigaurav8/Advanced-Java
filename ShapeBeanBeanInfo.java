import java.beans.*;

public class ShapeBeanBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor backgroundColor = new PropertyDescriptor("backgroundColor", ShapeBean.class);
            PropertyDescriptor foregroundColor = new PropertyDescriptor("foregroundColor", ShapeBean.class);
            PropertyDescriptor size = new PropertyDescriptor("size", ShapeBean.class);

            backgroundColor.setPropertyEditorClass(ColorPropertyEditor.class);
            foregroundColor.setPropertyEditorClass(ColorPropertyEditor.class);
            size.setPropertyEditorClass(SizePropertyEditor.class);

            return new PropertyDescriptor[]{backgroundColor, foregroundColor, size};
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }

        return null;
    }
}
