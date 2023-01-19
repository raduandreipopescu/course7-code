package org.fasttrackit.course7.code.interfaces3;

public class ManualProvider implements DataProvider {
    private int length;

    public ManualProvider(int length) {
        this.length = length;
    }

    @Override
    public String[] providedData() {
        return new String[]{"ShortWord", "VeryLongWord", "ExtremelyLongWord"};
    }
}
