package utility;

public interface MyInterface {

    // Abstract method
    void myAbstracMethod();

    default void myMethod() {
        System.out.println("This is a default method in the interface.");
    }

    // static void myStaticMethod() {
    //     System.out.println("This is a static method in the interface.");
    // }
}
