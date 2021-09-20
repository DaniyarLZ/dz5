package com.company;
public class Boss {
    private int bossHeath;
    private String saveType;
    private double getbossDamage;

    public Boss(){}

    public Boss(int bossHeath, double bossDamage, String
            saveType) {
        this.getbossDamage = bossDamage;
        this.bossHeath = bossHeath;
        this.saveType = saveType;
    }

    public int getBossHeath() {
        return bossHeath;
    }

    public void setBossHeath(int bossHeath) {
        this.bossHeath = bossHeath;
    }

    public String getSaveType(String claws) {
        return saveType;
    }

    public void setSaveType(String saveType) {
        this.saveType = saveType;
    }

    public double getBossDamage(double v) {
        return getbossDamage;
    }

    public String getSaveType() {
        return saveType;
    }

    public double getGetbossDamage() {
        return getbossDamage;
    }

    public void setGetbossDamage(double getbossDamage) {
        this.getbossDamage = getbossDamage;
    }

    public void setBossDamage(double bossDamage) {
        this.getbossDamage = bossDamage;
    }
}
