package kevincruse;

import java.io.*;

public class Main {

    static long fact(int n, long factArray[]) {
        if (n == 0) {
            return 1;
        }
        factArray[n] = n * fact(n - 1, factArray);
        return n * fact(n - 1, factArray);
    }

    public static void main(String[] args) throws IOException {
        PrintWriter outfile = new PrintWriter("data.txt");
        long[] factArray = new long[21];
        fact(20, factArray);
        for (int n = 1; n <= 20; n++) {
            outfile.println(factArray[n]);
        }
        outfile.close();
    }
}