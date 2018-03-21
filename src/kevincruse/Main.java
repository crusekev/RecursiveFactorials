package kevincruse;

public class Main {

    public static void main(String[] args) {
        fact(20);
    }

    public static long fact(long n) {
        long result;
        if (n == 0) {
            return 1;
        }
        result = fact(n - 1) * n;
        System.out.println(result);
        return result;
    }
}