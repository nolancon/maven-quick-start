package tus.course.example;

public class Application {
 
    public Application() {
        System.out.println("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (final String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
    }
}