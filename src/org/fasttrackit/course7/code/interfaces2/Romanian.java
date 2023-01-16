package org.fasttrackit.course7.code.interfaces2;

public class Romanian implements Citizen {
    private static final String LANGUAGE = "Romanian";
    private long identifier;
    private String country;
    private String name;
    private double height;
    private double weight;
    private int age;
    private String language;

    public Romanian(long identifier, String country, String name, double height, double weight, int age) {
        this.identifier = identifier;
        this.country = country;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String getLanguage() {
        return LANGUAGE;
    }

    @Override
    public long getIdentifier() {
        return identifier;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }
}
