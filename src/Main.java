import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.valueOf(3);
        int count = 2;

        BigInteger c = a;

        while (count < 40) {
            c = b.multiply(BigInteger.valueOf(5)).add(a);
            if (c.testBit(0)) {
                count++;
            }

            a = b;
            b = c;
        }

        System.out.println(c);
    }
}