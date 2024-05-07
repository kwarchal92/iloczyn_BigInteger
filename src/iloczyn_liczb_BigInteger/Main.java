package iloczyn_liczb_BigInteger;

import java.math.BigInteger;

class SilniaBig{
    public static BigInteger silnia(int num)
    {
        BigInteger wynik = BigInteger.ONE;

        for (int i = 1; i <= num; i++)
            wynik = wynik.multiply(BigInteger.valueOf(i));
            return wynik;
    }
}
public class Main {
    public static void main(String[] args)
    {
        System.out.print("100! = ");
        System.out.print(SilniaBig.silnia(100));
        System.out.print(".");
    }
}
