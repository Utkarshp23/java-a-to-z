package utility;

public interface SimpleInterface {
    default void myMethod() {
        System.out.println("This is a default method in the interface.");
    }
}
