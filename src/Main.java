import Application.Application;
import factory.MacOsFactory;
import factory.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println("Hello "+osName+" user!");
        Application app = configureApplication();
        app.paint();

    }
    public static Application configureApplication() {
        Application app;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            app = new Application(new MacOsFactory());
        } else {
            app = new Application(new WindowsFactory());
        }
        return app;
    }
}