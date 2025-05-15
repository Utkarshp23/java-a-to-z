

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

    //behavior parameterization
    public void methodWithParameter(MyFunctionalInterface myFunc) {
        myFunc.myMethod();
    }

    public static void main(String[] args) {
        //1.
        // Using lambda expression to implement the functional interface
        // MyFunctionalInterface myFunc = () -> System.out.println("Hello from the functional interface class!");
        // myFunc.myMethod();

        //2.
        // FunctionalInterface1 obj = new FunctionalInterface1();
        // MyFunctionalInterface myfunc2 = obj::methodInClass;
        // myfunc2.myMethod();

        //3.
        // Behavior parameterization
        FunctionalInterface1 obj2 = new FunctionalInterface1();
        obj2.methodWithParameter(() -> System.out.println("Hello from Behavior parameterization!"));
    }

}
