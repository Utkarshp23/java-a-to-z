

import java.lang.FunctionalInterface;

public class FunctionalInterface1 {
    // Functional interface with a single abstract method
    @FunctionalInterface
    interface MyFunctionalInterface {
        void myMethod();
    }

    public void methodInClass() {
        System.out.println("This is a method in the functional interface.");
    }

    public static void main(String[] args) {
        // Using lambda expression to implement the functional interface
        MyFunctionalInterface myFunc = () -> System.out.println("Hello from the functional interface class!");
        myFunc.myMethod();

        FunctionalInterface1 obj = new FunctionalInterface1();

        // Using method reference to refer to a method in the class
        MyFunctionalInterface myfunc2 = obj::methodInClass;
        myfunc2.myMethod();

        // Behavior parameterization
        
    }

}
