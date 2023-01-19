package org.fasttrackit.course7.code.interfaces3;

public class SomeAlgorithm {
    private DataProvider dataProvider;

    public SomeAlgorithm(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public void getStringsBiggerThan(int biggerThan) {
        for (String string : this.dataProvider.providedData()) {
            if (string.length() > biggerThan) {
                System.out.println(string);
            }
        }
    }
}
