package com.company;

public class NewFeatureTester {

    final static String solutation = "Ni hao ";

    public static void main(String[] args) {
        NewFeatureTester tester = new NewFeatureTester();

        MathOperation addition = (int a,int b) -> a+b;

        MathOperation subtraction = (a,b) ->a -b;

        MathOperation multiplication = (int a, int b) -> {return  a * b;};

        MathOperation division = (int a, int b) -> a/b;

        System.out.println("10 + 5 = "+ tester.operation(10,5,addition));

        System.out.println("10 - 5 = "+ tester.operation(10,5,subtraction));

        System.out.println("10 * 5 = "+ tester.operation(10,5,multiplication));

        System.out.println("10 / 5 = "+ tester.operation(10,5,division));

        GreetingService greetService1 = msg -> System.out.println("hello "+msg);

        GreetingService greetingService2 = (msg -> System.out.println("hi  "+msg));

        GreetingService greetingService3 = msg -> System.out.println(solutation + msg);

        greetingService3.sayMsg(" Ike");

        greetService1.sayMsg(" zhang ");
        greetingService2.sayMsg(" xiaoke _");

    }
    interface MathOperation {
        int operation(int a,int b);
    }

    interface GreetingService{
        void sayMsg(String msg);
    }

    private int operation(int a,int b,MathOperation mathOperation) {
        return mathOperation.operation(a,b);
    }
}
