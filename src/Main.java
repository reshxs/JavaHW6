import equation.QuadraticEquation;
import generator.IntGenerator;
import generator.RandomIntGenerator;
import generator.SerialIntGenerator;
import generator.TimeBasedIntGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n\n\n");
        demoQuadraticEquation();
        System.out.print("\n\n\n");
        demoIntGenerator();
    }

    public static void demoQuadraticEquation(){
        var firstEq = new QuadraticEquation(2, 2, 5);
        System.out.println(firstEq);
        System.out.println(firstEq.isQuadratic());

        var secondEq = new QuadraticEquation(0, 2, 2);
        System.out.println(secondEq);
        System.out.println(secondEq.isQuadratic());

        var thirdEq = new QuadraticEquation(2, 0 , 2);
        System.out.println(thirdEq);
        System.out.println(thirdEq.isQuadratic());

        var fourthEq = new QuadraticEquation(2, 2, 0);
        System.out.println(secondEq);
        System.out.println(fourthEq.isQuadratic());
    }

    public static void demoIntGenerator(){
        IntGenerator[] generators = {
                new RandomIntGenerator(),
                new TimeBasedIntGenerator(),
                new SerialIntGenerator(),
        };

        try {
            for (IntGenerator generator : generators) {
                System.out.println(generator.getName());
                for (int i = 0; i < 5; i++) {
                    System.out.println(generator.nextPositive());
                    Thread.sleep(1); // Ждем по миллисекунде чтобы TimeBasedGenerator вернул разные числа
                    System.out.println(generator.nextNegative());
                    Thread.sleep(1);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}