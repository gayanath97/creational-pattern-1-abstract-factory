package factory;

import button.Button;
import button.MacOsButton;
import checkbox.Checkbox;
import checkbox.MacOsCheckbox;

public class MacOsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
