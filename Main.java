import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int num = 1000;
        Random random = new Random();
        UsualMatrix a = new UsualMatrix(num, num);
        UsualMatrix b = new UsualMatrix(num, num);
        ParallelMatrixProduct parallel = new ParallelMatrixProduct(10);
        for (int i = 0; i < num; i++)
            for (int j = 0; j < num; j++) {
                a.setElement(i, j, random.nextInt(100)-50);
                b.setElement(i, j, random.nextInt(100)-50);

            }

        long time = System.currentTimeMillis();
        UsualMatrix r1 = (UsualMatrix) a.product(b);
        System.out.println("Time of usual product: " +
                (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        UsualMatrix r2 = parallel.product(a, b);
        System.out.println("Time of parallel product: " +
                (System.currentTimeMillis() - time));

        System.out.println("r1 equals r2 = " + r1.equals(r2));

    }
}
