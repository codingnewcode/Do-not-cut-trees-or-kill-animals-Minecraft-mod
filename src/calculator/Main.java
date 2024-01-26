package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        Calculator myCalculator1 = new Calculator();

        myCalculator1.run(myScanner);

    }
}
