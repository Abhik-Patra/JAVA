package application;

import exceptions.NonEligibleException;

public class Citizen {
    private String name;
    private String id;
    private String country;
    private String sex;
    private String maritalStatus;
    private double annualIncome;

    public Citizen(String name, String id, String country, String sex, String maritalStatus, double annualIncome) throws NonEligibleException {
        this.name = name;
        this.id = id;
        this.country = country;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.annualIncome = annualIncome;
        
        if (this.country != "India" && this.age() < 18) {
            throw new NonEligibleException("Citizen is not eligible due to age and country");
        }
    }

    private int age() {
        // calculate age based on ID or birthdate
        // return age
        return 0;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getSex() {
        return sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", country='" + country + '\'' +
                ", sex='" + sex + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", annualIncome=" + annualIncome +
                '}';
    }
}
