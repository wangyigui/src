import java.math.BigInteger;

public class bigIntegerTest {
    public static void main(String[] args) {
        int num = 100;
        //整型数组
        int[] resultInt = new int[100];
        resultInt[0] = 0;
        resultInt[1] = 1;
        //长整型数组
        long[] resultLong = new long[100];
        resultLong[0] = 0L;
        resultLong[1] = 1L;
        //BigInteger数组
        BigInteger[] resultBigInteger = new BigInteger[100];
        resultBigInteger[0] = BigInteger.ZERO;
        resultBigInteger[1] = BigInteger.ONE;
        for (int i = 2; i < num; i++) {
            resultInt[i] = resultInt[i - 1] + resultInt[i - 2];
            resultLong[i] = resultLong[i - 1] + resultLong[i - 2];
            resultBigInteger[i] = resultBigInteger[i - 1].add(resultBigInteger[i - 2]);
        }
        System.out.println("--------------------用整型来存储数值的结果！---------------------");
        for (int i = 0; i < resultInt.length; i++) {
            System.out.println("resultInt[" + i + "] = "+ resultInt[i]);
        }
        System.out.println("--------------------用长整型来存储数值的结果！---------------------");
        for (int i = 0; i < resultLong.length; i++) {
            System.out.println("resultLong[" + i + "] = "+ resultLong[i]);
        }
        System.out.println("--------------------用BigInteger来存储数值的结果！---------------------");
        for (int i = 0; i < resultBigInteger.length; i++) {
            System.out.println("resultBigInteger[" + i + "] = "+ resultBigInteger[i]);
        }
    }
}
