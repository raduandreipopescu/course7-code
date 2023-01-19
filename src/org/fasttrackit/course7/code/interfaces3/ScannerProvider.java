package org.fasttrackit.course7.code.interfaces3;

import java.util.Scanner;

public class ScannerProvider implements DataProvider {
    private int length;

    public ScannerProvider(int length) {
        this.length = length;
    }

    @Override
    public String[] providedData() {
        Scanner scanner = new Scanner(System.in);
        String[] result = new String[length];
        for (int index = 0; index < length; index++) {
            String input = scanner.next();
            result[index] = input;
        }
        return result;
    }
}
