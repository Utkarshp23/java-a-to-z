import utility.MyInterface;
import utility.SimpleInterface;

public class DefaultAndStaticMethods {

    public static void main(String[] args){
        //MyInterface.myStaticMethod();

        //1.
        // MyInterface myInf = ()-> {            
        //         System.out.println("This is an overridden default method in the anonymous class.");            
        // };
        // myInf.myAbstracMethod();


        //2.
        // MyInterface myInf2 = new MyInterface() {
        //     @Override
        //     public void myAbstracMethod() {
        //         System.out.println("This is an overridden abstract method in the anonymous class.");
        //     }
        // };

        //3.
        // SimpleInterface simpleLambda = () -> {
        //     System.out.println("This is an overridden default method in the lambda expression.");
        // };
        SimpleInterface simple = new SimpleInterface() {
            @Override
            public void myMethod() {
                System.out.println("This is an overridden default method in the anonymous class.");
            }
        };
    }
}
