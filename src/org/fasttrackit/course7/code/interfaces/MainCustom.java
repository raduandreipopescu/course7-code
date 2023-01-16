package org.fasttrackit.course7.code.interfaces;

public class MainCustom {
    public static void main(String[] args) {
        Company myCompany = new Company("File Transfer Protocol", new McDonalds(5));
        Company anotherCompany = new Company("Another Company", new KFC(7));

        myCompany.getFoodProvider().addMoreQuantity(6);
        anotherCompany.getFoodProvider().addMoreQuantity(2);
    }
}
