import java.io.PrintStream;
import java.sql.Time;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Generator r1 = new Generator(15, 6, 1);
        Generator r2 = new Generator(15,6,12);
        System.out.println("Usual version");
        long time = System.currentTimeMillis();
        r1.usualGenerate();
        System.out.println("Time - " + (time - System.currentTimeMillis()));

        System.out.println(r1.getResult());
        //r1.printArrays();
        System.out.println("Parallel version");
        time = System.currentTimeMillis();
        r2.parallelGenerate();
        System.out.println("Time - " + (time - System.currentTimeMillis()));

        System.out.println(r2.getResult());
        //r2.printArrays();
        // System.out.println(r2.getResult());
    }
}
