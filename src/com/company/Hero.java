package com.company;

public class Hero {
    private int heroesHP;
    private double heroesDG;
    private String superAbility;

    public Hero(){}

    public Hero(double heroesDamage, int heroesHealth){
        this.heroesHP=heroesHealth;
        this.heroesDG=heroesDamage;
    }

    public int getHeroesHealth() {
        return heroesHP;
    }

    public void setHeroesHealth(int heroesHealth) {
        this.heroesHP = heroesHealth;
    }

    public double getHeroesDamage() {
        return heroesDG;
    }

    public void setHeroesDamage(double heroesDamage) {
        this.heroesDG = heroesDamage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }
}
