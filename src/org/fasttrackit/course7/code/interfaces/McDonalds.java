package org.fasttrackit.course7.code.interfaces;

public class McDonalds implements FoodProvider {
    private static final String NAME_OF_PROVIDER = "McDonalds";
    private static int numberOfEmployees;
    private int quantityNeeded;
    private int bonusPoints;

    public McDonalds(int quantityNeeded) {
        System.out.println("Welcome to McDonalds!");
        System.out.println("You received 5 bonus points!");
        this.quantityNeeded = quantityNeeded;
        this.bonusPoints = 5;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int quantityNeededForDelivery() {
        return 0;
    }

    @Override
    public int numberOfEmployees() {
        return 0;
    }

    @Override
    public void addMoreQuantity(int extraQuantity) {
        this.quantityNeeded += extraQuantity;
        System.out.println("McDonalds thanks you for the extra order!");
        System.out.println("You received 10 extra bonus points!");
        this.bonusPoints += 10;
    }
}
