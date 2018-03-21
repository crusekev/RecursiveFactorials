package kevincruse;

import java.io.*;

public class Main {

    public static long fact(long n, long factArray[], int i) {
        long result;
        if (n == 0) {
            return 1;
        }
        result = n * fact(n - 1, factArray, ++i);
        factArray[i] = result;
        return result;
    }

    public static void main(String[] args) throws IOException {
        PrintWriter outfile = new PrintWriter("data.txt");
        long[] factArray = new long[21];
        int i = 0;
        fact(20, factArray, i);
        for (i = 1; i <= 20; i++) {
            outfile.println(factArray[i]);
        }
        outfile.close();
    }
}