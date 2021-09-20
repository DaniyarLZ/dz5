package com.company;

public class Main {

    public static void main(String[] args) {
    Hero hero = new Hero();
    hero.setHeroesHealth(300);
    hero.setHeroesDamage(50);
    hero.setSuperAbility("SuperKick");
        System.out.println("Damage = " + hero.getHeroesDamage()
                + " " + "Health = " + hero.getHeroesDamage() +
                " " + hero.getSuperAbility());

        Hero hero1 = new Hero(50.0 , 300);

        Boss boss = new Boss();
        boss.getSaveType("Claws");
        boss.setBossHeath(350);
        boss.getBossDamage(350.0);
        System.out.println("Damage = " + boss.getBossDamage(350.0) + ","
                + " healt lvl = " + boss.getBossHeath() + "," +
                " Uses - " + boss.getSaveType("Claws"));

        Boss boss1 = new Boss(350, 40 , "claws"
        );
    }
}
